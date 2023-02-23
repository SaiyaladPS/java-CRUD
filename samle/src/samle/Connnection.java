/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package samle;
import java.sql.*;
/**
 *
 * @author Saiyalad PHIENSONE
 */
public class Connnection {
   public static Connection connetDB() {
        try{
    Class.forName("org.sqlite.JDBC");
    Connection conn = DriverManager.getConnection("jdbc:sqlite:sample.sql");
    return conn;
} catch (Exception e){
    e.printStackTrace();
}
        return null;
   }
}
