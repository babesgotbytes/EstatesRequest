package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>LOGIN PAGE</title>\n");
      out.write("         <script src=\"jquery-3.3.1.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function(){\n");
      out.write("             $('#body').css('background-color','grey');\n");
      out.write("             $('#myform').css('background-color','chocolate');\n");
      out.write("             $('#myform').css('border','5px solid #ccc');\n");
      out.write("              $('#myform').css('width','50%');\n");
      out.write("              $('#btn').css('background-color','red');\n");
      out.write("             $('#btn1').css('background-color','green');\n");
      out.write("            });\n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"body\">\n");
      out.write("        <h1 style=\"font-style: italic;color: red\">PROVIDE LOGIN DETAILS BELOW</h1>\n");
      out.write("    \n");
      out.write("        <form action=\"LoginServlet\" style=\"font-family: italic;font-size: 100%;color: blue\" method=\"POST\" id=\"myform\"/>\n");
      out.write("        <table style=\"font-family: cursive;font-size: 100%;border: thistle;border-color: aqua\" cellspacing=\"5px\" method=\"POST\">\n");
      out.write("           <tr>\n");
      out.write("             <td>Staff Id:</td>\n");
      out.write("           </tr>\n");
      out.write("           <tr>\n");
      out.write("            <td><input type=\"text\" name=\"staffid\" placeholder=\"staffid\" style=\"background-color: aqua;border-color:red \"></td>\n");
      out.write("           </tr>\n");
      out.write("           <tr>\n");
      out.write("            <td>Password:</td>\n");
      out.write("           </tr>\n");
      out.write("           <tr>\n");
      out.write("            <td><input type=\"password\" name=\"pass\" placeholder=\"Password\" style=\"background-color: aqua;border-color:red \"></td>\n");
      out.write("            </tr> \n");
      out.write("             <tr>\n");
      out.write("                <td><input type=\"button\" name=\"ok\" value=\"OK\" style=\"background-color: blue\" onClick=\"validate(this.form)\" id=\"btn1\"></td>\n");
      out.write("                <td><input type=\"reset\" name=\"cancel\" value=\"CANCEL\" style=\"background-color: blue\" id=\"btn\"></td>\n");
      out.write("                 <td><a href=\"register.jsp\">Register!!!</a></td>\n");
      out.write("            </tr> \n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        </form>\n");
      out.write("        <p style=\"color: red;font-family: cursive\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b></p>\n");
      out.write("        <script language=\"JavaScript\">\n");
      out.write("            function validate(form){\n");
      out.write("                if(form.staffid.value==\"\"&&form.pass.value==\"\"){\n");
      out.write("                    alert(\"No fields Entered!\");\n");
      out.write("                }\n");
      out.write("           else if(form.staffid.value==\"\"){\n");
      out.write("                  \n");
      out.write("                 alert(\"Staff Id Required\");\n");
      out.write("                 form.staffid.focus();\n");
      out.write("             }  \n");
      out.write("            else if(form.pass.value==\"\"){\n");
      out.write("                 \n");
      out.write("                 alert(\"Password Required\");\n");
      out.write("                 form.pass.focus();\n");
      out.write("             } \n");
      out.write("             else{\n");
      out.write("                \n");
      out.write("                 form.submit();\n");
      out.write("                 \n");
      out.write("             }\n");
      out.write("         }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
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
