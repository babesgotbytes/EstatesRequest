
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.report;

import java.sql.*;
import com.bean.*;
/**
 *
 * @author user
 */
public class UsersDAO {
    static Connection conn=null;
    static ResultSet rs=null;
    static PreparedStatement ps=null;
    
    public static boolean exists(Credentials bean) throws SQLException{
        
    conn=DbConn.getConnection();
    String staffid=bean.getStaffid();
    String sql="select staffid from department where staffid=?";
    ps=conn.prepareStatement(sql);
    ps.setString(1, staffid);
    rs=ps.executeQuery();
   
        return rs.next();
    }
    public static Credentials register(Credentials bean){
        try{
            conn=DbConn.getConnection();
                    
            String fname=bean.getFname();
            String sname=bean.getSname();
            String staffid=bean.getStaffid();
            String email=bean.getEmail();
            String pass=bean.getPass();
            
         String sql1="insert into department (firstname,lastname,staffid,email,password) values (?,?,?,?,?)";
        
        ps=conn.prepareStatement(sql1);
       ps.setString(1,fname);
       ps.setString(2,sname);
       ps.setString(3,staffid);
       ps.setString(4,email);
       ps.setString(5,pass);
       
       int i=ps.executeUpdate();
       if(i>0){
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
     public static Credentials login(Credentials bean){
        
            try{
            conn=DbConn.getConnection();
            String staffid=bean.getStaffid();
            String pass=bean.getPass();
        
         String sql="select * from department where staffid=? and password=?";
        
        ps= conn.prepareStatement(sql);
        ps.setString(1, staffid);
        ps.setString(2, pass);
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
