
package manager;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.bean.EmployeeBean;
import mvc.dao.EmpDet;
import mvc.dao.RegisterDao;


public class AddEmployee extends HttpServlet {

    public AddEmployee() {
 }
         @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                 
                String Name=request.getParameter("Name");
		String PhoneNumber=request.getParameter("PhoneNumber");
		String Email=request.getParameter("Email");
		
                EmpDet EmployeeBean = new EmpDet();
                
                EmployeeBean.setName(Name);
                EmployeeBean.setNumber(PhoneNumber);
                EmployeeBean.setEmail(Email);
                

                RegisterDao registerDao = new RegisterDao();
 
 
 String userRegistered = registerDao.registerUser(EmployeeBean);
 response.setContentType("text/html");
 PrintWriter out = response.getWriter();
 if(userRegistered.equals("successful"))   
 {
     System.out.println("Sucessful");
//     PrintWriter out = response.getWriter();
     out.println("<script https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js></script>");
     out.println("<script https://unpkg.com/sweetalert/dist/sweetalert.min.js></script>");
     out.println("<script>");
     out.println("$ (document).ready(function(){");
     out.println("swal(\"Good job!\", \"You clicked the button!\", \"success\");");
     out.println(")};");
     out.println("</script>");
     
     
 //request.getRequestDispatcher("AddEmployeePage.jsp?added successful").forward(request, response);
 
 response.sendRedirect("AddEmployeePage.jsp?added successful");
 }
 
 else   
 {
     out.println("<script https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js></script>");
     out.println("<script https://unpkg.com/sweetalert/dist/sweetalert.min.js></script>");
     out.println("<script>");
     out.println("$ (document).ready(function(){");
     out.println("swal(\"Good job!\", \"You clicked the button!\", \"success\");");
     out.println(")};");
     out.println("</script>");
 request.setAttribute("errMessage", userRegistered);
 
 request.getRequestDispatcher("error.jsp").forward(request, response);
 }
 }

}
  