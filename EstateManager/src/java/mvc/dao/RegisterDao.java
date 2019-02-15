package mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mvc.bean.EmployeeBean;
import manager.DatabaseConnection;
 
public class RegisterDao {
 
   public static Connection con = null;
   public static PreparedStatement pr = null;
   public static ResultSet rs=null;
 
 public String registerUser(EmpDet registerBean)
 {
 String Name = registerBean.getName();
 String Email = registerBean.getEmail();
 String PhoneNumber = registerBean.getNumber();
 
 
  
 
 try
 {
 con = DatabaseConnection.getConnection();
 String query = "insert into employee( empname,empno,empmail) values ( ?,?,?)"; 
 pr = con.prepareStatement(query); 
 pr.setString(1, Name);
 pr.setString(2, PhoneNumber);
 pr.setString(3, Email);

 
 int i= pr.executeUpdate();
 
 if (i!=0)  
 return "successful"; 
 }
 catch(SQLException e)
 {
 e.printStackTrace();
 }
 
 return "Error";  
 }
 
  public static ArrayList<EmpDet> getEmployee() throws SQLException{
     ArrayList<EmpDet> list=new ArrayList<EmpDet>();
     String sql="select * from employee";
    con= DatabaseConnection.getConnection();
    pr=con.prepareStatement(sql);
    rs=pr.executeQuery();
    
    while(rs.next()){
    EmpDet bean=new EmpDet();
    bean.setName(rs.getString("empname"));
    bean.setNumber(rs.getString("empno"));
    bean.setEmail(rs.getString("empmail"));
    bean.setStatus(rs.getString("emp_status"));
    bean.setId(rs.getInt("empid"));
    list.add(bean);
   }
   return list;
        }
  
   public static ArrayList<EmpDet> getEmp() throws SQLException{
     ArrayList<EmpDet> list=new ArrayList<EmpDet>();
     String sql="select * from employee where emp_status = \"NOT ASSIGNED\"";
    con= DatabaseConnection.getConnection();
    pr=con.prepareStatement(sql);
    rs=pr.executeQuery();
    
    while(rs.next()){
    EmpDet bean=new EmpDet();
    bean.setName(rs.getString("empname"));
    bean.setNumber(rs.getString("empno"));
    bean.setEmail(rs.getString("empmail"));
    bean.setStatus(rs.getString("emp_status"));
    bean.setId(rs.getInt("empid"));
    list.add(bean);
   }
   return list;
        }
}
