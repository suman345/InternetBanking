package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.internet_banking.Databass;
import java.sql.ResultSet;

public final class User_005fHome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/User/Pagefiles/User_sidepanel.jsp");
    _jspx_dependants.add("/User/Pagefiles/User_navbar.jsp");
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
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("    <title>Internet_Banking</title>\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Css/User_css/User_Home.css\">    \n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/solid.js\"></script>\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js\"></script>   \n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        ");
      out.write("\n");
      out.write("<!-- Side nav Start -->\n");
      out.write("        <nav id=\"sidebar\">\n");
      out.write("            <div class=\"sidebar-header\">\n");
      out.write("                <h3 style=\"text-align: center;\">NLDB Bank</h3>\n");
      out.write("                <strong>NB</strong>\n");
      out.write("                <div class=\"line\"></div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <ul class=\"list-unstyled components\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"UserMyprofile.jsp\" style=\"text-align: center;\">\n");
      out.write("                        <i class=\"fas fa-user-circle\"></i>\n");
      out.write("                        My Profile\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#homeSubmenu\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\" style=\"text-align: center;\">\n");
      out.write("                        <i class=\"fas fa-info-circle\"></i>\n");
      out.write("                        Account info\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"collapse list-unstyled\" id=\"homeSubmenu\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"Ac_balance.jsp\" style=\"text-align: center;\"> <i class=\"fas fa-wallet\"></i>Account Balance</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\" style=\"text-align: center;\"> <i class=\"fas fa-receipt\"></i>Transactions</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" style=\"text-align: center;\">\n");
      out.write("                        <i class=\"fas fa-file-alt\"></i>\n");
      out.write("                        View Statement\n");
      out.write("                    </a>\n");
      out.write("                    <a href=\"#pageSubmenu\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\" style=\"text-align: center;\">\n");
      out.write("                        <i class=\"fas fa-dolly-flatbed\"></i>\n");
      out.write("                        Services\n");
      out.write("                    </a>\n");
      out.write("                    <ul class=\"collapse list-unstyled\" id=\"pageSubmenu\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\" style=\"text-align: center;\"><i class=\"fas fa-money-check\"></i>Checkbook</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\" style=\"text-align: center;\"><i class=\"fas fa-credit-card\"></i>Debit Card</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\" style=\"text-align: center;\"><i class=\"fas fa-credit-card\"></i>Credit Card</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" style=\"text-align: center;\">\n");
      out.write("                        <i class=\"fas fa-question\"></i>\n");
      out.write("                        FAQ\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("            <ul class=\"list-unstyled CTAs\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">Download Statement</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("        <!-- Side nav end -->");
      out.write("\n");
      out.write("        <div id=\"content\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                    <button type=\"button\" id=\"sidebarCollapse\" class=\"btn\">\n");
      out.write("                        <i class=\"fas fa-angle-double-left\"></i>\n");
      out.write("                        <span></span>\n");
      out.write("                    </button>\n");
      out.write("                    <button class=\"btn btn-dark d-inline-block d-lg-none ml-auto\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <i class=\"fas fa-align-justify\"></i>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"nav navbar-nav ml-auto\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\" style=\"color: aliceblue;\"><i class=\"fas fa-sync fa-lg\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item active\">\n");
      out.write("                                <a class=\"nav-link\" href=\"../Logout.jsp\" style=\"color: aliceblue;\"><i class=\"fas fa-sign-out-alt fa-lg\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"alert alert-warning alert-dismissible\" role=\"alert\">\n");
      out.write("                        <button type=\"button\" onclick=\"this.parentNode.parentNode.removeChild(this.parentNode);\" class=\"close\" data-dismiss=\"alert\"><span aria-hidden=\"true\">×</span></button>\n");
      out.write("                        <marquee><p style=\"font-family: Lucida Handwriting; font-size: 18pt;\">NLDB Bank never asks for confidential information sush as PIN and OTP from customers. Any such call can be made only by a fraudster. Please do not share personal information.</p></marquee>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        try{
                            
                            String email;
                            email=session.getAttribute("bankerid").toString();
                            ResultSet rs = new Databass().user_welcome(email);
                            if(rs.next())
                            {
                        
      out.write("\n");
      out.write("                        <div><h2 id=\"wc\" style=\"color: aliceblue;\">hiii...&nbsp;");
      out.print(rs.getString("first_name") );
      out.write("&nbsp;&nbsp;");
      out.print( rs.getString("last_name"));
      out.write("</h2></div>\n");
      out.write("                </div>\n");
      out.write("                        ");

                            }
                        }catch(Exception ex){

}
                            
      out.write("\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $('#sidebarCollapse').on('click', function () {\n");
      out.write("                $('#sidebar').toggleClass('active');\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("\n");
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
