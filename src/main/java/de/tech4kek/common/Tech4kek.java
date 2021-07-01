package de.tech4kek.common;
import de.tech4kek.computer.*;
import de.tech4kek.storage.DatabaseConnection;

import de.tech4kek.cart.*;
import de.tech4kek.billing.*;

import java.sql.*;

//test


public class Tech4kek {

    public static void main(String[] args) {


        //future functions

            //login checks email and password and creates instance for the user
            //creates warehouse instance and inserts product data in the linked list
            //creates cart instance and inserts product data into the linked list
            //user can scroll trough list and select product and count
            //adds selection to cart
            //creates bill and saves it in the DB also prints it for the user

        //Tests:

        // So macht man die connection:   (klasse muss natürlich importet sein)
        Connection theConnection = DatabaseConnection.getInstance().GetmyConnection();

        Computer PC = new Computer();
        Person ThePerson = new Person();
        Account TheACC = new Account();
        TheACC.SetEMail("Jan204@t-online.de");
        TheACC.SetPassword("Techkekerino123");
        TheACC.SetRole(AccountRole.Customer);
        //Set Person Data from DB
        TheACC.SetPerson(ThePerson);
        TheACC.GetPerson().setM_Firstname("Arnold");

        //System.out.println(TheACC.GetEMail());

        //load all entries
        ComputerFunctions TheFunctions = new ComputerFunctions();

        //Zum Rausfinden wie viele Produkte wir haben


        //Computer ComputerListe[] = TheFunctions.loadComputer();



        //System.out.println(ComputerListe[0].getM_ComputerDetails().getM_DetailName());
        //System.out.println(ComputerListe[1].getM_ComputerDetails().getM_DetailName());

       //Computer Suche test
        Computer ComputerErgebnisse[] = TheFunctions.searchComputer("Xtreme");
        for (int i = 0; i < ComputerErgebnisse.length; i++) {

            System.out.println(ComputerErgebnisse[i].getM_ComputerDetails().getM_DetailName());
        }

        AccountFunctions AccF = new AccountFunctions();

        AccF.Register("Jann204@t-online.de", "Penis1", "Lukas", "Arnold", "Penis2", "Penis3", 99869, "Penis4", "Penis5");


        //Hier ein beispiel wie man die Computer reinladen kann
        /*
        try {
            Statement myStmt = theConnection.createStatement();
            String sql = "select * from Product";
            ResultSet rs = myStmt.executeQuery(sql);


            //Kleine Test Ausgabe mit dem ergebnis
            while(rs.next()){

                addComputer(TheWarehouse, "", rs.getInt("productId"), rs.getString("ProdName"),rs.getDouble("Price"), 3, 5, "", 5, "", 500, "",
                        6, 6, "", "", "", 99869, "", "", "", "");

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


        //Ausgabe der Computer
        Computer Anchor = TheWarehouse.getFirstComputer();
        while (Anchor.getM_NextComputer() != null) {
            Anchor = Anchor.getM_NextComputer();
            System.out.println(Anchor.getM_ComputerDetails().getM_Price());
        }


        Computer PC1 = new Computer();
        Computer PC2 = new Computer();
        Computer PC3 = new Computer();

        PC1.setM_ItemId(11);
        PC2.setM_ItemId(22);
        PC3.setM_ItemId(33);

        Computerdetails PC1Details = new Computerdetails();
        Computerdetails PC2Details = new Computerdetails();
        Computerdetails PC3Details = new Computerdetails();

        PC1Details.setM_Price(300);
        PC2Details.setM_Price(200);
        PC3Details.setM_Price(400);

        PC1Details.setM_DetailName("Sony K6");
        PC2Details.setM_DetailName("HP irgendwas");
        PC3Details.setM_DetailName("RAZZAR");

        PC1.setM_ComputerDetails(PC1Details);
        PC2.setM_ComputerDetails(PC2Details);
        PC3.setM_ComputerDetails(PC3Details);

        PC1.setM_StockNumber(4);
        PC2.setM_StockNumber(5);
        PC3.setM_StockNumber(8);

        Cart TheCart = new Cart();
        Cartfunctions.addElement(TheCart, PC1, 3); //number of pc´s
        Cartfunctions.addElement(TheCart, PC2, 2);
        Cartfunctions.addElement(TheCart, PC3, 5);

        System.out.println("pc hat so viele elemente im stock:");
        System.out.println(PC1.getM_StockNumber());
        Cartfunctions.delElement(TheCart, 1);
        System.out.println("pc hat so viele elemente im stock:");
        System.out.println(PC1.getM_StockNumber());

        Element AnchorCart = TheCart.getM_firstElement();
        while (AnchorCart.getM_nextElement() != null) {
            AnchorCart = AnchorCart.getM_nextElement();
            System.out.println(AnchorCart.getM_CountOfComputers());
        }

        System.out.println(TheCart.getM_ElementCount());

        Element ELSucherg = TheCart.getM_firstElement();

       ELSucherg= Cartfunctions.searchElement(TheCart, 22);
        System.out.println(ELSucherg.getM_Computer().getM_ItemId());

        Bill TheBill = new Bill(TheCart, TheACC, 25, 16);
        System.out.println("The price is");
        System.out.println(TheBill.getM_Price());
        TheBill.print_Bill();





        //So übt man db Befehl aus:
        try {
            Statement myStmt = theConnection.createStatement();
            String sql = "select * from account";
            ResultSet rs = myStmt.executeQuery(sql);


            //Kleine Test Ausgabe mit dem ergebnis
            while(rs.next() != false){

                System.out.println(rs.getString("LastName"));

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


 */
    }

}