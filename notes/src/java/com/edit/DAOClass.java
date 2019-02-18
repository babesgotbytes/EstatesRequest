/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edit;

import com.bean.Credentials;
import com.report.DbConn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class DAOClass {
     static Connection conn=null;
    static ResultSet rs=null;
    static PreparedStatement ps=null;
    
    public static boolean exists(BeanClass bean) throws SQLException{
        
    conn=DbConn.getConnection();
    String staffid=bean.getStaffid();
    String sql="select staffid from authenticate where staffid=?";
    ps=conn.prepareStatement(sql);
    ps.setString(1, staffid);
    rs=ps.executeQuery();
   
        return rs.next();
    }
    public static BeanClass register(BeanClass bean){
        try{
            conn=DbConn.getConnection();
                    
            String fname=bean.getFname();
            String sname=bean.getSname();
            String staffid=bean.getStaffid();
            String role=bean.getRole();
            String pass=bean.getPass();
            
         String sql1="insert into authenticate (firstname,lastname,staffid,password,role) values (?,?,?,?,?)";
        
        ps=conn.prepareStatement(sql1);
       ps.setString(1,fname);
       ps.setString(2,sname);
       ps.setString(3,staffid);
       ps.setString(4,pass);
       ps.setString(5,role);
       
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
    public static BeanClass login(BeanClass bean){
        
            try{
            conn=DbConn.getConnection();
            String staffid=bean.getStaffid();
            String pass=bean.getPass();
        
         String sql="select * from authenticate where staffid=? and password=?";
        
        ps= conn.prepareStatement(sql);
        ps.setString(1, staffid);
        ps.setString(2, pass);
        rs=ps.executeQuery();
        
     if(rs.next()){
         String fname=rs.getString("firstname");
         String sname=rs.getString("lastname");
         String role=rs.getString("role");
         bean.setFname(fname);
         bean.setSname(sname);
         bean.setRole(role);
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
}
