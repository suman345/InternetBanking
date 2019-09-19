package org.apache.jsp.Home;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/Home/../File_Source/Navmain.jsp");
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
      out.write("<head>\n");
      out.write("  <title>Internet Banking</title> \n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"../Css/index.css\" />\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  \n");
      out.write("                 ");
      out.write("<head>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"../Css/NavMain_style.css\">\n");
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
      out.write("        <li class=\"dropdown\">\n");
      out.write("          <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><b>Login</b> <span class=\"caret\"></span></a>\n");
      out.write("\t\t\t<ul id=\"login-dp\" class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t <div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t\tLogin via\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"social-buttons\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-fb\"><i class=\"fa fa-facebook\"></i> Facebook</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-tw\"><i class=\"fa fa-twitter\"></i> Twitter</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("                                or\n");
      out.write("\t\t\t\t\t\t\t\t <form class=\"form\" role=\"form\" method=\"post\" action=\"login\" accept-charset=\"UTF-8\" id=\"login-nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <label class=\"sr-only\" for=\"exampleInputEmail2\">Email address</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail2\" placeholder=\"Email address\" required>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <label class=\"sr-only\" for=\"exampleInputPassword2\">Password</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword2\" placeholder=\"Password\" required>\n");
      out.write("                                             <div class=\"help-block text-right\"><a href=\"\">Forget the password ?</a></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <button type=\"submit\" class=\"btn btn-primary btn-block\">Sign in</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"checkbox\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t <input type=\"checkbox\"> keep me logged-in\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t </label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t </form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"bottom text-center\">\n");
      out.write("\t\t\t\t\t\t\t\tNew here ? <a href=\"#\"><b>Join Us</b></a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("         \n");
      out.write("      <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("        <input class=\"form-control mr-sm-2\" type=\"text\" placeholder=\"Search\">\n");
      out.write("        <button class=\"btn btn-secondary my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("      </form>\n");
      out.write("       \n");
      out.write("    </div>\n");
      out.write("    </nav>\n");
      out.write("    \n");
      out.write("    <!-- Navbar end -->\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>");
      out.write("\n");
      out.write("                 <br>\n");
      out.write("                \n");
      out.write("       <div class=\"container-fluid\">\n");
      out.write("          <div class=\"row\">\n");
      out.write("      \n");
      out.write("                                                <!--Carousel Wrapper-->\n");
      out.write("                <div id=\"carousel-example-2\" class=\"carousel slide carousel-fade\" data-ride=\"carousel\">\n");
      out.write("                  <!--Indicators-->\n");
      out.write("                  <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#carousel-example-2\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#carousel-example-2\" data-slide-to=\"1\"></li>\n");
      out.write("                    <li data-target=\"#carousel-example-2\" data-slide-to=\"2\"></li>\n");
      out.write("                  </ol>\n");
      out.write("                  <!--/.Indicators-->\n");
      out.write("                  <!--Slides-->\n");
      out.write("                  <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                      <div class=\"view\">\n");
      out.write("                          <img class=\"d-block w-100\" src=\"../Image/Slider1.jpg\"\n");
      out.write("                          alt=\"First slide\">\n");
      out.write("                        <div class=\"mask rgba-black-light\"></div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"carousel-caption\">\n");
      out.write("                        <h3 class=\"h3-responsive\">Light mask</h3>\n");
      out.write("                        <p>First text</p>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                      <!--Mask color-->\n");
      out.write("                      <div class=\"view\">\n");
      out.write("                          <img class=\"d-block w-100\" src=\"../Image/Slider2.jpg\"\n");
      out.write("                          alt=\"Second slide\">\n");
      out.write("                        <div class=\"mask rgba-black-strong\"></div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"carousel-caption\">\n");
      out.write("                        <h3 class=\"h3-responsive\">Strong mask</h3>\n");
      out.write("                        <p>Secondary text</p>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                      <!--Mask color-->\n");
      out.write("                      <div class=\"view\">\n");
      out.write("                          <img class=\"d-block w-100\" src=\"../Image/Slider3.jpg\"\n");
      out.write("                          alt=\"Third slide\">\n");
      out.write("                        <div class=\"mask rgba-black-slight\"></div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"carousel-caption\">\n");
      out.write("                        <h3 class=\"h3-responsive\">Slight mask</h3>\n");
      out.write("                        <p>Third text</p>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("  <!--/.Slides end-->\n");
      out.write("  <!--Controls-->\n");
      out.write("</body>\n");
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
