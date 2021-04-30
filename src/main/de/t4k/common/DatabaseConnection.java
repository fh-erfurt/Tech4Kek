package main.de.t4k.common;

import java.sql.*;

public class DatabaseConnection {

    public static DatabaseConnection Connect(String url, String user, String password) {

        try {
            Connection myConn = DriverManager.getConnection(url, user, password);
            Statement myStmt = myConn.createStatement();
            String sql = "select * from Tech4Kek.Account";
            ResultSet rs = myStmt.executeQuery(sql);

            while(rs.next()){

                System.out.println(rs.getString("FirstName"));

            }

        }catch (SQLException e){
            e.printStackTrace();
        }





        return null;
    }

}
