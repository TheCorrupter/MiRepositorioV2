package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _02_002dejemploajax_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#enviar\").on(\"click\",function () {\n");
      out.write("\n");
      out.write("                    $.ajax({\n");
      out.write("                        url: 'ServletAlumno',\n");
      out.write("                        type: 'POST',\n");
      out.write("                        data: $('#formx').serialize(),\n");
      out.write("                        success:function(datos){    \n");
      out.write("                            $(\"#tabdatos\").html(datos);\n");
      out.write("                            }\n");
      out.write("                    }) ;   \n");
      out.write("                }); //fin del evento click        \n");
      out.write("            });//fin de la funcion anonima\n");
      out.write("\n");
      out.write("           \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Datos de Alumno</h2>\n");
      out.write("        <form id=\"formx\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        Nombre\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"text\" name=\"nom\">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>\n");
      out.write("                        Sexo\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"radio\" name=\"sex\" value=\"Masculino\">Masculino\n");
      out.write("                        <input type=\"radio\" name=\"sex\" value=\"Femenino\">Femenino\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                       Deportes\n");
      out.write("                       <table>\n");
      out.write("                            <tr><td><input type=\"checkbox\"  name=\"dep\"value=\"Futbol\">Futbol</td></tr>\n");
      out.write("                            <tr><td><input type=\"checkbox\"  name=\"dep\"value=\"voley\">Voley</td></tr>\n");
      out.write("                            <tr><td><input type=\"checkbox\"  name=\"dep\"value=\"Karate\">Karate</td></tr>\n");
      out.write("                            <tr><td><input type=\"checkbox\"  name=\"dep\"value=\"Ciclismo\">Ciclismo</td></tr>\n");
      out.write("                            <tr><td><input type=\"checkbox\"  name=\"dep\"value=\"Parapente\">Parapente</td></tr>\n");
      out.write("                        </table>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Especialidad\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"esp\">\n");
      out.write("                            <option>Administracioin</option>\n");
      out.write("                            <option>Ing. de Sistemas</option>\n");
      out.write("                            <option>Ing. Electronica</option>\n");
      out.write("                            <option>Ing.Ambiental</option>\n");
      out.write("                            <option>Ing. Mecanica</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Cursos\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"cur\" multiple>\n");
      out.write("                            <option>Java</option>\n");
      out.write("                            <option>Base de Datos</option>\n");
      out.write("                            <option>UML</option>\n");
      out.write("                            <option>JavaScript</option>\n");
      out.write("                            <option>Oracle</option>\n");
      out.write("                        </select>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <tr>\n");
      out.write("                    <td>\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <button type=\"button\" id=\"enviar\">Enviar</button>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("        </form>\n");
      out.write("        <br><br>\n");
      out.write("        <hr>\n");
      out.write("        <table id=\"tabdatos\">\n");
      out.write("            \n");
      out.write("        </table>\n");
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
