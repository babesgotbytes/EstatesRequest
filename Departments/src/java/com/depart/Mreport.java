/*s
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depart;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dept.bean.DepartmentBean;

import dept.data.DepartmentReport;


public class Mreport extends HttpServlet {

    public Mreport() {
 }
         @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                 
                String Category=request.getParameter("Category");
		String Cname=request.getParameter("Cname");
		String Pname=request.getParameter("Pname");
                String damageKind= request.getParameter("damageKind");
		
            DepartmentBean deptBean=new DepartmentBean();
                
                deptBean.setCategory(Category);
                deptBean.setCname(Cname);
                deptBean.setPname(Pname);
                deptBean.setdamageKind(damageKind);
                

                DepartmentReport report = new DepartmentReport();
 
 
                String userreg = report.registerUser(deptBean);
                if (userreg.equals("successful")){
                    
                   response.sendRedirect("index.html?added successful"); 
                }
                else{
                    
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                }
 
 
        }

}
  