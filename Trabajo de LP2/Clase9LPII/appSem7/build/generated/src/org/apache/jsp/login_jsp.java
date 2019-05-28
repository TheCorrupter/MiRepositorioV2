package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <link href=\"bootstrap/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"bootstrap/css/bootstrap-responsive.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("       \n");
      out.write("        <style type=\"text/css\">    \n");
      out.write("            body {\n");
      out.write("                padding-top: 40px;\n");
      out.write("                padding-bottom: 40px;\n");
      out.write("                background-color: #f5f5f5;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-signin {\n");
      out.write("                max-width: 300px;\n");
      out.write("                padding: 19px 29px 29px;\n");
      out.write("                margin: 0 auto 20px;\n");
      out.write("                background-color: #fff;\n");
      out.write("                border: 1px solid #e5e5e5;\n");
      out.write("                -webkit-border-radius: 5px;\n");
      out.write("                -moz-border-radius: 5px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);\n");
      out.write("                -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);\n");
      out.write("                box-shadow: 0 1px 2px rgba(0,0,0,.05);\n");
      out.write("            }\n");
      out.write("            .form-signin .form-signin-heading,\n");
      out.write("            .form-signin .checkbox {\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("            .form-signin input[type=\"text\"],\n");
      out.write("            .form-signin input[type=\"password\"] {\n");
      out.write("                font-size: 16px;\n");
      out.write("                height: auto;\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("                padding: 7px 9px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            //valor cuando usuario es incorrecto
        String msg=(String)request.getAttribute("msg");
        
      out.write("\n");
      out.write("        <h1></h1>\n");
      out.write("      \n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <form class=\"form-signin\" action=\"validarUser\" method=\"post\">\n");
      out.write("                <h2 class=\"form-signin-heading\">Iniciar Sesion</h2>\n");
      out.write("                <input  name=\"txtus\"type=\"text\" class=\"input-block-level\" placeholder=\"Usuario\">\n");
      out.write("                <input name=\"txtpas\" type=\"password\" class=\"input-block-level\" placeholder=\"Password\">\n");
      out.write("                <label class=\"checkbox\">\n");
      out.write("                    ");
      out.print(msg!=null? msg:"");
      out.write("\n");
      out.write("                </label>\n");
      out.write("                <button class=\"btn btn-large btn-primary\" type=\"submit\">Aceptar</button>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div> <!-- /container -->\n");
      out.write("\n");
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
