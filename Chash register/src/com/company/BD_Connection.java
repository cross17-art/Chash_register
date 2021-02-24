package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BD_Connection {
    private String url="jdbc:mysql://localhost:3306/chash?autoReconnect=true&useSSL=false";
    private String password="1111";
    private String user_name="root";

    private Connection connection;

    BD_Connection() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
    }

    public Connection getConnetion() throws SQLException {
        if(connection!=null)return connection;

        connection= DriverManager.getConnection(url,user_name,password);
        return connection;
    }




}
