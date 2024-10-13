package estm.dsic.Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBconnection {

    private static Connection connection;

   public static  Connection getConnection(){

    if(connection==null){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rmi_banking", "root", "");

            System.out.println("Database connected successfully");

        } catch (Exception e) {

            System.out.print("Database is not connected !!");
        }
    }
        return connection;
  

}

    public static void close(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
