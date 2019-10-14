package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/User/../File_Source/Navmain.jsp");
    _jspx_dependants.add("/User/../File_Source/Footermain.jsp");
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>login</title>\n");
      out.write("            <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("            <!--External css -->\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"../Css/Login_css.css\">\n");
      out.write(" \n");
      out.write("    </head>\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\n");
      out.write("<body>\n");
      out.write("    ");
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
      out.write("    <div id=\"login\">\n");
      out.write("<!--        <h3 class=\"text-center text-white pt-5\">Login form</h3>-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div id=\"login-row\" class=\"row justify-content-center align-items-center\">\n");
      out.write("                <div id=\"login-column\" class=\"col-md-6\">\n");
      out.write("                    <div id=\"login-box\" class=\"col-md-12\">\n");
      out.write("                        <form id=\"login-form\" class=\"form\" action=\"\" method=\"post\">\n");
      out.write("                            <h3 class=\"text-center text-info\">Login</h3>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"username\" class=\"text-info\">Username:</label><br>\n");
      out.write("                                <input type=\"text\" name=\"username\" id=\"username\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"password\" class=\"text-info\">Password:</label><br>\n");
      out.write("                                <input type=\"password\" name=\"password\" id=\"password\" class=\"form-control\">\n");
      out.write("                            </div>\n");
      out.write("                             <div id=\"new_account\" class=\"text-right\">\n");
      out.write("                                <a href=\"#\">Create New Account</a>\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"remember-me\" class=\"text-info\"><span>Remember me</span> <span><input id=\"remember-me\" name=\"remember-me\" type=\"checkbox\"></span></label><br>\n");
      out.write("                                <input type=\"submit\" name=\"submit\" class=\"btn btn-info btn-md\" value=\"submit\">\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"register-link\" class=\"text-right\">\n");
      out.write("                                <a href=\"#\" class=\"text-info\">Forget Password</a>\n");
      out.write("                            </div>\n");
      out.write("                         </form>  \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("       </div>\n");
      out.write("    </div>\n");
      out.write("    <br>    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    ");
      out.write("  <footer id=\"sticky-footer\" class=\"py-4 bg-dark text-white-50\">\n");
      out.write("    <div class=\"container text-center\">\n");
      out.write("      <small> <font color=\"red\">Created By Suman & Shankha</font></small>\n");
      out.write("    </div>\n");
      out.write("  </footer>");
      out.write("\n");
      out.write("            <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("            <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("</body>\n");
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
