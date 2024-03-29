package de.tech4kek.computer;
import de.tech4kek.common.Address;

import java.sql.*;
import de.tech4kek.storage.DatabaseConnection;

public class ComputerFunctions {
    //static so you can use the function, without creating an object
    //loads all computers from the database and returns an array of computers
    //the array can be printed on the webpage
    public static Computer[] loadComputer(){

        Connection theConnection = DatabaseConnection.getInstance().GetmyConnection();
        int number = 0;

        try {
            Statement myStmt = theConnection.createStatement();
            String sqlprods = "select * from product";


            ResultSet RSProducts = myStmt.executeQuery(sqlprods);

            while (RSProducts.next()) {

                number = number + 1;

            }


            }catch (SQLException e) {
                e.printStackTrace();
            }

        Computer TheArray[] = new Computer[number];
        for(int i = 0; i< number; i++){
            TheArray[i] = new Computer();
        }

        try {
            Statement myStmt = theConnection.createStatement();
            String sqlprods = "select * from product";


            ResultSet RSProducts = myStmt.executeQuery(sqlprods);

            int counter = 0;

            while(RSProducts.next()){

                TheArray[counter].setManufacturerOfComputer(new Manufacturer());
                TheArray[counter].getManufacturerOfComputer().setManufacturerAddress(new Address());
                TheArray[counter].setComputerdetails(new Computerdetails());
                TheArray[counter].setItemId(RSProducts.getInt("productId"));
                TheArray[counter].setOnStock(RSProducts.getInt("OnStock"));

                counter= counter +1;
            }
/*
            while(RSProducts.next()) {

                TheArray[counter].getM_ManufacturerOfComputer().setM_ManPhoneNumber(manPhoneNum);
                TheArray[counter].getM_ManufacturerOfComputer().setM_Agent(agent);
                TheArray[counter].getM_ManufacturerOfComputer().setM_ManName(agentName);

                TheArray[counter].getM_ManufacturerOfComputer().getM_AddressOfMan().setM_ZIP(zip);
                TheArray[counter].getM_ManufacturerOfComputer().getM_AddressOfMan().setM_Street(street);
                TheArray[counter].getM_ManufacturerOfComputer().getM_AddressOfMan().setM_HouseNr(houseNr);
                TheArray[counter].getM_ManufacturerOfComputer().getM_AddressOfMan().setM_Country(country);
                TheArray[counter].getM_ManufacturerOfComputer().getM_AddressOfMan().setM_City(city);
            }
*/
            counter = 0;
            int tempnumber = 1;

            String SQLTEMP = null;
            ResultSet RSTemp = null;

            for (int i =0; i < number; i++){

                SQLTEMP = "SELECT * FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +tempnumber +" and property.Name = 'detailname'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                TheArray[counter].getComputerdetails().setDetailName(RSTemp.getString("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +tempnumber +" and property.name = 'price'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                TheArray[counter].getComputerdetails().setPrice(RSTemp.getDouble("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +tempnumber +" and property.name = 'description'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                TheArray[counter].getComputerdetails().setDescription(RSTemp.getString("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +tempnumber +" and property.name = 'cpuclock'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                TheArray[counter].getComputerdetails().setCpuClock(RSTemp.getDouble("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +tempnumber +" and property.name = 'coreamount'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                TheArray[counter].getComputerdetails().setCpuCoreAmount(RSTemp.getInt("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +tempnumber +" and property.name = 'cpuname'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                TheArray[counter].getComputerdetails().setCpuName(RSTemp.getString("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +tempnumber +" and property.name = 'cputhreadamount'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                TheArray[counter].getComputerdetails().setCpuThreadAmount(RSTemp.getInt("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +tempnumber +" and property.name = 'gpuname'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                TheArray[counter].getComputerdetails().setGpu(RSTemp.getString("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +tempnumber +" and property.name = 'gpuclock'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                TheArray[counter].getComputerdetails().setGpuClock(RSTemp.getDouble("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +tempnumber +" and property.name = 'ramname'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                TheArray[counter].getComputerdetails().setM_Ram(RSTemp.getString("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +tempnumber +" and property.name = 'ramsize'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                TheArray[counter].getComputerdetails().setRamSize(RSTemp.getInt("Value"));

                SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +tempnumber +" and property.name = 'vramamount'";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                TheArray[counter].getComputerdetails().setVramAmount(RSTemp.getInt("Value"));



                SQLTEMP = "Select * From address where addressId = (SELECT Value FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +tempnumber +" and property.name = 'pcmanuaddressid')";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                TheArray[counter].getManufacturerOfComputer().getManufacturerAddress().setCity(RSTemp.getString("City"));
                TheArray[counter].getManufacturerOfComputer().getManufacturerAddress().setCountry(RSTemp.getString("Country"));
                TheArray[counter].getManufacturerOfComputer().getManufacturerAddress().setHouseNumber(RSTemp.getString("Number"));
                TheArray[counter].getManufacturerOfComputer().getManufacturerAddress().setStreet(RSTemp.getString("Street"));
                TheArray[counter].getManufacturerOfComputer().getManufacturerAddress().setZip(RSTemp.getInt("Zipcode"));


                SQLTEMP = "Select * From account where accountId = (SELECT Value FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +tempnumber +" and property.name = 'pcmanuaddressid')";
                RSTemp = myStmt.executeQuery(SQLTEMP);
                RSTemp.next();
                TheArray[counter].getManufacturerOfComputer().setManufacturerAgent(RSTemp.getString("Email"));
                TheArray[counter].getManufacturerOfComputer().setManufacturerName(RSTemp.getString("FirstName") +" "+ RSTemp.getString("LastName"));



                tempnumber = tempnumber +1;
                counter= counter +1;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

            return TheArray;
    }
/*
    public static Computer delComputer(Warehouse TheWarehouse, int ID){
        Computer Anchor = TheWarehouse.getFirstComputer();
        Computer Placeholder = null;
        Computer isDeleted = null;

        while (Anchor.getM_NextComputer() != null){

            if(Anchor.getM_NextComputer().getM_ItemId() == ID){
                isDeleted = Anchor.getM_NextComputer();
                Placeholder = Anchor.getM_NextComputer().getM_NextComputer();
                Anchor.setM_NextComputer(Placeholder);
                System.out.println("Element Entfernt");
                break;
            }
            Anchor = Anchor.getM_NextComputer();
        }

        if(isDeleted == null){
            System.out.println("Element nicht vorhanden");
        }

    return isDeleted;
    };
*/

    public static Computer[] searchComputer(String detailname){  //search for name

        int anzahlErg = 0;

        Connection theConnection = DatabaseConnection.getInstance().GetmyConnection();

        try {
            Statement myStmt = theConnection.createStatement();
            String sqlprods = "select * from product WHERE ProdName like '%" +detailname +"%'";
            ResultSet RSProducts = myStmt.executeQuery(sqlprods);

            while (RSProducts.next()) {

                anzahlErg = anzahlErg + 1;

            }


        }catch (SQLException e) {
            e.printStackTrace();
        }

        int produktID[] = new int[anzahlErg];

        try {
            Statement myStmt = theConnection.createStatement();
            String sqlprods = "select * from product WHERE ProdName like '%" +detailname +"%'";
            ResultSet RSProducts = myStmt.executeQuery(sqlprods);

            int number = 0;

            while (RSProducts.next()) {

            produktID[number] = RSProducts.getInt("productId"); //Die ProduktID's der Ergebnisse werden in array gefüllt
            number = number +1;

            }


        }catch (SQLException e) {
            e.printStackTrace();
        }

        Computer Ergebnisse[] = new Computer[anzahlErg];
        for(int i = 0; i< anzahlErg; i++){
            Ergebnisse[i] = new Computer();
        }


        try{


            Statement myStmt = theConnection.createStatement();






            for (int i =0; i < anzahlErg; i++){
                Ergebnisse[i].setManufacturerOfComputer(new Manufacturer());
                Ergebnisse[i].getManufacturerOfComputer().setManufacturerAddress(new Address());
                Ergebnisse[i].setComputerdetails(new Computerdetails());
                Ergebnisse[i].setItemId(produktID[i]);

            }


            System.out.println("ok");


        String SQLTEMP = null;
        ResultSet RSTemp = null;
        int counter = 0;

        for (int i =0; i < anzahlErg; i++){

            SQLTEMP = "SELECT * FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +produktID[i] +" and property.Name = 'detailname'";
            RSTemp = myStmt.executeQuery(SQLTEMP);
            RSTemp.next();
            Ergebnisse[counter].getComputerdetails().setDetailName(RSTemp.getString("Value"));

            SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +produktID[i] +" and property.name = 'price'";
            RSTemp = myStmt.executeQuery(SQLTEMP);
            RSTemp.next();
            Ergebnisse[counter].getComputerdetails().setPrice(RSTemp.getDouble("Value"));

            SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +produktID[i] +" and property.name = 'description'";
            RSTemp = myStmt.executeQuery(SQLTEMP);
            RSTemp.next();
            Ergebnisse[counter].getComputerdetails().setDescription(RSTemp.getString("Value"));

            SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +produktID[i] +" and property.name = 'cpuclock'";
            RSTemp = myStmt.executeQuery(SQLTEMP);
            RSTemp.next();
            Ergebnisse[counter].getComputerdetails().setCpuClock(RSTemp.getDouble("Value"));

            SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +produktID[i] +" and property.name = 'coreamount'";
            RSTemp = myStmt.executeQuery(SQLTEMP);
            RSTemp.next();
            Ergebnisse[counter].getComputerdetails().setCpuCoreAmount(RSTemp.getInt("Value"));

            SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +produktID[i] +" and property.name = 'cpuname'";
            RSTemp = myStmt.executeQuery(SQLTEMP);
            RSTemp.next();
            Ergebnisse[counter].getComputerdetails().setCpuName(RSTemp.getString("Value"));

            SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +produktID[i] +" and property.name = 'cputhreadamount'";
            RSTemp = myStmt.executeQuery(SQLTEMP);
            RSTemp.next();
            Ergebnisse[counter].getComputerdetails().setCpuThreadAmount(RSTemp.getInt("Value"));

            SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +produktID[i] +" and property.name = 'gpuname'";
            RSTemp = myStmt.executeQuery(SQLTEMP);
            RSTemp.next();
            Ergebnisse[counter].getComputerdetails().setGpu(RSTemp.getString("Value"));

            SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +produktID[i] +" and property.name = 'gpuclock'";
            RSTemp = myStmt.executeQuery(SQLTEMP);
            RSTemp.next();
            Ergebnisse[counter].getComputerdetails().setGpuClock(RSTemp.getDouble("Value"));

            SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +produktID[i] +" and property.name = 'ramname'";
            RSTemp = myStmt.executeQuery(SQLTEMP);
            RSTemp.next();
            Ergebnisse[counter].getComputerdetails().setM_Ram(RSTemp.getString("Value"));

            SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +produktID[i] +" and property.name = 'ramsize'";
            RSTemp = myStmt.executeQuery(SQLTEMP);
            RSTemp.next();
            Ergebnisse[counter].getComputerdetails().setRamSize(RSTemp.getInt("Value"));

            SQLTEMP = "SELECT* FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +produktID[i] +" and property.name = 'vramamount'";
            RSTemp = myStmt.executeQuery(SQLTEMP);
            RSTemp.next();
            Ergebnisse[counter].getComputerdetails().setVramAmount(RSTemp.getInt("Value"));



            SQLTEMP = "Select * From address where addressId = (SELECT Value FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +produktID[i] +" and property.name = 'pcmanuaddressid')";
            RSTemp = myStmt.executeQuery(SQLTEMP);
            RSTemp.next();
            Ergebnisse[counter].getManufacturerOfComputer().getManufacturerAddress().setCity(RSTemp.getString("City"));
            Ergebnisse[counter].getManufacturerOfComputer().getManufacturerAddress().setCountry(RSTemp.getString("Country"));
            Ergebnisse[counter].getManufacturerOfComputer().getManufacturerAddress().setHouseNumber(RSTemp.getString("Number"));
            Ergebnisse[counter].getManufacturerOfComputer().getManufacturerAddress().setStreet(RSTemp.getString("Street"));
            Ergebnisse[counter].getManufacturerOfComputer().getManufacturerAddress().setZip(RSTemp.getInt("Zipcode"));


            SQLTEMP = "Select * From account where accountId = (SELECT Value FROM property JOIN product_has_property ON property.propertyId = product_has_property.propertyId WHERE product_has_property.productId = " +produktID[i] +" and property.name = 'pcmanuaddressid')";
            RSTemp = myStmt.executeQuery(SQLTEMP);
            RSTemp.next();
            Ergebnisse[counter].getManufacturerOfComputer().setManufacturerAgent(RSTemp.getString("Email"));
            Ergebnisse[counter].getManufacturerOfComputer().setManufacturerName(RSTemp.getString("FirstName") +" "+ RSTemp.getString("LastName"));

            counter= counter +1;
            System.out.println("Element gefunden");
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }


        if(Ergebnisse.length ==0){
            System.out.println("Element nicht vorhanden");
        }

        return Ergebnisse;
    }


}
