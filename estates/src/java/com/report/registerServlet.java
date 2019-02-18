/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.report;

import com.bean.Credentials;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
/**
 *
 * @author user
 */
public class registerServlet extends HttpServlet {

    
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
             Connection conn=DbConn.getConnection();
             
         String fname=request.getParameter("fname");
         String sname=request.getParameter("sname");
         String staffid=request.getParameter("staffid");
         String email=request.getParameter("email");
         String pass=request.getParameter("pass");
         
         Credentials cr=new Credentials();
         cr.setFname(fname);
         cr.setSname(sname);
         cr.setStaffid(staffid);
         cr.setEmail(email);
         cr.setPass(pass);
         
         if(UsersDAO.exists(cr)){
         String message="Record already exists!";
         request.setAttribute("message",message);
         request.getRequestDispatcher("/register.jsp").forward(request, response);
         }
         else{
         cr=UsersDAO.register(cr);
         }      
         if(cr.isValid()){
        
         String message="Record inserted successfully!";
         request.setAttribute("message",message);
         request.getRequestDispatcher("/register.jsp").forward(request, response);
          }
         else{
             
          request.getRequestDispatcher("/error.jsp").forward(request, response);
         }
      
         
      
   
        }
        catch(Exception e){
            
        }}
    }

   


