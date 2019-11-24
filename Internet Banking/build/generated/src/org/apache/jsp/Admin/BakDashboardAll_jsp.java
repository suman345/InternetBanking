package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.internet_banking.Databass;
import java.sql.ResultSet;

public final class BakDashboardAll_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("         <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\r\n");
      out.write("    <title>Internet Banking</title>\r\n");
      out.write("<!--     Bootstrap CSS CDN -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" >\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css\">\r\n");
      out.write("<!--    Boostrap Datatable-->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css\">\r\n");
      out.write("<!--\r\n");
      out.write("    Boostrap Datatable end\r\n");
      out.write("     Our Custom CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"../Css/Admin_css/Adminhome.css\">\r\n");
      out.write("<!--     Font Awesome JS -->\r\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/solid.js\"></script>\r\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("   \r\n");
      out.write("     <script>\r\n");
      out.write("      function Activate(val)\r\n");
      out.write("        {\r\n");
      out.write("            \r\n");
      out.write("           var loc=\"ModifyBanket.jsp?activate=\"+val;\r\n");
      out.write("            window.location=loc;\r\n");
      out.write("        }\r\n");
      out.write("        function Reject(val)\r\n");
      out.write("        {\r\n");
      out.write("//            alert(\"d\");\r\n");
      out.write("            var loc=\"ModifyBanket.jsp?Reject=\"+val;\r\n");
      out.write("            window.location=loc;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        function Details(val)\r\n");
      out.write("        {    var loc=\"Details_Banker.jsp?Details=\"+val;\r\n");
      out.write("            window.location=loc; \r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("    <div class=\"wrapper\">\r\n");
      out.write("        <!-- Adminsidepanel start -->\r\n");
      out.write("        ");
      out.write("<nav id=\"sidebar\">\r\n");
      out.write("            <div class=\"sidebar-header\">\r\n");
      out.write("                <h3>Admin's Home</h3>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"list-unstyled components\">\r\n");
      out.write("                 <li class=\"active\">\r\n");
      out.write("                    <a href=\"#\">My Profile</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"Admin_Dashboard.jsp\">Dashboard</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#banker\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Banker</a>\r\n");
      out.write("                    <ul class=\"collapse list-unstyled\" id=\"banker\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"BakDashboardAll.jsp\">All</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"BakDashboardApp.jsp\">Approved</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"BakDashboardRej.jsp\">Rejected</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#consumer\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Consumer</a>\r\n");
      out.write("                    <ul class=\"collapse list-unstyled\" id=\"consumer\">\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">All</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Approved</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li>\r\n");
      out.write("                            <a href=\"#\">Rejected</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\">Broadcast Notices</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("            <ul class=\"list-unstyled CTAs\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"home.html\">Back to Home</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("\r\n");
      out.write("        <!-- Adminsidepanel End -->\r\n");
      out.write("        <!-- Admin_navbar start -->\r\n");
      out.write("        <div id=\"content\">\r\n");
      out.write("        ");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("            <nav class=\"navbar navbar-expand-lg\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                    <button type=\"button\" id=\"sidebarCollapse\" class=\"navbar-btn\">\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </button>\r\n");
      out.write("                    <button class=\"btn btn-dark d-inline-block d-lg-none ml-auto\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("                        <i class=\"fas fa-align-justify\"></i>\r\n");
      out.write("                    </button>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("                        <ul class=\"nav navbar-nav ml-auto\">\r\n");
      out.write("                            <li class=\"nav-item active\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"#\"><i class=\"fas fa-bell fa-lg\"></i></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"nav-item\">\r\n");
      out.write("                                <a class=\"nav-link\" href=\"../Logout.jsp\"><i class=\"fas fa-sign-out-alt fa-lg\"></i></a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </nav>\r\n");
      out.write("            \r\n");
      out.write("      \r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("        <!-- Admin_navbar End -->\r\n");
      out.write("         <div class=\"card\">\r\n");
      out.write("        <table class=\"table table-hover\" id=\"suman\">\r\n");
      out.write("            <thead>\r\n");
      out.write("              <tr>\r\n");
      out.write("                <th scope=\"col\">ID</th>\r\n");
      out.write("                <th scope=\"col\">Email</th>\r\n");
      out.write("                <th scope=\"col\">Applicant Status</th>\r\n");
      out.write("                <th scope=\"col\">Edit List </th>\r\n");
      out.write("                <th scope=\"col\">Details</th>\r\n");
      out.write("              </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("            <tbody>\r\n");
      out.write("            ");

                try{
                     ResultSet rs=new Databass().BankerDetail();
                while(rs.next())
                {
            
      out.write("\r\n");
      out.write("              <tr>\r\n");
      out.write("                  <th scope=\"row\">");
      out.print(rs.getString("id"));
      out.write("</th>\r\n");
      out.write("                <td>");
      out.print(rs.getString("username"));
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print((rs.getString("isActive").equals("1"))? "Approved":"Pending");
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("                                    ");
if(!rs.getString("isActive").equals("1"))
                                    {
      out.write("\r\n");
      out.write("                                        <button class=\"btn btn-sm btn-primary\" onclick=\"Activate('");
      out.print(rs.getString("username"));
      out.write("')\"><i class=\"far fa-edit\"></i> Activate</button>\r\n");
      out.write("                                    ");
}
                                    else
                                    {
      out.write("\r\n");
      out.write("                                        <button class=\"btn btn-sm btn-danger\" onClick=\"Reject('");
      out.print(rs.getString("username"));
      out.write("')\"><i class=\"fas fa-trash-alt\"></i> Reject</button>\r\n");
      out.write("                                    ");
}
      out.write("\r\n");
      out.write("                                  </td>        \r\n");
      out.write("                                  <td><button class=\"btn btn-sm btn-info\" onclick=\"Details('");
      out.print(rs.getString("username"));
      out.write("')\"><i class=\"fas fa-info-circle\"></i> Details</button> </td>     \r\n");
      out.write("                  \r\n");
      out.write("              </tr>\r\n");
      out.write("              ");

                 
                  }
                }catch(Exception a)
                {}
               
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("          </table>\r\n");
      out.write("    </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("   \r\n");
      out.write("    \r\n");
      out.write("  <!--jQuery CDN - Slim version (=without AJAX)--> \r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("     <!--Popper.JS--> \r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\" integrity=\"sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("     <!--Bootstrap JS--> \r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\" integrity=\"sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            $('#sidebarCollapse').on('click', function () {\r\n");
      out.write("                $('#sidebar').toggleClass('active');\r\n");
      out.write("                $(this).toggleClass('active');\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.js\"></script>\r\n");
      out.write("\t<script src=\"https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("\t<script src=\"https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t$('#suman').DataTable();\r\n");
      out.write("\t\t} );\r\n");
      out.write("\t</script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    </body>\r\n");
      out.write("</html>   ");
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
