/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.bean.EmployeeBean;
import mvc.dao.*;

/**
 *
 * @author hp
 */
public class DisplayServlet extends HttpServlet {

   
   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.doPost(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//       EmployeeBean emp=new EmployeeBean();
       ArrayList<EmpDet> mylist=new ArrayList<EmpDet>();
        try {
            mylist=RegisterDao.getEmployee();
        } catch (SQLException ex) {
            Logger.getLogger(DisplayServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
          request.setAttribute("list",mylist);
          request.getRequestDispatcher("/AssignPage.jsp").forward(request, response);
           }
        
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
