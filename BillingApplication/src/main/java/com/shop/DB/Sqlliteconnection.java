package com.shop.DB;

import java.sql.*;

public class Sqlliteconnection {

    public Connection DBconnection() {
        Connection con = null;
        String url = "jdbc:sqlite:D:/NewBillingapp/Database/Billingdb.db";
        // D:\NewBillingapp\Database
        try {
            con = DriverManager.getConnection(url);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println("DB connection is Failed !!");
        }

        return con;
    }

}
