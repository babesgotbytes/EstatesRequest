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
import javax.servlet.RequestDispatcher;

/**
 *
 * @author CLARICE
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
             Connection conn=DatabaseConnection.getConnection();
             
         String fname=request.getParameter("fname");
         String sname=request.getParameter("sname");
         String staffid=request.getParameter("staffid");
         String email=request.getParameter("email");
         String pass=request.getParameter("pass");
         String sql1="insert into department (firstname,lastname,staffid,email,password) values (?,?,?,?,?)";
        
        PreparedStatement ps=conn.prepareStatement(sql1);
       ps.setString(1,fname);
        ps.setString(2,sname);
         ps.setString(3,staffid);
          ps.setString(4,email);
           ps.setString(5,pass);
        //  ps.executeUpdate();
       int i=ps.executeUpdate();
        //System.out.println("connection successful");
       if(i>0){
          
      request.getRequestDispatcher("/login.jsp").forward(request, response);
        
      }
        else{
        response.sendRedirect("error.jsp");
        
       }
        }
        
        catch(Exception e){
        e.printStackTrace();
        }
        
        }
}
