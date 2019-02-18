/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edit;

import com.bean.Credentials;
import com.report.UsersDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class RegisterServlet extends HttpServlet {

   
   

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         String fname=request.getParameter("fname");
         String sname=request.getParameter("sname");
         String staffid=request.getParameter("staffid");
         String pass=request.getParameter("pass");
         String role=request.getParameter("role");
         BeanClass bc=new BeanClass();
         bc.setFname(fname);
         bc.setSname(sname);
         bc.setStaffid(staffid);
         bc.setRole(role);
         bc.setPass(pass);
         try{
         if(DAOClass.exists(bc)){
         String message="Record already exists!";
         request.setAttribute("message",message);
         request.getRequestDispatcher("/register.jsp").forward(request, response);
         }
         else
         bc=DAOClass.register(bc);
          
          if(bc.isValid()){
        
         String message="Record inserted successfully!";
         request.setAttribute("message",message);
         request.getRequestDispatcher("/register.jsp").forward(request, response);
          }
         else{
           String message="Record failed to insert!";
           request.setAttribute("message",message);
          request.getRequestDispatcher("/register.jsp").forward(request, response);
         }
      
         }
         catch(SQLException e){
         e.printStackTrace();
         }
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
