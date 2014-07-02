package ard;

//import java.sql.Connection;
import com.mysql.jdbc.*;
import com.mysql.*;

import java.sql.DriverManager;

public class ConnectionConfiguration {
    public static final String URL = "jdbc:mysql://localhost:3306/sensor";
    /**
     * In my case username is "root" *
     */
    public static final String USERNAME = "root";
    /**
     * In my case password is "1234" *
     */
    public static final String PASSWORD = "admin";
 
    public static Connection getConnection() {
        Connection connection = null;
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("requesting jdb conn");
            connection = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
 
        return connection;
    }
 
}