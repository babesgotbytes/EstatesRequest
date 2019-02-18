/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.report;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class change extends HttpServlet {

   

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doPost(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    String currentPassword=request.getParameter ("current");
    String pass=request.getParameter ("new");
    String id=request.getParameter ("id");
    String conpass=request.getParameter ("confirm");
    String dbid=new String();
    String dbpass=new String();
    String connurl="jdbc:mysql://localhost:3306/estate";
    Connection con=null;
  
   
    try{Class.forName("com.mysql.jdbc.Driver");
    con=(Connection) DriverManager.getConnection(connurl, "root", "");
    Statement st= con.createStatement();
    ResultSet rs = st.executeQuery("select * from department where password='"+currentPassword+"'");
    while (rs.next()){
    dbid=rs.getString("id");
    dbpass=rs.getString("password");
    
    }System.out.println(id+ ""+pass);
    if(currentPassword.equals(dbpass)){
        try (Statement st1 = con.createStatement()) {
            int i=st1.executeUpdate("update department set password = '"+pass+"' where id='"+id+"'");
            if(i>0){
            String message="input successful";
            request.setAttribute("message", message);
            request.getRequestDispatcher("/first.jsp").forward(request, response);
           }
            else{
                System.out.println("wrong password");
                
            }
            }
        con.close();
    }
    else{System.out.println("Invalid Current Password");
    }
    }
    catch(IOException | ClassNotFoundException | SQLException | ServletException e){
        System.out.println(e);
    }
    }
    
       
    

   
     
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
