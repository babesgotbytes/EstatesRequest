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
      out.write("<!--        <script>\r\n");
      out.write("        function validate()\r\n");
      out.write("{ \r\n");
      out.write(" var Name= document.form.fullname.value;\r\n");
      out.write(" var PhoneNumber = document.form.email.value;\r\n");
      out.write(" var Email = document.form.username.value; \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" if (Name==null || Name==\"\")\r\n");
      out.write(" { \r\n");
      out.write(" alert(\"Name can't be blank\"); \r\n");
      out.write(" return false; \r\n");
      out.write(" }\r\n");
      out.write(" else if (PhoneNumber==null || PhoneNumber==\"\")\r\n");
      out.write(" { \r\n");
      out.write(" alert(\"PhoneNumber can't be blank\"); \r\n");
      out.write(" return false; \r\n");
      out.write(" }\r\n");
      out.write(" else if (Email==null || Email==\"\")\r\n");
      out.write(" { \r\n");
      out.write(" alert(\"Email can't be blank\"); \r\n");
      out.write(" return false; \r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write(" } \r\n");
      out.write("</script> -->\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body class=\"container-fluid\">\r\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar navbar-light bg-light\">\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSuppUuortedContent\">\r\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("      <li class=\"nav-item\" >\r\n");
      out.write("        <a style=\"margin-right: 50px\" class=\"nav-link\" href=\"HomePage.jsp\">Home</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a style=\"margin-right: 50px\" class=\"nav-link\" href=\"RequestPage.jsp\">Requests</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a style=\"margin-right: 50px ; color: black\" class=\"nav-link\" href=\"AddEmployeePage.jsp\">Manage Employee</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a style=\"margin-right: 50px\" class=\"nav-link\" href=\"RenovationPage.jsp\">Renovation</a>\r\n");
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
      out.write("        <p style=\"font-family: 'sans-serif';font-size: 25px;\">Addition of a new Employee:</p>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AddEmployee\" method=\"POST\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\" style=\"margin-top: 70px;margin-left: 30px;\">\r\n");
      out.write("        \r\n");
      out.write("        <input type=\"hidden\" name=\"saved_user\" value=\"1\"/>         \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        <div class=\"col-md-4\">\r\n");
      out.write("\r\n");
      out.write("            <label style=\"font-family: 'sans-serif';font-size: 18px\">Employee Name:</label>\r\n");
      out.write("            <input type=\"text\" name=\"Name\" class=\"form-control\" autocomplete=\"off\" required>\r\n");
      out.write("            <label style=\"font-family: 'sans-serif';font-size: 18px\">Phone Number:</label>\r\n");
      out.write("            <input type=\"text\" name=\"PhoneNumber\" class=\"form-control\" autocomplete=\"off\" required>\r\n");
      out.write("            <label style=\"font-family: 'sans-serif';font-size: 18px\">Employee Email:</label>\r\n");
      out.write("            <input type=\"email\" name=\"Email\" class=\"form-control\" autocomplete=\"off\" required>\r\n");
      out.write("            <br>\r\n");
      out.write("           ");
      out.print((request.getAttribute("errMessage") == null) ? ""  : request.getAttribute("errMessage"));
      out.write("\r\n");
      out.write("                \r\n");
      out.write("            <button type=\"submit\" class=\"btn alert-dark\" name=\"submit\" value=\"Submit\"\r\n");
      out.write("                    style=\"margin-top: 25px;width: 200px;margin-left: 60px\"> Submit\r\n");
      out.write("            </button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("<!--        <p style=\"margin-top: 70px; margin-left: 200px; font-family: sans-serif; font-size: 60px \"><b>Welcome Manager <br></b>\r\n");
      out.write("    \r\n");
      out.write("<b style=\" margin-top: 80px; margin-left: 130px; font-family: sans-serif; font-size: 30px \">Thank you for visiting The Estates Website</b></p>-->\r\n");
      out.write("<br>\r\n");
      out.write("<br>\r\n");
      out.write("<form action=\"DisplayServlet\" method=\"POST\">\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\" style=\"font-family: Serif;font-size: 18px;margin-left: 20px; margin-top: 10px; margin-bottom: 100px;\">\r\n");
      out.write("        <div class=\"form-group\">\r\n");
      out.write("            <h4 style=\"font-family: sans-serif; font-size: 25px \">Check for available employees</h4>\r\n");
      out.write("        <input class=\"btn alert-dark\" style=\"margin-left: 60px;width: 200px; color: black; font-family: Serif;font-size: 18px;\" type=\"Submit\" value =\"Check\">\r\n");
      out.write("    </div>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<!--<a href=\"");
      out.print(request.getContextPath());
      out.write("/DisplayServlet\">Display</a>-->\r\n");
      out.write("    </body>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("   \r\n");
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
