package de.tech4kek.common;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import de.tech4kek.cart.Cart;
import de.tech4kek.storage.DatabaseConnection;

public class AccountFunctions {

    //Functions
    /*public void ChangePW(Account ACC) {
        String altPW = "", neuPW = "", helper = "";
        boolean isOK = false;
        Scanner Input = new Scanner(System.in);
        System.out.println("Geben Sie das alte PW ein:");
        altPW = Input.next();

        if (altPW != ACC.m_Password) {
            while (isOK == false) {
                isOK = true;
                if (altPW != ACC.m_Password) {
                    System.out.println("PW ist nicht korrekt:");
                    isOK = false;
                    altPW = Input.next();
                }
            }
        }
        do {
            System.out.println("Geben Sie das neue PW ein:");
            neuPW = Input.next();
            System.out.println("Geben Sie das neue PW erneut ein:");
            helper = Input.next();

            if(neuPW != helper) {
                System.out.println("Passwörter stimmen nicht überein");
            }
        }while(neuPW != helper);
        ACC.SetPassword(neuPW); //or change it in the DB in the future
        System.out.println("Passwort wurde geändert");
    }*/

    public Account Login(String email, String password) {
        Connection theConnection = DatabaseConnection.getInstance().GetmyConnection();

        //create an account object
        Account Result = new Account();
        // define a person to the object
        Result.SetPerson(new Person());
        // define a cart to the object
        Result.setM_TheCart(new Cart());

        Result.GetPerson().setM_TheAddress(new Address());

        try {
            Statement myStmt = theConnection.createStatement();
            String sqlprods = "select * from account JOIN address on account.addressId = address.addressId WHERE Email ='" +email +"' AND Password = '" +password +"'";
            ResultSet RSacc = myStmt.executeQuery(sqlprods);



            while (RSacc.next()) {


                if (RSacc.getString("Email").equals(email) && RSacc.getString("Password").equals(password)) {

                    Result.SetEMail(RSacc.getString("Email"));
                    Result.SetPassword(RSacc.getString("Password"));
                    Result.GetPerson().setM_Firstname(RSacc.getString("FirstName"));
                    Result.GetPerson().setM_Lastname(RSacc.getString("LastName"));
                    Result.SetRole(RSacc.getInt("Role"));

                    Result.GetPerson().getM_TheAddress().setM_ZIP(RSacc.getInt("Zipcode"));
                    Result.GetPerson().getM_TheAddress().setM_Street(RSacc.getString("Street"));
                    Result.GetPerson().getM_TheAddress().setM_HouseNr(RSacc.getString("Number"));
                    Result.GetPerson().getM_TheAddress().setM_Country(RSacc.getString("Country"));
                    Result.GetPerson().getM_TheAddress().setM_City(RSacc.getString("City"));



                    return Result;
                }
                else {
                    System.out.println("Login fehlgeschlagen");
                }
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String Register(String email, String password, String firstname, String lastname, String country, String city, int zipcode, String street, String number) {
        Connection theConnection = DatabaseConnection.getInstance().GetmyConnection();
        //Schau ob acc mit der Email schon existiert
        try {
            Statement myStmt = theConnection.createStatement();
            String sqlprods = "select * from account WHERE Email = '" +email +"'";
            ResultSet RSacc = myStmt.executeQuery(sqlprods);




            while (RSacc.next()) {


                if(RSacc.getString("Email").equals(email)){

                    return "Der Acc ist bereits vorhanden";
                }

            }


        }catch (SQLException e) {
            e.printStackTrace();
        }
        //Füge neuen Eintrag hinzu


        int newAddressID = 0;
        //Insert the address and get its id
        try {
            //Insert new address
            Statement myStmt = theConnection.createStatement();
            String TheInsert = "INSERT INTO address (Country, Zipcode, City, Street, Number) VALUES "
                     +"(" +"'" +country +"'" +", " +zipcode +", " +"'" +city +"'" +", " +"'" +street +"'" +", " +"'" +number +"'" +")";
            myStmt.executeUpdate(TheInsert);

            // get the ID of the inserted row.
            Statement myStmt2 = theConnection.createStatement();
            String sqlprods = "select addressId from address Order By addressId ASC";
            ResultSet RSaddress = myStmt2.executeQuery(sqlprods);

            while (RSaddress.next()) {
                newAddressID = RSaddress.getInt("addressId");
            }


        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }

        //Insert the new acc
        try {

            Statement myStmt = theConnection.createStatement();
            String TheInsert = "INSERT INTO account (FirstName, LastName, Email, Password, Role, addressId) VALUES "
                    +"(" +"'" +firstname +"'" +", " +"'" +lastname +"'" +", " +"'" +email +"'" +", " +"'" +password +"'" +", " +0 +", " +newAddressID +")";
            myStmt.executeUpdate(TheInsert);


            return "Acc wurde erstellt";

        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }

        return "Fehler";
    }



}