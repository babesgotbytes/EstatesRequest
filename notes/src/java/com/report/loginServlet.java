/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.report;

import com.bean.Credentials;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class loginServlet extends HttpServlet {

   HttpSession session;
   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doPost(request, response);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
       
        
        String staffid=request.getParameter("staffid");
        String pass=request.getParameter("pass");
        Credentials crs=new Credentials();
        
        crs.setStaffid(staffid);
        crs.setPass(pass);
        crs=UsersDAO.login(crs);
        
        if(crs.isValid()){
        session=request.getSession(true);
        session.setAttribute("cred", crs);
       request.getRequestDispatcher("/welcome.jsp").forward(request, response);
        }  
        else{
       String message="invalid user register first!";
       session=request.getSession(true);
       session.setAttribute("message",message);
       request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
        
      }
        catch(Exception e){
        e.printStackTrace();
        }
        
    }

    
   

}
