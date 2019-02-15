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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("    <!--<a href=”bootstrap/bootstrap/css/bootstrap.css” rel=”stylesheet” type=”text/css”></a>-->\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("        <title>Manager</title>\n");
      out.write("<!--        <script>\n");
      out.write("        function validate()\n");
      out.write("{ \n");
      out.write(" var Name= document.form.fullname.value;\n");
      out.write(" var PhoneNumber = document.form.email.value;\n");
      out.write(" var Email = document.form.username.value; \n");
      out.write(" \n");
      out.write(" \n");
      out.write(" if (Name==null || Name==\"\")\n");
      out.write(" { \n");
      out.write(" alert(\"Name can't be blank\"); \n");
      out.write(" return false; \n");
      out.write(" }\n");
      out.write(" else if (PhoneNumber==null || PhoneNumber==\"\")\n");
      out.write(" { \n");
      out.write(" alert(\"PhoneNumber can't be blank\"); \n");
      out.write(" return false; \n");
      out.write(" }\n");
      out.write(" else if (Email==null || Email==\"\")\n");
      out.write(" { \n");
      out.write(" alert(\"Email can't be blank\"); \n");
      out.write(" return false; \n");
      out.write(" }\n");
      out.write(" \n");
      out.write(" } \n");
      out.write("</script> -->\n");
      out.write("\n");
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
      out.write("        <a style=\"margin-right: 50px ; color: black\" class=\"nav-link\" href=\"AddEmployeePage.jsp\">Manage Employee</a>\n");
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
      out.write("        <p style=\"font-family: 'sans-serif';font-size: 25px;\">Addition of a new Employee:</p>\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/AddEmployee\" method=\"POST\">\n");
      out.write("\n");
      out.write("    <div class=\"row\" style=\"margin-top: 70px;margin-left: 30px;\">\n");
      out.write("        \n");
      out.write("        <input type=\"hidden\" name=\"saved_user\" value=\"1\"/>         \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"col-md-4\">\n");
      out.write("\n");
      out.write("            <label style=\"font-family: 'sans-serif';font-size: 18px\">Employee Name:</label>\n");
      out.write("            <input type=\"text\" name=\"Name\" class=\"form-control\" autocomplete=\"off\" required>\n");
      out.write("            <label style=\"font-family: 'sans-serif';font-size: 18px\">Phone Number:</label>\n");
      out.write("            <input type=\"text\" name=\"PhoneNumber\" class=\"form-control\" autocomplete=\"off\" required>\n");
      out.write("            <label style=\"font-family: 'sans-serif';font-size: 18px\">Employee Email:</label>\n");
      out.write("            <input type=\"email\" name=\"Email\" class=\"form-control\" autocomplete=\"off\" required>\n");
      out.write("            <br>\n");
      out.write("           ");
      out.print((request.getAttribute("errMessage") == null) ? ""  : request.getAttribute("errMessage"));
      out.write("\n");
      out.write("                \n");
      out.write("            <button type=\"submit\" class=\"btn alert-dark\" name=\"submit\" value=\"Submit\"\n");
      out.write("                    style=\"margin-top: 25px;width: 200px;margin-left: 60px\"> Submit\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("<!--        <p style=\"margin-top: 70px; margin-left: 200px; font-family: sans-serif; font-size: 60px \"><b>Welcome Manager <br></b>\n");
      out.write("    \n");
      out.write("<b style=\" margin-top: 80px; margin-left: 130px; font-family: sans-serif; font-size: 30px \">Thank you for visiting The Estates Website</b></p>-->\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("<form action=\"DisplayServlet\" method=\"POST\">\n");
      out.write("\n");
      out.write("    <div class=\"row\" style=\"font-family: Serif;font-size: 18px;margin-left: 20px; margin-top: 10px; margin-bottom: 100px;\">\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <h4 style=\"font-family: sans-serif; font-size: 25px \">Check for available employees</h4>\n");
      out.write("        <input class=\"btn alert-dark\" style=\"margin-left: 60px;width: 200px; color: black; font-family: Serif;font-size: 18px;\" type=\"Submit\" value =\"Check\">\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<!--<a href=\"");
      out.print(request.getContextPath());
      out.write("/DisplayServlet\">Display</a>-->\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("   \n");
      out.write("</html>\n");
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
