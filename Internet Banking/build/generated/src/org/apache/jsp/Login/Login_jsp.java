package org.apache.jsp.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("          <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Css/Login_css/Login_css.css\">\n");
      out.write("        <title>login</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <nav class=\"navbar navbar-expand-lg\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"#\">My Bank</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"><i class=\"fas fa-hamburger fa-lg\"></i></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"home.html\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("    </ul>\n");
      out.write("      <p id=\"signUpQuery\">Don's have an account ? </p>\n");
      out.write("      <div class=\"dropdown\">\n");
      out.write("      <button class=\"btn btn-md dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\">\n");
      out.write("        Sign Up\n");
      out.write("      </button>\n");
      out.write("      <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\n");
      out.write("        <a class=\"dropdown-item\" href=\"#\"><span><i class=\"fas fa-user\"></i></span> Customer</a>\n");
      out.write("        <a class=\"dropdown-item\" href=\"../Bankers/Banker_Registration.jsp\"><span><i class=\"fas fa-user-tie\"></i></span> Banker</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</nav>\n");
      out.write("    \n");
      out.write("        <form action=\"../Mainlogin\" method=\"POST\" style=\"max-width:500px;margin:auto; margin-top: 100px;\">\n");
      out.write("      <h1 id=\"heading\"><i class=\"fas fa-sign-in-alt fa-2x\"></i>Login Here</h1>\n");
      out.write("      <div class=\"input-container\">\n");
      out.write("        <i class=\"fa fa-envelope icon\"></i>\n");
      out.write("        <input class=\"input-field\" type=\"text\" placeholder=\"Email\" name=\"email\" id=\"email\">\n");
      out.write("      </div>\n");
      out.write("      <div> <span style=\"color:red;\" id=\"emp2\"></span></div>\n");
      out.write("      <div class=\"input-container\">\n");
      out.write("        <i class=\"fa fa-key icon\"></i>\n");
      out.write("        <input class=\"input-field\" type=\"password\" placeholder=\"Password\" name=\"psw\" id=\"password\">\n");
      out.write("      </div>\n");
      out.write("      <div> <span style=\"color:red;\" id=\"emp3\"></span></div>\n");
      out.write("      <p id=\"forgetpw\">Have you forgot your password ? >> <a href=\"#\" style=\"color: black; font-size: 14px; font-style: italic; font-synthesis: weight;\">Click here</a></p>\n");
      out.write("      <button type=\"submit\" class=\"btn\" id=\"Loginbtn\" onclick=\"return login_validation();\">Login</button>\n");
      out.write("      </form>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    <!-- Optional JavaScript -->\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("    <script src=\"../Java_Script/Login.js\"></script>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("    \n");
      out.write("  </body>\n");
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
