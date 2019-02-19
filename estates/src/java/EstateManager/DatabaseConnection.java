/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstateManager;

import java.sql.*;
/**
 *
 * @author CLARICE
 */
public class DatabaseConnection {
    private static Connection conn;
  static{
     try{
    Class.forName("com.mysql.jdbc.Driver");
    String path="jdbc:mysql://localhost:3306/estate";
    String user="root";
    String pass="";
      conn=DriverManager.getConnection(path,user,pass);
     }
   catch(Exception e){
     e.printStackTrace();
     } 
 } 
  public static Connection getConnection(){
  return conn;
  }
    
}
