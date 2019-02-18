/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edit;

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
public class LoginServlet extends HttpServlet {

  
   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          String staffid=request.getParameter("staffid");
          String pass=request.getParameter("pass");
          BeanClass bc=new BeanClass();
          bc.setStaffid(staffid);
          bc.setPass(pass);
          bc=DAOClass.login(bc);
          if(bc.isValid()){
              switch (bc.getRole()) {
                  case "estate":
                     HttpSession session=request.getSession(true);
                      session.setAttribute("bean",bc);
                      request.getRequestDispatcher("/manager.jsp").forward(request, response);
                      break;
                  case "department":
                      HttpSession session1=request.getSession(true);
                      session1.setAttribute("bean",bc);
                      request.getRequestDispatcher("/department.jsp").forward(request, response);
                      break;
                  default:
                      break;
              }
        }
          else{
          String message="invalid login details";
         HttpSession session3=request.getSession(true);
          session3.setAttribute("message",message);
          request.getRequestDispatcher("/login.jsp").forward(request, response);
          }       
          
          
              
          
    }
   

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
