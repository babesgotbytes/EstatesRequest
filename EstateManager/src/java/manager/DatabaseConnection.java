
package manager;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnection {
   private static Connection conn;
  static{
     try{
    Class.forName("com.mysql.jdbc.Driver");
    String path="jdbc:mysql://localhost:3306/estates";
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
