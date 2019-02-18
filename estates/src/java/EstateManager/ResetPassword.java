/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstateManager;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;


/**
 *
 * @author CLARICE
 */
public class ResetPassword extends HttpServlet {

    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                   /* retrieve all parameters from Jsp page*/
            
            
            String username= request.getParameter("username");
            String initial_pass= request.getParameter("initial_pass");
            String password= request.getParameter("password");
            String con_pass= request.getParameter("con_pass");
            String dbpass=new String();
              String dbuname=new String();
            
          String sql="select * from managers where password='"+initial_pass+"'";
          String sql2="update managers set password='"+password+ "'where username='"+username+"'";
                 try{
   
  Connection conn=DatabaseConnection.getConnection();
  PreparedStatement ps=conn.prepareCall(sql);
  ps.setString(1, username);
    ps.setString(3, initial_pass);
     ps.setString(4, password);
      ps.setString(5, con_pass);
      ResultSet rs=ps.executeQuery();
 
  
  if(rs.next()){
   dbpass=rs.getString("password");
   dbuname= rs.getString("username");
 if(dbpass.equals(initial_pass)&&dbuname.equals(username)){
     ps=conn.prepareStatement(sql2);
    ps.executeUpdate();
    request.getRequestDispatcher("/passwordReset.jsp");
 }
  
  }
  else{
  
  request.getRequestDispatcher("/error.jsp").forward(request, response);
  }
                
                 }
                 catch(Exception e){
                 e.printStackTrace();
                 
                 }
           
           
           }  
        }
    
