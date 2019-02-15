/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstateManager;

import java.sql.*;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CLARICE
 */
public class loginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
        Connection conn=DatabaseConnection.getConnection();
        
        String staffid=request.getParameter("staffid");
        String pass=request.getParameter("pass");
       
        String sql="select * from department where staffid=? and password=?";
        
        PreparedStatement ps= conn.prepareStatement(sql);
        ps.setString(1, staffid);
        ps.setString(2, pass);
        ResultSet rs=ps.executeQuery();
        
        if(rs.next()){
            //String dbstaff=rs.getString("staffid");
            //String dbpass=rs.getString("password");
           // if(staffid.equals(dbstaff)&&pass.equals(dbpass)){
        request.getRequestDispatcher("/welcome.jsp").forward(request, response);
           // }
        }
          else{
      request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
        
        
        }
        catch(Exception e){
        
        }
        
    }


}
