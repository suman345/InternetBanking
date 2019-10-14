package org.apache.jsp.Bankers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Banker_005fRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Bankers/../File_Source/Navmain.jsp");
    _jspx_dependants.add("/Bankers/../File_Source/Footermain.jsp");
  }

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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../Css/User_Registration.css\">\n");
      out.write("       <script src=\"../Java_Script/Banker_Registration.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"Css/NavMain_style.css\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("      <link href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("</head> \n");
      out.write("<!-- Navbar start -->\n");
      out.write("   \n");
      out.write("    <nav class=\"navbar fixed-top navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\"> My Bank </a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarColor01\" aria-controls=\"navbarColor01\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("      <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarColor01\">\n");
      out.write("      <ul class=\"navbar-nav mc-auto\">\n");
      out.write("           <li class=\"nav-item active\">           \n");
      out.write("               <a class=\"nav-link\" href=\"User/user_registration.jsp\"> Home</a>\n");
      out.write("           </li>\n");
      out.write("        <li class=\"nav-item active\">\n");
      out.write("            <a class=\"nav-link\" href=\"#\">Customer<span class=\"sr-only\">(current)</span></a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item active\">           \n");
      out.write("          <a class=\"nav-link\" href=\"#\"> Banker</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Admin</a>\n");
      out.write("        </li>\n");
      out.write("         <li class=\"nav-item active\">\n");
      out.write("          <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("        <li class=\"dropdown\" id=\"log\">\n");
      out.write("            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"  style=\"text-decoration: none;\">Login<span class=\"caret\"></span></a>\n");
      out.write("            <ul id=\"login-dp\" class=\"dropdown-menu\">\n");
      out.write("                <li>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-md-12\">  \n");
      out.write("                            <form class=\"form\" role=\"form\" method=\"post\" action=\"login\" accept-charset=\"UTF-8\" id=\"login-nav\">\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("                                    \n");
      out.write("                                    <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Email address\" required>\n");
      out.write("                                </div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("                                    \n");
      out.write("\t\t\t\t    <input type=\"password\" class=\"form-control\" id=\"Password\" placeholder=\"Password\" required>\n");
      out.write("                                    <div class=\"help-block text-right\"><a href=\"\">Forget the password ?</a></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary btn-block\">Sign in</button>\n");
      out.write("                                </div>\n");
      out.write("\t\t\t\t<div class=\"checkbox\">\n");
      out.write("                                    <label>\n");
      out.write("                                        <input type=\"checkbox\"> keep me logged-in\n");
      out.write("\t\t\t\t    </label>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                            </form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"bottom text-center\">\n");
      out.write("                            New here ? <a href=\"#\"><b>Join Us</b></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("                     </div>\n");
      out.write("\t\t</li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("        </li>\n");
      out.write("       </div> \n");
      out.write("       <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search\">\n");
      out.write("      <button class=\"btn btn-secondary my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("     </form>\n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("    <!-- Navbar end -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>");
      out.write("\n");
      out.write("        <form name=\"reg\" action=\"../banker_registration\" method=\"post\">\n");
      out.write("            <table align=\"center\" >\n");
      out.write("                <th colspan=\"3\">\n");
      out.write("                    <td>\n");
      out.write("                        <center><h1>Registration Form</h1></center>\n");
      out.write("                    </td>\n");
      out.write("                </th>\n");
      out.write("                <tr>\n");
      out.write("                    <td> First Name:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"fname\" id=\"fname\"></td>\n");
      out.write("                    <td><font color=\"red\" id=\"fname1\"></font></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Last Name:</td>\n");
      out.write("                    <td><input type=\"text\"name=\"lname\" id=\"lname\"></td>\n");
      out.write("                    <td> <font color=\"red\" id=\"lname1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Date of Birth:</td>\n");
      out.write("                    <td><input type=\"date\" name=\"dob\" id=\"dob\"></td>\n");
      out.write("                    <td> <font color=\"red\" id=\"dob1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Gender:</td>\n");
      out.write("                    <td>male<input type=\"radio\" name=\"gender\" value=\"male\" id=\"gender\">\n");
      out.write("                    female<input type=\"radio\" name=\"gender\" value=\"female\" id=\"gender\"></td>\n");
      out.write("                    <td><font color=\"red\" id=\"gender1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("               <!-- <tr>\n");
      out.write("                    <td> Father's Name:</td>\n");
      out.write("                    <td><input type=\"text\"name=\"ftname\" id=\"fathername\"></td>\n");
      out.write("                    <td> <font color=\"red\" id=fathername1\"></td>\n");
      out.write("                </tr>-->\n");
      out.write("               <tr>\n");
      out.write("                   <td>Father Name:</td>\n");
      out.write("                   <td> <input type=\"text\" name=\"fathername\" id=\"fathername\"></td>\n");
      out.write("                   <td><font color=\"red\" id=\"fathername1\"></td>\n");
      out.write("               </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> State:</td>\n");
      out.write("                    <td><input type=\"text\"name=\"state\" id=\"state\"></td>\n");
      out.write("                    <td> <font color=\"red\" id=\"state1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> district:</td>\n");
      out.write("                    <td><input type=\"text\"name=\"district\" id=\"district\"></td>\n");
      out.write("                    <td> <font color=\"red\" id=\"district1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Area:</td>\n");
      out.write("                    <td><input type=\"text\"name=\"area\" id=\"area\"></td>\n");
      out.write("                    <td> <font color=\"red\" id=\"area1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Zip Code:</td>\n");
      out.write("                    <td><input type=\"text\"name=\"zip\" id=\"zip\"></td>\n");
      out.write("                    <td> <font color=\"red\" id=\"zip1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> Mobile Number:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"number\" id=\"number\"></td>\n");
      out.write("                    <td><font color=\"red\" id=\"number1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   <td>Email:</td>\n");
      out.write("                   <td><input type=\"email\" name=\"email\" id=\"email\">\n");
      out.write("                   <td><font color=\"red\" id=\"email1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td> Branch Name:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"bname\" id=\"bname\"></td>\n");
      out.write("                    <td><font color=\"red\" id=\"bname1\"></font></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td> AAdhar No:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"aadhar\" id=\"aadhar\"></td>\n");
      out.write("                    <td><font color=\"red\" id=\"aadhar1\"></font></td>\n");
      out.write("                </tr>\n");
      out.write("                  <tr>\n");
      out.write("                    <td>Pan No:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"pan\" id=\"pan\"></td>\n");
      out.write("                    <td><font color=\"red\" id=\"pan1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Password:</td>\n");
      out.write("                    <td><input type=\"password\" name=\"password\" id=\"password\"></td>\n");
      out.write("                    <td><font color=\"red\" id=\"password1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Confirm Password:</td>\n");
      out.write("                    <td><input type=\"password\" name=\"cpassword\" id=\"cpassword\"></td>\n");
      out.write("                    <td><font color=\"red\" id=\"cpassword1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                   <td colspan=\"2\" align=\"center\">\n");
      out.write("                       <input type=\"submit\" value=\"submit\" onclick=\"return validation();\"></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("       </form>\n");
      out.write("        ");
      out.write("  <footer id=\"sticky-footer\" class=\"py-4 bg-dark text-white-50\">\n");
      out.write("    <div class=\"container text-center\">\n");
      out.write("      <small> <font color=\"red\">Created By Suman & Shankha</font></small>\n");
      out.write("    </div>\n");
      out.write("  </footer>");
      out.write("\n");
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
