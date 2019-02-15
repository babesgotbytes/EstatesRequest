package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\"/>\n");
      out.write("        <title>Student</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--<h1>Hello World!</h1>-->\n");
      out.write("     <form  id=\"appication-form\" action=\"report\" method=\"POST\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"Category-select\">Choose a Category:</label>\n");
      out.write("\n");
      out.write("                <select id=\"Category-select\"  class=\"form-control\" name=\"cate\">\n");
      out.write("                    <option value=\"\" disabled selected>--Please choose--</option>\n");
      out.write("                    <option value=\"hostel\">Hostel</option>\n");
      out.write("                    <option value=\"lecture hall\">Lecture Hall</option>\n");
      out.write("                    <option value=\"office\">Offices</option>\n");
      out.write("                    <option value=\"games sector\">Games Sector</option>\n");
      out.write("                    <option value=\"anycategory\">Any Other</option>\n");
      out.write("\n");
      out.write("                </select><br>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("<!--            <div class=\"form-group col-md-4\" id=\"department_div\" style=\"display: none\">-->\n");
      out.write("<!--                <label for=\"Category-select\">Choose a Category:</label>-->\n");
      out.write("<!---->\n");
      out.write("<!--                <select id=\"option_2\"  class=\"form-control\"  required>-->\n");
      out.write("<!--                    <option value=\"\" disabled selected>--Please choose--</option>-->\n");
      out.write("<!---->\n");
      out.write("<!---->\n");
      out.write("<!--                </select><br><br>-->\n");
      out.write("<!---->\n");
      out.write("<!--            </div>-->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("\n");
      out.write("                <label for=\"Category-select\">CategoryName:</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"categoryname\" autocomplete=\"off\" required>\n");
      out.write("\n");
      out.write("<!--                <select id=\"Type-select\"  class=\"form-control\">-->\n");
      out.write("<!--                    <option value=\"\">--Please choose--</option>-->\n");
      out.write("<!--                    <option value=\"building\">Building</option>-->\n");
      out.write("<!--                    <option value=\"tap\">Tap</option>-->\n");
      out.write("<!--                    <option value=\"pipe\">Pipe</option>-->\n");
      out.write("<!--                    <option value=\"washroom\">WashRoom</option>-->\n");
      out.write("<!--                    <option value=\"bulb\">Bulb</option>-->\n");
      out.write("<!--                    <option value=\"anytype\">Any Other</option>-->\n");
      out.write("<!---->\n");
      out.write("<!--                </select><br><br>-->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("                <label for=\"Category-select\">PropertyName:</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\"  name=\"propertyname\" autocomplete=\"off\" required>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("\n");
      out.write("                <label for=\"Category-select\">Choose the Kind of Damage:</label>\n");
      out.write("\n");
      out.write("                <select id=\"Damage-select\" class=\"form-control\" name=\"damage\">\n");
      out.write("                    <option value=\"\" disabled selected>--Please choose--</option>\n");
      out.write("                    <option value=\"broken\">Broken</option>\n");
      out.write("                    <option value=\"stolen\">Stolen</option>\n");
      out.write("                    <option value=\"blocked\">Blocked</option>\n");
      out.write("                    <option value=\"burnt\">Burnt</option>\n");
      out.write("                    <option value=\"leaking\">Leaking</option>\n");
      out.write("                    <option value=\"repair\">Repair</option>\n");
      out.write("                    <option value=\"replace\">Replace</option>\n");
      out.write("                    <option value=\"paint\">Paint</option>\n");
      out.write("                    <option value=\"spoilt\">Spoilt</option>\n");
      out.write("                    <option value=\"cracked\">Cracked</option>\n");
      out.write("\n");
      out.write("                </select><br><br>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div class=\"form-group col-md-4\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <button type=\"submit\" class=\"btn \" name=\"submit\" value=\"Submit\" style=\"margin-top: 25px;background-color: #0056b3; color:white; width: 100px;margin-left: 100px;\"> Submit</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("    </form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("     <script src=\"js/bootstrap.min.js\"></script>\n");
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
