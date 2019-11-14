package org.apache.jsp.Bankers;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Banker_005fRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Css/Banker_css/Banker_Registration.css\">\r\n");
      out.write("    <script src=\"../Java_Script/Banker_js/Banker_Registration.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <title>Banker's Login</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  <nav class=\"navbar navbar-expand-lg\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"#\">My Bank</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"><i class=\"fas fa-hamburger fa-lg\"></i></span>\r\n");
      out.write("  </button>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("      <p id=\"Query\">Already have an account ? </p>\r\n");
      out.write("      <div class=\"dropdown\">\r\n");
      out.write("          <a href=\"../Login/Login.jsp\">\r\n");
      out.write("           <button class=\"btn btn-md\" type=\"button\" id=\"logButton\">\r\n");
      out.write("        Login\r\n");
      out.write("      </button>\r\n");
      out.write("          </a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</nav>\r\n");
      out.write("    \r\n");
      out.write("      <form action=\"../Banker_Registration\" method=\"POST\" style=\"max-width:500px;margin:auto; margin-top: 30px; background-color: rgba(0,0,0,0.4); border-style: double; border-color: aliceblue; padding: 5px;\">\r\n");
      out.write("      <h1 id=\"heading\">Register Here</h1>\r\n");
      out.write("      <div class=\"input-container\">\r\n");
      out.write("        <input class=\"input-field\" type=\"text\" placeholder=\"Employee Id\" id=\"EmpId\" name=\"EmpId\">\r\n");
      out.write("       \r\n");
      out.write("        </div>\r\n");
      out.write("         <div> <span style=\"color:red;\" id=\"emp1\"></span></div>\r\n");
      out.write("         <div class=\"input-container\">\r\n");
      out.write("        <input class=\"input-field\" type=\"text\" placeholder=\"Branch Name\" id=\"BranchNm\" name=\"BranchNm\">\r\n");
      out.write("        </div>\r\n");
      out.write("           <div> <span style=\"color:red;\" id=\"emp2\"></span></div>\r\n");
      out.write("         <div class=\"input-container\">\r\n");
      out.write("        <input class=\"input-field\" type=\"text\" placeholder=\"Branch Code\" id=\"BranchCd\" name=\"BranchCd\">\r\n");
      out.write("        </div>\r\n");
      out.write("             <div> <span style=\"color:red;\" id=\"emp3\"></span></div>\r\n");
      out.write("         <div class=\"input-container\">\r\n");
      out.write("        <input class=\"input-field\" type=\"text\" placeholder=\"IFSC Code\" id=\"ifsc\" name=\"ifsc\">\r\n");
      out.write("        </div>\r\n");
      out.write("               <div> <span style=\"color:red;\" id=\"emp4\"></span></div>\r\n");
      out.write("         <div class=\"input-container\">\r\n");
      out.write("        <input class=\"input-field\" type=\"text\" placeholder=\"Employee Name\" id=\"EmpNm\" name=\"EmpNm\">\r\n");
      out.write("        </div>\r\n");
      out.write("                 <div> <span style=\"color:red;\" id=\"emp5\"></span></div>\r\n");
      out.write("        <div class=\"input-container\">\r\n");
      out.write("          <input class=\"input-field\" type=\"text\" placeholder=\"Email\" name=\"email\" id=\"email\">\r\n");
      out.write("        </div>\r\n");
      out.write("                   <div> <span style=\"color:red;\" id=\"emp6\"></span></div>\r\n");
      out.write("         <div class=\"input-container\">\r\n");
      out.write("        <input class=\"input-field\" type=\"text\" placeholder=\"Mobile Number\" id=\"MobNo\" name=\"MobNo\">\r\n");
      out.write("        </div>\r\n");
      out.write("                     <div> <span style=\"color:red;\" id=\"emp7\"></span></div>\r\n");
      out.write("         <div class=\"input-container\">\r\n");
      out.write("        <input class=\"input-field\" type=\"text\" placeholder=\"Aadhar No\" id=\"Aadhar\" name=\"Aadhar\">\r\n");
      out.write("        </div>\r\n");
      out.write("                       <div> <span style=\"color:red;\" id=\"emp8\"></span></div>\r\n");
      out.write("         <div class=\"input-container\">\r\n");
      out.write("        <input class=\"input-field\" type=\"text\" placeholder=\"Pan Number\" id=\"Pan\" name=\"Pan\">\r\n");
      out.write("        </div>\r\n");
      out.write("                         <div> <span style=\"color:red;\" id=\"emp9\"></span></div>\r\n");
      out.write("<!--        <div class=\"input-container\">\r\n");
      out.write("        <input class=\"input-field\" type=\"Password\" placeholder=\"Password\" id=\"Password\" name=\"Password\">\r\n");
      out.write("        </div>\r\n");
      out.write("                           <div> <span style=\"color:red;\" id=\"emp10\"></span></div>\r\n");
      out.write("        <div class=\"input-container\">\r\n");
      out.write("        <input class=\"input-field\" type=\"password\" placeholder=\"Comfrim Password\" id=\"Cpassword\" name=\"Cpassword\">\r\n");
      out.write("        </div>\r\n");
      out.write("                             <div> <span style=\"color:red;\" id=\"emp11\"></span></div>\r\n");
      out.write("      <div>-->\r\n");
      out.write("<!--        <input type=\"submit\" class=\"btn\" id=\"RegBtn\" value=\"Register\" oncilck=\"return bankers_validation()\">\r\n");
      out.write("         <input type=\"submit\" onclick=\"return user_validation()\">-->\r\n");
      out.write("         <input type=\"submit\" class=\"btn\" id=\"RegBtn\" value=\"Register\" onclick=\"return bankers_validation();\">\r\n");
      out.write("      </div>\r\n");
      out.write("      </form>\r\n");
      out.write("      \r\n");
      out.write("      \r\n");
      out.write("    <!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("  </body>\r\n");
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
