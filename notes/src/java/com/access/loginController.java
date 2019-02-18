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


public class loginController extends HttpServlet {

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
        String fname=request.getParameter("fname");
        String sname=request.getParameter("sname");
        String managerid=request.getParameter("managerid");
        String email=request.getParameter("email");
        String pass=request.getParameter("pass");
        
        UserBean user=new UserBean();
        user.setFname(fname);
        user.setSname(sname);
        user.setManagerid(managerid);
        user.setEmail(email);
        user.setPass(pass);
        
        if(UserDAO.exists(user)){
            String message="ManagerID Already exists!";
            request.setAttribute("message", message);
            request.getRequestDispatcher("/register2.jsp").forward(request, response);
        }
        else
        user=UserDAO.login(user);
        
        if(user.isValid()){
        
        String message="Record inserted successfully!";
        request.setAttribute("message",message);
        request.getRequestDispatcher("/register2.jsp").forward(request, response);
        }
        else{
        String message="Record failed to insert successfully!";
        request.setAttribute("message",message);   
        request.getRequestDispatcher("/register2.jsp").forward(request, response);
        }
        }
        catch(Exception e){
        e.printStackTrace();
        }
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
