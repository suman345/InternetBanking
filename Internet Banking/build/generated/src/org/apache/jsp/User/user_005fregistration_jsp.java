package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005fregistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("            <table align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Account Type</td>\n");
      out.write("                    <td><input type=\"text\" name =\"ac_type\" id= \"ac_type\"></td>\n");
      out.write("                    <td><span color=\"red\" id=\"ac_type1></span></td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Account Number</td>\n");
      out.write("                    <td><input type=\"text\" name=\"ac_number\" id=\"ac_number\"></td>\n");
      out.write("                    <td><span color=\"red\" id=\"ac_number1\"></span></td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Account Holder</td>\n");
      out.write("                    <td><input type=\"text\" name=\"ac_holder\" id=\"ac_holder\"></td>\n");
      out.write("                    <td><span color=\"red\" id=\"ac_holder1></span></td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Branch Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"branch_name\" id=\"branch_name\"></td>\n");
      out.write("                    <td><font color=\"red\" id=\"branch_name1\"></font></td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>IFSE Code</td>\n");
      out.write("                   <td> <input type=\"text\" name=\"ifse_code\" id=\"ifse_code\"></td>\n");
      out.write("                    <td><font color=\"red\" id=\"ifse_code1\"></font></td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Email Id</td>\n");
      out.write("                    <td><input type=\"email\" name=\"email\" id=\"email\"></td>\n");
      out.write("                    <td><font color=\"red\" id=\"email1\"></font></td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Mobile No</td>\n");
      out.write("                    <td><input type=\"text\" name=\"mobile_no\" id=\"mobile_no\"></td>\n");
      out.write("                    <td><font color=\"red\" id=\"mobile_no1\"></font></td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password</td>\n");
      out.write("                    <td><input type=\"password\" name=\"password\" id=\"password\"></td>\n");
      out.write("                    <td><font color=\"red\" id=\"password1\"></font></td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   <td colspan=\"2\" align=\"center\">\n");
      out.write("                       <input type=\"submit\" onclick=\"return user_validation()\"></td>\n");
      out.write("                </tr>     \n");
      out.write("            </table>   \n");
      out.write("        </form>\n");
      out.write("        <script src=\"../Java_Script/User_Registration.js\"></script>\n");
      out.write("    </body>\n");
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
