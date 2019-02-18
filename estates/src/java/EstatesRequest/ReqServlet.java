/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstatesRequest;

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

/**
 *
 * @author CLARICE
 */
public class ReqServlet extends HttpServlet {

    
   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<EstateBean> myList=new ArrayList<EstateBean>();
      
        try {
            myList=RequestDAO.retrieve();
        } catch (SQLException ex) {
            Logger.getLogger(RequestServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        request.setAttribute("myList", myList);
        request.getRequestDispatcher("/RequestPage.jsp").forward(request, response);
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
