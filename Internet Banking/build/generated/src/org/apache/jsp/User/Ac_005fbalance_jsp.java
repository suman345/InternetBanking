package org.apache.jsp.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ac_005fbalance_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
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
      out.write("    <link rel=\"stylesheet\" href=\"../Css/User_css/User_Home.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Css/User_css/User_balance_check.css\">\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/solid.js\"></script>\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js\"></script>\n");
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
      out.write("                            <a href=\"#\" style=\"text-align: center;\"> <i class=\"fas fa-wallet\"></i>Account Balance</a>\n");
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
      out.write("                        <!-- User Balance Start -->\n");
      out.write("            \n");
      out.write("             <div class=\"container register\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <ul class=\"nav nav-tabs nav-justified\" id=\"myTab\" role=\"tablist\">\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link active\" id=\"home-tab\" data-toggle=\"tab\" href=\"#home\" role=\"tab\" aria-controls=\"home\" aria-selected=\"true\">Current Balance</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" id=\"profile-tab\" data-toggle=\"tab\" href=\"#profile\" role=\"tab\" aria-controls=\"profile\" aria-selected=\"false\">Last Transactions</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"tab-content\" id=\"myTabContent\">\n");
      out.write("                            <div class=\"tab-pane fade show active text-align form-new\" id=\"home\" role=\"tabpanel\" aria-labelledby=\"home-tab\">\n");
      out.write("                                <h6 class=\"register-heading\">Your Current Account Balance Is:</h6>\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                <p style=\"text-align: center; color: blanchedalmond; font-size: 30px; font-family: serif;\">INR.</p>\n");
      out.write("                                <p id=\"blnc\" name=\"blnc\" style=\"color: black; text-align: center; font-family:fantasy;\">32532</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"tab-pane fade show text-align form-new\" id=\"profile\" role=\"tabpanel\" aria-labelledby=\"profile-tab\">\n");
      out.write("                                <h6  class=\"register-heading\">Your last 5 transactions are</h6>\n");
      out.write("                                <div>\n");
      out.write("                                <!--Table-->\n");
      out.write("                                    <table class=\"table table-striped\">\n");
      out.write("                                      <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                          <th scope=\"col\">Date</th>\n");
      out.write("                                          <th scope=\"col\">Transaction Detail</th>\n");
      out.write("                                          <th scope=\"col\">Amount</th>\n");
      out.write("                                          <th scope=\"col\">Transaction type</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                      </thead>\n");
      out.write("                                      <tbody>\n");
      out.write("                                        <tr>\n");
      out.write("                                          <th scope=\"row\">1</th>\n");
      out.write("                                          <td>Mark</td>\n");
      out.write("                                          <td>Otto</td>\n");
      out.write("                                          <td>jyu</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                          <th scope=\"row\">2</th>\n");
      out.write("                                          <td>Jacob</td>\n");
      out.write("                                          <td>Thornton</td>\n");
      out.write("                                          <td>hthf</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                          <th scope=\"row\">3</th>\n");
      out.write("                                          <td>Larry</td>\n");
      out.write("                                          <td>the Bird</td>\n");
      out.write("                                          <td>ghhfhj</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                          <th scope=\"row\">4</th>\n");
      out.write("                                          <td>Larry</td>\n");
      out.write("                                          <td>the Bird</td>\n");
      out.write("                                          <td>ghhfhj</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                          <tr>\n");
      out.write("                                          <th scope=\"row\">5</th>\n");
      out.write("                                          <td>Larry</td>\n");
      out.write("                                          <td>the Bird</td>\n");
      out.write("                                          <td>ghhfhj</td>\n");
      out.write("                                        </tr>\n");
      out.write("                                      </tbody>\n");
      out.write("</table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("             <!--ac_balance end-->\n");
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
