package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class RenovationPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        \r\n");
      out.write("    <!--<a href=”bootstrap/bootstrap/css/bootstrap.css” rel=”stylesheet” type=”text/css”></a>-->\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\r\n");
      out.write("        <title>Manager</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"container-fluid\">\r\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar navbar-light bg-light\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSuppUuortedContent\">\r\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("     <li class=\"nav-item\" >\r\n");
      out.write("        <a style=\"margin-right: 50px\" class=\"nav-link\" href=\"HomePage.jsp\">Home</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a style=\"margin-right: 50px\" class=\"nav-link\" href=\"RequestPage.jsp\">Requests</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a style=\"margin-right: 50px\" class=\"nav-link\" href=\"AddEmployeePage.jsp\">Manage Employee</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a style=\"margin-right: 50px; color: black\" class=\"nav-link\" href=\"RenovationPage.jsp\">Renovation</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a style=\"margin-right: 50px\" class=\"nav-link\" href=\"ResetPasswordPage.jsp\">Reset Password</a>\r\n");
      out.write("      </li>\r\n");
      out.write("     <li class=\"nav-item\">\r\n");
      out.write("        <a style=\"margin-right: 50px\" class=\"nav-link\" href=\"Logout\">LogOut</a>\r\n");
      out.write("      </li>   \r\n");
      out.write("    </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("</nav>\r\n");
      out.write("        \r\n");
      out.write("<!--        <p style=\"margin-top: 70px; margin-left: 200px; font-family: sans-serif; font-size: 60px \"><b>Welcome Manager <br></b>\r\n");
      out.write("        <b style=\" margin-top: 80px; margin-left: 130px; font-family: sans-serif; font-size: 30px \">Thank you for visiting The Estates Website</b></p>-->\r\n");
      out.write("     <h3 style=\"font-family: sans-serif; margin-left: 10%;\">Estate Department Work Records</h3>\r\n");
      out.write("\r\n");
      out.write("    <table class=\"table table-stripped table-borderd table-condensed table-sm table-hover\">\r\n");
      out.write("        <tr class=\"thead-dark\">\r\n");
      out.write("            <th>No.</th>\r\n");
      out.write("            <th>Job Description</th>\r\n");
      out.write("            <th> Date Assigned work</th>\r\n");
      out.write("            <!--<th>Done By</th>-->\r\n");
      out.write("            <th> Employee ID</th>\r\n");
      out.write("            <th> Work status</th>\r\n");
      out.write("            <th>   </th>\r\n");
      out.write("        </tr>\r\n");
      out.write("         ");

            
          Connection conn = null;
          Statement st  = null;
          ResultSet rs = null;
            ResultSet resultSet = null;
             try{
                    Class.forName("com.mysql.jdbc.Driver");
                   String path="jdbc:mysql://localhost:3306/estates";
                   String user="root";
                   String pass="";
                 conn=DriverManager.getConnection(path,user,pass);
                 
                 st = conn.createStatement();
                 
                 String qry = "select * from workstatus";
                 rs = st.executeQuery(qry);
                 while (rs.next())
                 {
                     

                      
                PreparedStatement ps = conn.prepareStatement("select * from report where id=? LIMIT 1");
                ps.setInt(1, rs.getInt(2));
                resultSet=ps.executeQuery();

                     
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>");
      out.print( rs.getString(1) );
      out.write(" </td>\r\n");
      out.write("                        <td>");
      out.print(  rs.getString(2) );
      out.write(" </td>\r\n");
      out.write("                   \r\n");
      out.write("                             <td>");
      out.print( rs.getString(6) );
      out.write(" </td>\r\n");
      out.write("                        <td>");
      out.print( rs.getString(5) );
      out.write(" </td>\r\n");
      out.write("                        <td> ");
      out.print(rs.getString(3) );
      out.write("</td>\r\n");
      out.write("                        <td><input type=\"checkbox\" name=\"change_status\" id=\"change_status\" onClick=\"changeStatus('");
      out.print( rs.getInt(1) );
      out.write(" ')\"></td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                     \r\n");
      out.write("                    ");
   
                     
     }
   }catch(Exception e){
    
     } 

      out.write("\r\n");
      out.write("        </table> \r\n");
      out.write("                     \r\n");
      out.write("         </table> \r\n");
      out.write("           \r\n");
      out.write("            \r\n");
      out.write("        <br>  \r\n");
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("    </body>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script>          \r\n");
      out.write("        function changeStatus(id){\r\n");
      out.write("            \r\n");
      out.write("            window.location='ToggleAssigned?id='+id;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("       \r\n");
      out.write("    </script>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
