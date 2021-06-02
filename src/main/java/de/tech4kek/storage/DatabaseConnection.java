package de.tech4kek.storage;

import java.sql.*;

public class DatabaseConnection {

    private static Connection myConnection;
    private static DatabaseConnection instance = null;

    public DatabaseConnection(String url, String user, String password) {

        try (Connection myConn = DriverManager.getConnection(url, user, password)){

           //Zum Testen ob Connection geht
            Statement myStmt = myConn.createStatement();
            String sql = "select * from account";
            ResultSet rs = myStmt.executeQuery(sql);

            while(rs.next()){

                System.out.println(rs.getString("FirstName"));

            }

            myConnection = DriverManager.getConnection(url, user, password);

        }catch (SQLException e){
            e.printStackTrace();
            myConnection = null;
        }


    }

    public Connection GetmyConnection(){
        return myConnection;
    }

    public static DatabaseConnection getInstance() {
        if (instance == null)
            return new DatabaseConnection("jdbc:mysql://localhost:3306/tech4kek", "root", "");
        else
            return instance;
    }
}
