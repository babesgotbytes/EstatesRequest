package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class AssignPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("\n");
      out.write("\n");
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
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body class=\"container-fluid\">\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar navbar-light bg-light\">\n");
      out.write("  \n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSuppUuortedContent\">\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("     <li class=\"nav-item\" >\n");
      out.write("        <a style=\"margin-right: 50px\" class=\"nav-link\" href=\"HomePage.jsp\">Home</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a style=\"margin-right: 50px\" class=\"nav-link\" href=\"RequestPage.jsp\">Requests</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a style=\"margin-right: 50px; \" class=\"nav-link\" href=\"AddEmployeePage.jsp\">Manage Employee</a>\n");
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
      out.write("        <br>\n");
      out.write("        <h3 style=\"font-family: sans-serif;\"><b><u>Estate Department Employees</u></b></h3>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("\t<table  class=\"table table-stripped table-bordered table-condensed table-sm table-hover\" id=\"tab\">\n");
      out.write("\n");
      out.write("\t\t<tr class=\"thead-dark\">\n");
      out.write("            <!--<th>No.</th>-->\n");
      out.write("            <th>empID</th>\n");
      out.write("            <th>Name</th>\n");
      out.write("            <th>PhoneNumber</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>Status</th>\n");
      out.write("            <!--<th>Assign</th>-->\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("        </table> \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        <br>  \n");
      out.write("<!--        <p style=\"margin-top: 70px; margin-left: 200px; font-family: sans-serif; font-size: 60px \"><b>Welcome Manager <br></b>\n");
      out.write("        <b style=\" margin-top: 80px; margin-left: 130px; font-family: sans-serif; font-size: 30px \">Thank you for visiting The Estates Website</b></p>-->\n");
      out.write("   <!--               \n");
      out.write("\n");
      out.write("\t\t</tr>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("        <!--Connection conn = DatabaseConnection.getConnection();-->\n");
      out.write("        <a href=\"AddEmployeePage.jsp\" style=\"font-family: 'sans-serif';font-size: 25px; color: black;float: right;\">Add Employee</a>\n");
      out.write("\n");
      out.write("        <form style=\"align: center\" action=\"Renovation\" method=\"POST\">\n");
      out.write("        <p style=\"color: black;font-family:sans-serif;font-size: 20px;\"><u><b>Assign Work To a free Employee</b></u></p>\n");
      out.write("        <label>Please select the employee to be assigned</label>\n");
      out.write("        <select  class=\"form-control\" name=\"doneby\" id=\"\" style=\"width: 400px\" >\n");
      out.write("          <option value=\"\" disabled selected>--Please choose--</option>\";\n");
      out.write("            ");

            
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
                 
                 String qry = "select * from employee where emp_status='NOT ASSIGNED'";
                 rs = st.executeQuery(qry);
                 while (rs.next())
                 {
                                   
                             
      out.write("\n");
      out.write("                             <option>");
      out.print(rs.getString(2));
      out.write("</option>  \n");
      out.write("                             ");

                                 
                     
     }   
                 
                 
          
      out.write("\n");
      out.write("                    ");
   
                     
     
   }catch(Exception e){
    
     } 

      out.write("\n");
      out.write("    \n");
      out.write("        </select>\n");
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        <label>Choose work for the employee</label><br>\n");
      out.write("        <select class=\"form-control\" name=\"jobdescription\" id=\"\" style=\"width: 400px\">\n");
      out.write("            \n");
      out.write("\n");
      out.write("           \n");
      out.write("            <option value=\\\"\\\" disabled selected>--Please choose--</option>\";\n");
      out.write("             ");

            
             try{
             
                 st = conn.createStatement();
                 
                 String qry = "select id from report";
                 rs = st.executeQuery(qry);
                 while (rs.next())
                 {
                                   
                             
      out.write("\n");
      out.write("                             <option>");
      out.print(rs.getString(1));
      out.write("</option>  \n");
      out.write("                             ");

                                 
                     
     }
   }catch(Exception e){
    
     } 

      out.write("\n");
      out.write("  \n");
      out.write("        </select>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <input  class=\"btn alert-dark\" type=\"submit\" name=\"submit\" value=\"Submit\" style=\" color: black;width:150px;margin-left: 90px;\">\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("    </form>\n");
      out.write("    </body>\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("    <script>          \n");
      out.write("        function changeStatus(empid){\n");
      out.write("            \n");
      out.write("            window.location='ToggleAssigned?empId='+empid;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("\n");
      out.write("       \n");
      out.write("    </script>\n");
      out.write("        \n");
      out.write("        ");
 
            
            String passedValue=request.getParameter("passed_value");
        if(passedValue!=null){
            
            
      out.write("\n");
      out.write("             \n");
      out.write("            <script>\n");
      out.write("                \n");
      out.write("                alert(\"The user has been successfully saved\");\n");
      out.write("            </script>\n");
      out.write("    \n");
      out.write("            ");

            
        }else{

            
}
        
      out.write("\n");
      out.write("       \n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("list");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <tr>\n");
          out.write("                        <td>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                        <td>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                        <td>");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                        <td>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                        <td>");
          if (_jspx_meth_c_out_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                        \n");
          out.write("                       \n");
          out.write("                     \n");
          out.write("                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.id}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.name}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.number}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.email}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }

  private boolean _jspx_meth_c_out_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_4.setPageContext(_jspx_page_context);
    _jspx_th_c_out_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_4.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list.status}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_4 = _jspx_th_c_out_4.doStartTag();
    if (_jspx_th_c_out_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_4);
    return false;
  }
}
