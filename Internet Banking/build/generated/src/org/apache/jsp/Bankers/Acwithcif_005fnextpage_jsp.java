package org.apache.jsp.Bankers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import com.internet_banking.Databass;

public final class Acwithcif_005fnextpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/Bankers/pagefiles/Banker_sidepanel.jsp");
    _jspx_dependants.add("/Bankers/pagefiles/Banker_navbar.jsp");
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
      out.write("<!DOCTYPE html>\n");

                    String cif=request.getParameter("cif");
                    try
                    {
                        
                        ResultSet rs1 = new Databass().acc_detalisfetch(cif);
                        if(rs1.next())
                        {
                            
                        }
                        else
                        {
                             //response.sendRedirect("AcWithCIF.jsp");
                        }
                    }
                    catch(Exception ex){
                    
                    }
                    

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\n");
      out.write("    <title>internet Banking</title>\n");
      out.write("    <!--hiigit-->\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS CDN -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css\" >\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css\">\n");
      out.write("    <!-- Our Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Css/Banker_css/BankerHome.css\">\n");
      out.write("    <!-- Scrollbar Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.min.css\">\n");
      out.write("\n");
      out.write("    <!-- Font Awesome JS -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/js/solid.js\"></script>\n");
      out.write("    <script defer src=\"https://use.fontawesome.com/releases/v5.0.13/js/fontawesome.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"wrapper\">\n");
      out.write("        <!-- Sidebar  -->\n");
      out.write("        ");
      out.write("<nav id=\"sidebar\">\n");
      out.write("            <div class=\"sidebar-header\">\n");
      out.write("                <h3>Banker's Home</h3>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"list-unstyled components\">\n");
      out.write("                 <li class=\"active\">\n");
      out.write("                    <a href=\"#\">My Profile</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#txnsub\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Consumer Transaction</a>\n");
      out.write("                    <ul class=\"collapse list-unstyled\" id=\"txnsub\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#acdetails\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Account Deatils</a>\n");
      out.write("                            <ul class=\"collapse list-unstyled\" id=\"acdetails\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">View</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Update</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"Bdeposite.jsp\">Deposite</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"Bwithdrawl.jsp\">Withdrawl</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#capplication\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Consumer Applicaton</a>\n");
      out.write("                    <ul class=\"collapse list-unstyled\" id=\"capplication\">\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#nwac\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">New Account</a>\n");
      out.write("                            <ul class=\"collapse list-unstyled\" id=\"nwac\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"AcWithCIF.jsp\">Existing User</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"AcForNew_user.jsp\">New User</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\">Checkbook</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#atm\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Debit Card</a>\n");
      out.write("                            <ul class=\"collapse list-unstyled\" id=\"atm\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Apply For New</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Block</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Generate Pin</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Change Pin</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                         <li>\n");
      out.write("                            <a href=\"#credit\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Credit Card</a>\n");
      out.write("                            <ul class=\"collapse list-unstyled\" id=\"credit\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Apply For New</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Block</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Generate Pin</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Change Pin</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                         <li>\n");
      out.write("                            <a href=\"#ib\" data-toggle=\"collapse\" aria-expanded=\"false\" class=\"dropdown-toggle\">Internet Banking</a>\n");
      out.write("                            <ul class=\"collapse list-unstyled\" id=\"ib\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Apply as New</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Stop Service</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Password Management</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">Interest Rates</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">Services</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">Fixed Deposites</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">Loan</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("              <ul class=\"list-unstyled CTAs\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\">Back to Home</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Page Content  -->\n");
      out.write("          <div id=\"content\">\n");
      out.write("            ");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                    <button type=\"button\" id=\"sidebarCollapse\" class=\"btn btn-sm btn-sh\">\n");
      out.write("                        <i class=\"fas fa-align-left\"></i>\n");
      out.write("                        <span>Shrink me</span>\n");
      out.write("                    </button>\n");
      out.write("                    <button class=\"btn btn-dark d-inline-block d-lg-none ml-auto\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <i class=\"fas fa-align-justify\"></i>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"nav navbar-nav ml-auto\">\n");
      out.write("                            <li class=\"nav-item active\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\"><i class=\"fas fa-envelope-open-text fa-lg\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"nav-item\">\n");
      out.write("                                <a class=\"nav-link\" href=\"../Logout.jsp\"><i class=\"fas fa-sign-out-alt fa-lg\"></i></a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>");
      out.write("           \n");
      out.write("                               <form action=\"#\" method=\"POST\" id=\"cifac\">\n");
      out.write("             ");

                    try{
                        ResultSet rs=new Databass().acc_detalisfetch(cif);
                        if(rs.next())
                        {
                        
                        
             
      out.write("\n");
      out.write("                                <div class=\"row register-form\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                         <select class=\"form-control\" name=\"actype\" id=\"actype\" size=\"1\">\n");
      out.write("                                             <option value=\"\" disabled=\"\" selected=\"\">Select Account Type</option>\n");
      out.write("                                            <option value=\"savings\">Savings</option>\n");
      out.write("                                            <option value=\"current\">Current</option>\n");
      out.write("                                         </select>\n");
      out.write("                                            <div> <span style=\"color:red;\" id=\"cus1\"></span></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"First Name *\" id=\"fname\" name=\"fname\" value=\"");
      out.print(rs.getString("first_name"));
      out.write("\">\n");
      out.write("                                            <div> <span style=\"color:red;\" id=\"cus2\"></span></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Last Name *\" id=\"lname\" name=\"lname\" value=\"");
      out.print(rs.getString("last_name"));
      out.write("\">\n");
      out.write("                                             <div> <span style=\"color:red;\" id=\"cus3\"></span></div>\n");
      out.write("                                        </div>\n");
      out.write("                                       \n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Father's Name *\" id=\"ftname\" name=\"ftname\" value=\"");
      out.print(rs.getString("father_name"));
      out.write("\">\n");
      out.write("                                             <div> <span style=\"color:red;\" id=\"cus4\"></span></div>\n");
      out.write("                                        </div>\n");
      out.write("                                       \n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"date\" class=\"form-control\"  placeholder=\"Date of Birth *\" value=\"");
      out.print(rs.getString("dob"));
      out.write("\"name=\"dob\" id=\"dob\">\n");
      out.write("                                        </div><div> <span style=\"color:red;\" id=\"cus5\"></span></div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\"  placeholder=\"Gender *\" value=\"");
      out.print(rs.getString(""));
      out.write("\"name=\"gen\" id=\"gen\">\n");
      out.write("                                        </div><div> <span style=\"color:red;\" id=\"cus6\"></span></div>\n");
      out.write("                                        \n");
      out.write("                                         <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\"  placeholder=\"Applicant's Occupation *\" value=\"");
      out.print(rs.getString("first_name"));
      out.write("\" name=\"occupation\" id=\"occupation\">\n");
      out.write("                                            <div> <span style=\"color:red;\" id=\"cus7\"></span></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                         <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\"  placeholder=\"Annual Income *\" value=\"");
      out.print(rs.getString("first_name"));
      out.write("\" name=\"annual_income\" id=\"annual_income\">\n");
      out.write("                                            <div> <span style=\"color:red;\" id=\"cus8\"></span></div>\n");
      out.write("                                            \n");
      out.write("                                        </div>                                       \n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                          <div class=\"form-group\">\n");
      out.write("                                         <input type=\"text\" class=\"form-control\" placeholder=\"Branch Name *\" id=\"brname\" name=\"brname\" value=\"");
      out.print(rs.getString("first_name"));
      out.write("\">  \n");
      out.write("                                         <div> <span style=\"color:red;\" id=\"cus9\"></span></div>\n");
      out.write("                                          </div>\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Branch Code *\" id=\"brcode\" name=\"brcode\" value=\"");
      out.print(rs.getString("first_name"));
      out.write("\">  \n");
      out.write("                                        <div> <span style=\"color:red;\" id=\"cus10\"></span></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Country *\" id=\"country\" name=\"country\" value=\"");
      out.print(rs.getString("first_name"));
      out.write("\"> \n");
      out.write("                                             <div> <span style=\"color:red;\" id=\"cus11\"></span></div>\n");
      out.write("                                            </div>\n");
      out.write("                                        \n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"State *\" id=\"state\" name=\"state\" value=\"");
      out.print(rs.getString("first_name"));
      out.write("\">  \n");
      out.write("                                         <div> <span style=\"color:red;\" id=\"cus12\"></span></div>\n");
      out.write("                                             </div>\n");
      out.write("                                        \n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"District *\" id=\"district\" name=\"district\" value=\"");
      out.print(rs.getString("first_name"));
      out.write("\">  \n");
      out.write("                                         <div> <span style=\"color:red;\" id=\"cus13\"></span></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                         <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Locality *\" name=\"locality\" id=\"locality\" value=\"");
      out.print(rs.getString("first_name"));
      out.write("\">\n");
      out.write("                                            <div> <span style=\"color:red;\" id=\"cus14\"></span></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                         <div class=\"form-group\">\n");
      out.write("                                            <input type=\"text\" class=\"form-control\" placeholder=\"Zip Code *\" name=\"zip_code\" id=\"zip_code\" value=\"");
      out.print(rs.getString("first_name"));
      out.write("\">\n");
      out.write("                                              <div> <span style=\"color:red;\" id=\"cus15\"></span></div>\n");
      out.write("                                        </div>\n");
      out.write("                                      \n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"email\" class=\"form-control\" placeholder=\"Email *\"name=\"email\" id=\"email\" value=\"");
      out.print(rs.getString("first_name"));
      out.write("\">\n");
      out.write("                                            <div> <span style=\"color:red;\" id=\"cus16\"></span></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"tel\" class=\"form-control\" placeholder=\"Phone *\" name=\"Phone_no\" id=\"Phone_no\"value=\"");
      out.print(rs.getString("first_name"));
      out.write("\">\n");
      out.write("                                             <div> <span style=\"color:red;\" id=\"cus17\"></span></div>\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                        <input type=\"submit\" class=\"btn btn-lg btnRegister\"  value=\"Submit\" onclick=\"\" >\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                       ");

                            }
                           }
                           
                    catch(Exception ex){

}
                        
      out.write("\n");
      out.write("                            </form>\n");
      out.write("                 \n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- jQuery CDN - Slim version (=without AJAX) -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("    <!-- Popper.JS -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js\"></script>\n");
      out.write("    <!-- Bootstrap JS -->\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- jQuery Custom Scroller CDN -->\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function () {\n");
      out.write("            $(\"#sidebar\").mCustomScrollbar({\n");
      out.write("                theme: \"minimal\"\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            $('#sidebarCollapse').on('click', function () {\n");
      out.write("                $('#sidebar, #content').toggleClass('active');\n");
      out.write("                $('.collapse.in').toggleClass('in');\n");
      out.write("                $('a[aria-expanded=true]').attr('aria-expanded', 'false');\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
