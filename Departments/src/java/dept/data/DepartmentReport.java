/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dept.data;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import dept.bean.DepartmentBean;
import com.depart.DbConnect1;
 
public class DepartmentReport {
 
   public static Connection con = null;
   public static PreparedStatement pr = null;
   public static ResultSet rs=null;
 
 public String registerUser(DepartmentBean registerBean)
 {
 String Category = registerBean.getCategory();
 String Cname = registerBean.getCname();
 String Pname = registerBean.getPname();
 String damageKind = registerBean.getdamageKind();
 
 
  
 
 try
 {
 con = DbConnect1.getConnection();
 String query = "insert into report(Category,Cname,Pname,Kind) values (?,?,?,?)"; 
 pr = con.prepareStatement(query); 
            pr.setString(1, Category);
            pr.setString(2, Cname);
            pr.setString(3, Pname);
            pr.setString(4, damageKind);

 
 int i= pr.executeUpdate();
 
 if (i!=0)  
 return "successful"; 
 
 }
 catch(SQLException e)
 {
 e.printStackTrace();
 }
 
 return "Error";  
 }}