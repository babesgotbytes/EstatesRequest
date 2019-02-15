package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddEmployeePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("    <!--<a href=”bootstrap/bootstrap/css/bootstrap.css” rel=”stylesheet” type=”text/css”></a>-->\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("        <title>Manager</title>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"container-fluid\">\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar navbar-light bg-light\">\n");
      out.write("  \n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSuppUuortedContent\">\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("      <li class=\"nav-item\" >\n");
      out.write("        <a style=\"margin-right: 50px\" class=\"nav-link\" href=\"HomePage.jsp\">Home</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a style=\"margin-right: 50px\" class=\"nav-link\" href=\"RequestPage.jsp\">Requests</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a style=\"margin-right: 50px ; color: black\" class=\"nav-link\" href=\"AssignPage.jsp\">Assign Work</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a style=\"margin-right: 50px\" class=\"nav-link\" href=\"RenovationPage.jsp\">Renovation</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a style=\"margin-right: 50px\" class=\"nav-link\" href=\"ResetPasswordPage.jsp\">Reset Password</a>\n");
      out.write("      </li>\n");
      out.write("     <li class=\"nav-item\">\n");
      out.write("        <a style=\"margin-right: 50px\" class=\"nav-link\" href=\"Logout\">LogOut</a>\n");
      out.write("      </li>   \n");
      out.write("    </ul>\n");
      out.write("      </div>\n");
      out.write("</nav>\n");
      out.write("        <p style=\"font-family: 'sans-serif';font-size: 25px;\">Addition of a new Employee:</p><br>\n");
      out.write("        \n");
      out.write("<!--        <form action=\"AddEmployee\" method=\"POST\">\n");
      out.write("            Enter username :<input type=\"text\" name=\"Name\"> <br>\n");
      out.write("            Enter username :<input type=\"text\" name=\"PhoneNumber\"> <br>\n");
      out.write("\t\tEnter password :<input type=\"text\" name=\"Email\"><br>\n");
      out.write("\t\t<input type=\"submit\" value=\"Login\">\n");
      out.write("            -->\n");
      out.write("        <!--</form>-->\n");
      out.write("       <form action=\"AddEmployee\" method=\"POST\">\n");
      out.write("\n");
      out.write("    <div class=\"row\" style=\"margin-top: 70px;margin-left: 30px;\">\n");
      out.write("        \n");
      out.write("        <input type=\"hidden\" name=\"saved_user\" value=\"1\"/>         \n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("\n");
      out.write("            <label style=\"font-family: 'sans-serif';font-size: 18px\">Employee Name:</label>\n");
      out.write("            <input type=\"text\" name=\"Name\" class=\"form-control\" autocomplete=\"off\" required>\n");
      out.write("            <label style=\"font-family: 'sans-serif';font-size: 18px\">Phone Number:</label>\n");
      out.write("            <input type=\"text\" name=\"PhoneNumber\" class=\"form-control\" autocomplete=\"off\" required>\n");
      out.write("            <label style=\"font-family: 'sans-serif';font-size: 18px\">Employee Email:</label>\n");
      out.write("            <input type=\"email\" name=\"Email\" class=\"form-control\" autocomplete=\"off\" required>\n");
      out.write("            <br><br>\n");
      out.write("            <button type=\"submit\" class=\"btn alert-dark\" name=\"submit\" value=\"Submit\"\n");
      out.write("                    style=\"margin-top: 25px;width: 200px;margin-left: 60px\"> Submit\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("<!--        <p style=\"margin-top: 70px; margin-left: 200px; font-family: sans-serif; font-size: 60px \"><b>Welcome Manager <br></b>\n");
      out.write("        <b style=\" margin-top: 80px; margin-left: 130px; font-family: sans-serif; font-size: 30px \">Thank you for visiting The Estates Website</b></p>-->\n");
      out.write("    </body>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("   \n");
      out.write("</html>\n");
      out.write("\n");
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
