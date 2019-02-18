/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.access;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author user
 */
public class registrationController extends HttpServlet {
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
       String managerid=request.getParameter("managerid");
       String pass=request.getParameter("pass");
       
       UserBean users=new UserBean();
       
       users.setManagerid(managerid);
       users.setPass(pass);
       
       users=UserDAO.register(users);
        
       if(users.isValid()){
        session=request.getSession(true);   
        session.setAttribute("users", users);
       request.getRequestDispatcher("/welcome2.jsp").forward(request, response);
      }
       else{
       String message="invalid user register first!";
       session=request.getSession(true);   
       session.setAttribute("message",message);
       request.getRequestDispatcher("/login2.jsp").forward(request, response);
       }
    }
        catch(Exception e){
            e.printStackTrace();
        }}

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
