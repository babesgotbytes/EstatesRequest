/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.access;

import com.report.DbConn;
import java.sql.*;
import javax.servlet.http.HttpSession;

public class UserDAO {
    
    static Connection conn=null;
    static ResultSet rs=null;
    public static boolean exists(UserBean bean) throws SQLException{
       
        
     conn=DbConn.getConnection();
    String sql="select managerid from managers where managerid=?";
    String managerid=bean.getManagerid();
    PreparedStatement ps=conn.prepareStatement(sql);
    ps.setString(1, managerid);
    rs=ps.executeQuery();
    
        return rs.next();
    }
    public static UserBean login(UserBean bean){
        try{
        conn=DbConn.getConnection();
        
        String fname=bean.getFname();
        String sname=bean.getSname();
        String managerid=bean.getManagerid();
        String email=bean.getEmail();
        String password=bean.getPass();
        
        String sql="insert into managers (firstname,lastname,managerid,email,password) values (?,?,?,?,?)";
        
        PreparedStatement ps=conn.prepareStatement(sql);
        ps.setString(1, fname);
        ps.setString(2, sname);
        ps.setString(3, managerid);
        ps.setString(4, email);
        ps.setString(5, password);
        
        int i=ps.executeUpdate();
        if(i>0){
        bean.setValid(true);
        rs.close();
         ps.close();
         conn.close();
        }
        else
        bean.setValid(false);
        rs.close();
         ps.close();
         conn.close();
       }
        catch(Exception e){
        e.printStackTrace();
        }
        return bean;
    }
    public static UserBean register(UserBean bean){
       try{
       conn=DbConn.getConnection();
       
       String managerid=bean.getManagerid();
       String password=bean.getPass();
       
       String sql="select * from managers where managerid=? and password=?";
       
       PreparedStatement ps=conn.prepareStatement(sql);
       
       ps.setString(1, managerid);
       ps.setString(2, password);
       
       rs=ps.executeQuery();
       
       if(rs.next()){
       
         String fname=rs.getString("firstname");
         String sname=rs.getString("lastname");
         
         bean.setFname(fname);
         bean.setSname(sname);
         bean.setValid(true);
         
         rs.close();
         ps.close();
         conn.close();
       }
       else{
           bean.setValid(false);
           rs.close();
         ps.close();
         conn.close();
       
       }
       
       }
       catch(Exception e){
       
       e.printStackTrace();
       }
    return bean;
    }
    
}
