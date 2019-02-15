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
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author CLARICE
 */
public class report extends HttpServlet {

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   
//                 String name=request.getParameter("Name");
		String cate=request.getParameter("cate");
		String categoryname=request.getParameter("categoryname");
		String propertyname=request.getParameter("propertyname");
		String damage=request.getParameter("damage");
		
		// Connect to mysql and verify username password
		
		try {
//			Class.forName("com.mysql.jdbc.Driver");
		 // loads driver
//		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/estates", "root", ""); // gets a new connection
                Connection conn=DatabaseConnection.getConnection();
		PreparedStatement ps;
                    ps = conn.prepareStatement("insert into report (cate,categoryname,propertyname,damage) values (?,?,?,?)");
		ps.setString(1, cate);
                ps.setString(2, categoryname);
		ps.setString(3, propertyname);
                ps.setString(4, damage);
                int i=ps.executeUpdate();
                if(i>0){
//                System.out.println("<script>window.alert('Employee Selected is Already Assigned')</script>");
                request.getRequestDispatcher("/AssignPage.jsp").forward(request, response);
                
                }
                else{
                request.getRequestDispatcher("/ErrorPage.jsp").forward(request, response);
                }
                
     }
        
        catch(Exception e){
        e.printStackTrace();
        }
        
        }
}
