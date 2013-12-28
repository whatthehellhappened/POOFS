/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;

/**
 *
 * @author Carmel
 */
public class DBConnect {
    
//                Connection conn = null;
//		String url = "jdbc:mysql://localhost:3306/";
//		String dbName = "poofsubjects";
//		String driver = "com.mysql.jdbc.Driver";
//		String userName = "root"; 
//		String password = "1234";
                
                private static Connection conn;
                public static final String url = "jdbc:mysql://localhost:3306/";
                public static final String driver = "com.mysql.jdbc.Driver";

//    public DBConnect(){
//		try {
//			Class.forName(driver).newInstance();
//			conn = DriverManager.getConnection(url+dbName,userName,password);
//			System.out.println("Connected to the database");
//			conn.close();
//			System.out.println("Disconnected from database");
//		}
//                catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

    public static Connection getConnection(String dbName, String username, String password)
    {
        try
        {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName,username,password);
        } catch(Exception e){System.err.print("Error @ Connection: " + e.getMessage());}
        return conn;
    }
}
