/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.depart;

import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Calvince
 */
@WebServlet
public class Mcomplain extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {

        String Complain = request.getParameter("complain");
       

        try {
            Connection conn;
            conn = DbConnect1.getConnection();
            PreparedStatement ps;
            ps = (PreparedStatement) conn.prepareStatement("insert into complain(complain) values (?)");
            ps.setString(1, Complain);
            

            int i = ps.executeUpdate();
            response.setContentType("text/html");
            PrintWriter out;
            out = response.getWriter();
            out.println("<h1>Hey! it worked</h1>");

        } catch (SQLException ex) {
            Logger.getLogger(Mreport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
