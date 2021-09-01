package de.tech4kek.cart;


import de.tech4kek.common.Account;
import de.tech4kek.common.Address;
import de.tech4kek.computer.Computer;
import de.tech4kek.cart.*;
import de.tech4kek.computer.Computerdetails;
import de.tech4kek.computer.Manufacturer;
import de.tech4kek.storage.DatabaseConnection;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cartfunctions {
 //number == How many PC's the customer wants to put in the Cart
    public static Element addElement(Cart TheCart, Computer TheComputer, int number) {
        //gives anchor node
        Element Anchor = TheCart.getFirstElement();

        if (TheComputer.getOnStock() < number)
        {
            System.out.println("Zu wenig Systeme vorhanden");
            return null;
        }

        //moves trough all elements

        while (Anchor.getNextElement() != null){
            Anchor = Anchor.getNextElement();
            if(Anchor.getComputer() == TheComputer){

                Anchor.setM_CountOfComputers(Anchor.getM_CountOfComputers()+number);
                TheComputer.setOnStock(TheComputer.getOnStock()-number);

                return Anchor; //if pc is already existing
            };
        }

        //creates new pc and sets successor null
        Element NewElement = new Element();
        NewElement.setNextElement(null);
        TheComputer.setOnStock(TheComputer.getOnStock()-number);

        NewElement.setComputer(TheComputer);
        NewElement.setM_CountOfComputers(number);

        TheCart.setM_ElementCount(TheCart.getM_ElementCount()+1);

        Anchor.setNextElement(NewElement);
        return NewElement;
    };

    //Is for chaneging the stockcount of an Element in the Cart List


    //Turns the Cart to an Array
    public static Element[] makeArray(Cart TheCart) {

        Element Anchor = TheCart.getFirstElement();

        int counter = 0;
        while (Anchor.getNextElement() != null){
            Anchor = Anchor.getNextElement();
            counter += 1;
        }

        Element CartArray[] = new Element[counter];

        for(int i = 0; i < counter; i++){
            CartArray[i] = new Element();
        }


        Anchor = TheCart.getFirstElement();
        Anchor = Anchor.getNextElement();
        int counter2 = 0;
        while (Anchor != null){

           CartArray[counter2].setM_CountOfComputers(Anchor.getM_CountOfComputers());
           CartArray[counter2].setNextElement(Anchor.getNextElement());
           CartArray[counter2].setComputer(Anchor.getComputer());

            Anchor = Anchor.getNextElement();
            counter2 +=1;
        }

        return CartArray;
    }

    public static Element delNumberOfElements(Cart TheCart, Computer TheComputer, int number){
        Element Anchor = TheCart.getFirstElement();

        int counter = 0;
        while (Anchor.getNextElement() != null){
            Anchor = Anchor.getNextElement();
            counter += 1;
            if(Anchor.getComputer() == TheComputer){

                if(Anchor.getM_CountOfComputers()-number < 0){
                    //less computers in the list then the person wants to remove
                    return null;
                }

                if(Anchor.getM_CountOfComputers()-number == 0){
                    Anchor.setM_CountOfComputers(Anchor.getM_CountOfComputers()-number);
                    TheComputer.setOnStock(TheComputer.getOnStock()+number);
                    delElement(TheCart, counter);
                    return Anchor = TheCart.getFirstElement();
                }


                Anchor.setM_CountOfComputers(Anchor.getM_CountOfComputers()-number);
                TheComputer.setOnStock(TheComputer.getOnStock()+number);

                return Anchor;
            };
        }
        //Element does not exist
        return null;
    }


    public static boolean delElement(Cart TheCart, int Element_Number){
        Element Anchor = TheCart.getFirstElement();
        Element Placeholder = TheCart.getFirstElement();

        if(Element_Number > TheCart.getM_ElementCount() || Element_Number <= 0) {
            System.out.println("Element nicht vorhanden");
            return false; //element is not existing
        }

        for (int i = 0; i < Element_Number; ++i){
            Placeholder = Anchor;
            Anchor = Anchor.getNextElement();
        }

        Placeholder.setNextElement(Anchor.getNextElement());
        Anchor.getComputer().setOnStock(Anchor.getComputer().getOnStock() + Anchor.getM_CountOfComputers());
        Anchor = null;
        TheCart.setM_ElementCount(TheCart.getM_ElementCount()-1);

        return true;
    }

    public static Element searchElement(Cart TheCart, int ItemID){ //search for ItemID
        Element Anchor = TheCart.getFirstElement();
        Element Placeholder = null;
        Boolean isFound = false;

        while (Anchor.getNextElement() != null){
            Anchor = Anchor.getNextElement();

            if(Anchor.getComputer().getItemId() == ItemID){
                Placeholder = Anchor;
                isFound = true;
                System.out.println("Element Gefunden");
                return Placeholder;
            }
        }

        if(!isFound){
            System.out.println("Element nicht Gefunden");
        }

        return null;

    }


    //needs the User acc and the Array version of the shoppingCart
    public static void SaveOrder(Element[] theCart, Account theAcc){

        Connection theConnection = DatabaseConnection.getInstance().GetmyConnection();
        int number = 0;

        //look if there is an order allready
        int AccId = 0;
        int OrderId = 0;

        try {
            Statement myStmt = theConnection.createStatement();
            String sqlacc = "select accountId from account where Email = '" +theAcc.GetEMail() +"'";

            ResultSet RSAccId = myStmt.executeQuery(sqlacc);
            AccId = RSAccId.getInt("accountId");

        }catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            Statement myStmt = theConnection.createStatement();
            String sqlorder = "select * from order where accountId = '" +AccId +"'and Status = 0";

            ResultSet RSorder = myStmt.executeQuery(sqlorder);
            if(RSorder.getString("FirstName") != null){
                // order is there
            OrderId = RSorder.getInt("orderId");
            }


        }catch (SQLException e) {
            e.printStackTrace();
        }

        //if order exists add missing products, if not make a new order

        if(OrderId == 0){
            //Make a new order

            try {
                //add new order
                Statement myStmt = theConnection.createStatement();
                String TheInsert = "INSERT INTO orders (Status, accountId, addressId, FirstName, LastName) VALUES"
                        + "(" + "'" +0 + "'" + ", " + AccId + ", " + "'" + 0 + "'"+"'" +theAcc.GetPerson().getFirstname() +"'" +"'" +theAcc.GetPerson().getLastname() + "'" + ")";
                myStmt.executeUpdate(TheInsert);

                Statement myStmt2 = theConnection.createStatement();
                String sqlorder = "select * from order where accountId = '" +AccId +"' and Status = 0";

                ResultSet RSorder = myStmt2.executeQuery(sqlorder);
                OrderId = RSorder.getInt("orderId");

                //add cart elements
                Statement myStmt3 = theConnection.createStatement();
                for(int i = 0; i <= theCart.length; i++) {


                    String TheInsertofProds = "INSERT INTO product_to_order (ProductCount, orderId, productId) VALUES "
                            + "(" + "'" + theCart[i].getM_CountOfComputers() + "'" + ", " + OrderId + ", " + "'" + theCart[i].getComputer().getItemId() + "'" + ")";
                    myStmt3.executeUpdate(TheInsertofProds);
                }


            }
            // Handle any errors that may have occurred.
            catch (Exception e) {
                e.printStackTrace();
            }

        }
        else{
            //add products to the existing order

            try {
                //del order elements
                Statement myStmt = theConnection.createStatement();
                String TheDelete = "DELETE from product_to_order where orderId ='" +OrderId +"' and Status = 0";

                myStmt.executeUpdate(TheDelete);
                //add cart elements
                Statement myStmt2 = theConnection.createStatement();
                for(int i = 0; i <= theCart.length; i++) {


                    String TheInsert = "INSERT INTO product_to_order (ProductCount, orderId, productId) VALUES "
                            + "(" + "'" + theCart[i].getM_CountOfComputers() + "'" + ", " + OrderId + ", " + "'" + theCart[i].getComputer().getItemId() + "'" + ")";
                    myStmt2.executeUpdate(TheInsert);
                }


            }
            // Handle any errors that may have occurred.
            catch (Exception e) {
                e.printStackTrace();
            }


        }
    }

    public static void DelProdFromOrder(Account theAcc, Computer theComputer ){



    }



    public static Element[] loadOrder(Account theAcc){

        Connection theConnection = DatabaseConnection.getInstance().GetmyConnection();
        int counter = 0;

        //look if there is an order allready
        int AccId = 0;
        int OrderId = 0;

        try {
            Statement myStmt = theConnection.createStatement();
            String sqlacc = "select accountId from account where Email = '" +theAcc.GetEMail() +"'";

            ResultSet RSAccId = myStmt.executeQuery(sqlacc);
            AccId = RSAccId.getInt("accountId");

        }catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            Statement myStmt = theConnection.createStatement();
            String sqlorder = "select * from order where accountId = '" +AccId +"'and Status = 0";

            ResultSet RSorder = myStmt.executeQuery(sqlorder);

            while(RSorder.next()) {

                counter++;
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }

        Element CartArray[] = new Element[counter];

        int prodidArray[] = new int[counter];

        for (int i = 0; i<= counter; i++){

            CartArray[i].setComputer(new Computer());
            prodidArray[i] = 0;

        }

        try {
            Statement myStmt = theConnection.createStatement();
            String sqlorder = "select * from order where accountId = '" +AccId +"'and Status = 0";
            ResultSet RSorder = myStmt.executeQuery(sqlorder);

            OrderId = RSorder.getInt("orderId");

            Statement myStmt2 = theConnection.createStatement();
            String sqlorder2 = "select * from product_to_order where orderId = '" +OrderId +"'";
            ResultSet RSprods = myStmt2.executeQuery(sqlorder);

            counter = 0;

            while(RSprods.next()) {
            prodidArray[counter] = RSorder.getInt("productId");

                CartArray[counter].getComputer().setManufacturerOfComputer(new Manufacturer());
                CartArray[counter].getComputer().getManufacturerOfComputer().setManufacturerAddress(new Address());
                CartArray[counter].getComputer().setComputerdetails(new Computerdetails());
                CartArray[counter].getComputer().setItemId(RSprods.getInt("productId"));
                CartArray[counter].getComputer().setOnStock(RSprods.getInt("OnStock"));

                counter++;
            }

            counter = 0;

            //Load products in Cart

            String SQLTEMP = null;
            ResultSet RSTemp = null;

            while(RSprods.next()) {

                SQLTEMP = "SELECT * FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " + RSprods.getInt("productId") + " and property.Name = 'detailname'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                CartArray[counter].getComputer().getComputerdetails().setDetailName(RSTemp.getString("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " + RSprods.getInt("productId") + " and property.name = 'price'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                CartArray[counter].getComputer().getComputerdetails().setPrice(RSTemp.getDouble("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " + RSprods.getInt("productId") + " and property.name = 'description'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                CartArray[counter].getComputer().getComputerdetails().setDescription(RSTemp.getString("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " + RSprods.getInt("productId") + " and property.name = 'cpuclock'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                CartArray[counter].getComputer().getComputerdetails().setCpuClock(RSTemp.getDouble("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " + RSprods.getInt("productId") + " and property.name = 'coreamount'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                CartArray[counter].getComputer().getComputerdetails().setCpuCoreAmount(RSTemp.getInt("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " + RSprods.getInt("productId") + " and property.name = 'cpuname'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                CartArray[counter].getComputer().getComputerdetails().setCpuName(RSTemp.getString("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " + RSprods.getInt("productId") + " and property.name = 'cputhreadamount'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                CartArray[counter].getComputer().getComputerdetails().setCpuThreadAmount(RSTemp.getInt("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " + RSprods.getInt("productId") + " and property.name = 'gpuname'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                CartArray[counter].getComputer().getComputerdetails().setGpu(RSTemp.getString("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " + RSprods.getInt("productId") + " and property.name = 'gpuclock'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                CartArray[counter].getComputer().getComputerdetails().setGpuClock(RSTemp.getDouble("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " + RSprods.getInt("productId") + " and property.name = 'ramname'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                CartArray[counter].getComputer().getComputerdetails().setM_Ram(RSTemp.getString("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " + RSprods.getInt("productId") + " and property.name = 'ramsize'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                CartArray[counter].getComputer().getComputerdetails().setRamSize(RSTemp.getInt("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " + RSprods.getInt("productId") + " and property.name = 'vramamount'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                CartArray[counter].getComputer().getComputerdetails().setVramAmount(RSTemp.getInt("Value"));


                SQLTEMP = "Select * From address where addressId = (SELECT Value FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " + RSprods.getInt("productId") + " and property.name = 'pcmanuaddressid')";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                CartArray[counter].getComputer().getManufacturerOfComputer().getManufacturerAddress().setCity(RSTemp.getString("City"));
                CartArray[counter].getComputer().getManufacturerOfComputer().getManufacturerAddress().setCountry(RSTemp.getString("Country"));
                CartArray[counter].getComputer().getManufacturerOfComputer().getManufacturerAddress().setHouseNumber(RSTemp.getString("Number"));
                CartArray[counter].getComputer().getManufacturerOfComputer().getManufacturerAddress().setStreet(RSTemp.getString("Street"));
                CartArray[counter].getComputer().getManufacturerOfComputer().getManufacturerAddress().setZip(RSTemp.getInt("Zipcode"));


                SQLTEMP = "Select * From account where accountId = (SELECT Value FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " + RSprods.getInt("productId") + " and property.name = 'pcmanuaddressid')";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                CartArray[counter].getComputer().getManufacturerOfComputer().setManufacturerAgent(RSTemp.getString("Email"));
                CartArray[counter].getComputer().getManufacturerOfComputer().setManufacturerName(RSTemp.getString("FirstName") + " " + RSTemp.getString("LastName"));


                counter = counter + 1;

            }





        }catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            Statement myStmt = theConnection.createStatement();
            String sqlorder = "select * from order where accountId = '" +AccId +"'and Status = 0";
            ResultSet RSorder = myStmt.executeQuery(sqlorder);


            while(RSorder.next()) {
                prodidArray[counter] = RSorder.getInt("productId");
                counter++;
            }


        }catch (SQLException e) {
            e.printStackTrace();
        }


        return CartArray;
    }

}

