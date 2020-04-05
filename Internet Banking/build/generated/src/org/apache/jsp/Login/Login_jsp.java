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

      out.write('\r');
      out.write('\n');

    int err=0;
    try{
            String msg=request.getParameter("msg");
            if(msg.equals("error1"))
            {
                err = 1;
            }
            else
            {
                if(msg.equals("error2"))
                {
                    err = 2;
                }
                else
                {
                    if(msg.equals("error3"))
                    {
                        err=3;
                    }
                }
            }
        }
    catch(Exception ex)
    {
        
    }

 
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("          <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../Css/Login_css/Login_css.css\">\r\n");
      out.write("    <script>\r\n");
      out.write("        function value()\r\n");
      out.write("        {\r\n");
      out.write("            document.getElementById('msg').innerHTML=\"The user id or password that you've entered is incorrect.\";\r\n");
      out.write("        }\r\n");
      out.write("        function value2()\r\n");
      out.write("        {\r\n");
      out.write("            document.getElementById('msg').innerHTML=\"Username/Password can not Empty\";\r\n");
      out.write("        }\r\n");
      out.write("        function value3()\r\n");
      out.write("        {\r\n");
      out.write("            document.getElementById('msg').innerHTML=\"You can't Login because Admin not Approve wait while of Time\";\r\n");
      out.write("        }\r\n");
      out.write("         function gfg_Run() { \r\n");
      out.write("                document.addEventListener('contextmenu',  \r\n");
      out.write("                        event => event.preventDefault()); \r\n");
      out.write("                alert(\"Right click disabled\"); \r\n");
      out.write("            }\r\n");
      out.write("            $('#email').bind(\"cut copy paste\",function(e) {\r\n");
      out.write("     e.preventDefault();\r\n");
      out.write(" });\r\n");
      out.write("    </script>\r\n");
      out.write("        <title>login</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body onload=\"");
 if(err==1){out.print("value()");}
                      else
                      {
                         if(err==2){out.print("value2()");}
                         else
                         {
                             if(err==3){out.print("value3()");}
                         }
                      }
          
      out.write("\" oncontextmenu=\"gfg_Run()\">\r\n");
      out.write("       <nav class=\"navbar navbar-expand-lg\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"#\">NDBL Bank</a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"><i class=\"fas fa-hamburger fa-lg\"></i></span>\r\n");
      out.write("  </button>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("          <a class=\"nav-link\" href=\"../index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("      <p id=\"signUpQuery\">Don's have an account ? </p>\r\n");
      out.write("      <div class=\"dropdown\">\r\n");
      out.write("      <button class=\"btn btn-md dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"true\">\r\n");
      out.write("        Sign Up\r\n");
      out.write("      </button>\r\n");
      out.write("      <div class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\">\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"../User/UserRegister.jsp\"><span><i class=\"fas fa-user\"></i></span> Customer</a>\r\n");
      out.write("        <a class=\"dropdown-item\" href=\"../Bankers/Banker_Registration.jsp\"><span><i class=\"fas fa-user-tie\"></i></span> Banker</a>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</nav>\r\n");
      out.write("    \r\n");
      out.write("        <form action=\"../Mainlogin\" method=\"POST\" style=\"max-width:500px;margin:auto; margin-top: 100px;\">\r\n");
      out.write("      <h1 id=\"heading\"><i class=\"fas fa-sign-in-alt fa-2x\"></i>Login Here</h1>\r\n");
      out.write("      \r\n");
      out.write("      <div class=\"input-container\">\r\n");
      out.write("        <i class=\"fa fa-envelope icon\"></i>\r\n");
      out.write("        <input class=\"input-field\" type=\"text\" placeholder=\"Username\" name=\"email\" id=\"email\" onCut=\"return false\"   oncopy=\"return false\" >\r\n");
      out.write("        <div> <span style=\"color:aqua;\" id=\"emp2\"></span></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"input-container\">\r\n");
      out.write("        <i class=\"fa fa-key icon\"></i>\r\n");
      out.write("        <input class=\"input-field\" type=\"password\" placeholder=\"Password\" name=\"psw\" id=\"password\" onCut=\"return false\" oncopy=\"return false\">\r\n");
      out.write("        <div> <span style=\"color:aqua;\" id=\"emp3\"></span></div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"msg\" style=\"color: aliceblue; background-color: #000aa3; width: 90%; text-align: center; font-family: sans-serif; border-radius: 20%; margin-bottom: 20px;\"></div>\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("          <div class=\"row\">\r\n");
      out.write("              <div class=\"col-md-7\">\r\n");
      out.write("                  <p id=\"forgetpw\">Have you forgot your password ? >> <a href=\"../Forgot_password/Forgot.jsp\" style=\"color: black; font-size: 14px; font-style: italic; font-synthesis: weight;\">Click here</a></p> \r\n");
      out.write("<!--                  <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"modal\" data-target=\"#myModal\"> Open modal </button>-->\r\n");
      out.write("              </div>\r\n");
      out.write("              <div class=\"col-md-5 text-right\">\r\n");
      out.write("      <button type=\"submit\" class=\"btn btn-lg \" id=\"Loginbtn\" onclick=\"\">Login</button>\r\n");
      out.write("      </div>\r\n");
      out.write("          </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      </form>   \r\n");
      out.write("    <!-- Optional JavaScript -->\r\n");
      out.write("    <!-- jQuery first, then Popper.js, then Bootstrap JS -->\r\n");
      out.write("    <script src=\"../Java_Script/Login_js/Login.js\"></script>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
