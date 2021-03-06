package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.internet_banking.Databass;

public final class Detalis_005fUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Admin/pagefiles/Admin_sidepanel.jsp");
    _jspx_dependants.add("/Admin/pagefiles/Admin_navbar.jsp");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("    <title>Internet Banking</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS CDN -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css\">\n");
      out.write("    <!-- Our Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Css/Admin_css/Adminhome.css\">\n");
      out.write("\n");
      out.write("    <!-- Font Awesome JS -->\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/solid.js\"></script>\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        <!-- Adminsidepanel start -->\n");
      out.write("        ");
      out.write("<nav id=\"sidebar\">\n");
      out.write("            <div class=\"sidebar-header\">\n");
      out.write("                <h3>Admin's Home</h3>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <ul class=\"list-unstyled components\">\n");
      out.write("                 <li>\n");
      out.write("                    <a href=\"#\">My Profile</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"Admin_Dashboard.jsp\">Dashboard</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#banker\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Banker</a>\n");
      out.write("                    <ul class=\"collapse list-unstyled\" id=\"banker\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"BakDashboardAll.jsp\">All</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"BakDashboardApp.jsp\">Approved</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"BakDashboardRej.jsp\">Rejected</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#consumer\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Consumer</a>\n");
      out.write("                    <ul class=\"collapse list-unstyled\" id=\"consumer\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"UserDashboardAll.jsp\">All</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"UserDashboardApp.jsp\">Approved</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"UserDashboardRej.jsp\">Rejected</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">Broadcast Notices</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <ul class=\"list-unstyled CTAs\">\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Adminsidepanel End -->\n");
      out.write("        <!-- Admin_navbar start -->\n");
      out.write("        <div id=\"content\">\n");
      out.write("        ");
      out.write(" \n");
      out.write("\n");
      out.write("            <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                    <button type=\"button\" id=\"sidebarCollapse\" class=\"navbar-btn\">\n");
      out.write("                        <span></span>\n");
      out.write("                        <span></span>\n");
      out.write("                        <span></span>\n");
      out.write("                    </button>\n");
      out.write("                    <button class=\"btn btn-dark d-inline-block d-lg-none ml-auto\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <i class=\"fas fa-align-justify\"></i>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"nav navbar-nav ml-auto\">\n");
      out.write("                            <li class=\"nav-item active\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\"><i class=\"fas fa-bell fa-lg\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"../Logout.jsp\"><i class=\"fas fa-sign-out-alt fa-lg\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            \n");
      out.write("      \n");
      out.write(" ");
      out.write("\n");
      out.write("        <!-- Admin_navbar End -->\n");
      out.write("             <div class=\"card\">\n");
      out.write("                <table class=\"table table-hover\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td><h1>suman</h1></td>\n");
      out.write("                        <td><h1>Dhara</h1></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><h1>suman</h1></td>\n");
      out.write("                        <td><h1>Dhara</h1></td>\n");
      out.write("                        <td></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- jQuery CDN - Slim version (=without AJAX) -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("    <!-- Popper.JS -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\"></script>\n");
      out.write("    <!-- Bootstrap JS -->\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\" ></script>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $('#sidebar                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      Collapse').on('click', function () {\n");
      out.write("                $('#sidebar').toggleClass('active');\n");
      out.write("                $(this).toggleClass('active');\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
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
