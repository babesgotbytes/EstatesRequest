/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
public class Renovation extends HttpServlet {

   /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                        Connection conn=DatabaseConnection.getConnection();

                String doneby=null;
		String empid=request.getParameter("emp_id");
//		String jobdescription=request.getParameter("jobdescription");
		int report_id=Integer.parseInt(request.getParameter("jobdescription"));
		// Connect to mysql and verify username password
		
//                
                String sql1="SELECT * FROM employee where empid=? LIMIT=1";
                try( PreparedStatement pt=conn.prepareStatement(sql1)){
                    pt.setInt(1, Integer.parseInt(empid));
                    
                  ResultSet result=pt.executeQuery();
                  
                  
                    doneby=result.getString(2);
                }catch(SQLException e){
                    
                    doneby=empid;
                }
                

                
                
		try {
//			Class.forName("com.mysql.jdbc.Driver");
		 // loads driver
//		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/estates", "root", ""); // gets a new connection
                
                PreparedStatement ps1=conn.prepareStatement("UPDATE employee set  emp_status=? where empid=?");
                 ps1.setString(1,"ASSIGNED");
                 ps1.setInt(2, Integer.parseInt(empid));
                 ps1.executeUpdate(); 
                 		
                 
                 
                 PreparedStatement ps = conn.prepareStatement("insert into workstatus (report_id,doneby,empid) values (?,?,?)");
                ps.setInt(1, report_id);
                ps.setString(2, doneby);
		ps.setString(3, empid);
                int i=ps.executeUpdate();
                if(i>0){
                request.getRequestDispatcher("/RenovationPage.jsp").forward(request, response);
                
                }
                else{
                request.getRequestDispatcher("/AddEmployeePage.jsp").forward(request, response);
                }
                
     }
        
        catch(Exception e){
        e.printStackTrace();
        }
        
        }
    }