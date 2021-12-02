package org.apache.jsp;

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" style=\"background-image: url(img/banner-bg.jpg);\" >\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Bienvenido a ChivoMarket!</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/ContenedorCarga.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bulma.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link href=\"css/alertify.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"js/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/alertify.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("\n");
      out.write("        <script src=\"https://kit.fontawesome.com/41bcea2ae3.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"contenedor_carga\"><div id=\"carga\"></div></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <header>\n");
      out.write("            <div class=\"icon__menu\">\n");
      out.write("                <i class=\"fas fa-bars\" id=\"btn_open\"></i>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <div class=\"menu__side\" id=\"menu_side\">\n");
      out.write("\n");
      out.write("            <div class=\"name__page\">\n");
      out.write("                <i class=\"fas fa-store\"></i>\n");
      out.write("                <h4>ChivoMarket</h4>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"options__menu\">\t\n");
      out.write("\n");
      out.write("                <a href=\"Index.jsp\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fas fa-home\" title=\"Inicio\"></i>\n");
      out.write("                        <h4>Inicio</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"\" class=\"selected\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"far fa-user\" title=\"Portafolio\"></i>\n");
      out.write("                        <h4>Iniciar Sesion</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"Registro.jsp\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fas fa-address-card\" title=\"Cursos\"></i>\n");
      out.write("                        <h4>Registrarse</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"AcercadeNosotros.jsp\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"far fa-sticky-note\" title=\"Blog\"></i>\n");
      out.write("                        <h4>Acerca de Nosotros</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"Zonas.jsp\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-map-marker\"  title=\"Contacto\"></i>\n");
      out.write("                        <h4>Punto de referencias</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <main style=\"background-image: url(img/banner-bg.jpg);\">\n");
      out.write("            <form action=\"Controlador\" method=\"GET\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row justify-content-start\">\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("\n");
      out.write("                            <center>\n");
      out.write("                                <img src=\"img/Login.png\" alt=\"\">\n");
      out.write("                            </center>\n");
      out.write("                            <div class=\"field\">\n");
      out.write("                                <label class=\"label\">Correo electronico</label>\n");
      out.write("                                <div class=\"control\">\n");
      out.write("                                    <input class=\"form-control\" name=\"txtCorreo\" type=\"email\" placeholder=\"ChivoMarket@chivo.com\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"field\">\n");
      out.write("                                <label class=\"label\">Contraseña</label>\n");
      out.write("                                <div class=\"control\">\n");
      out.write("                                    <input class=\"form-control\" type=\"password\" name=\"txtPassword\" placeholder=\"Zapote23\" required>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"control\">\n");
      out.write("\n");
      out.write("                                <button class=\"btn btn-success\" id=\"btn1\" type=\"submit\" name=\"accion\" value=\"Ingresar\">\n");
      out.write("                                    Iniciar Sesion\n");
      out.write("                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-box-arrow-in-right\" viewBox=\"0 0 16 16\">\n");
      out.write("                                    <path fill-rule=\"evenodd\" d=\"M6 3.5a.5.5 0 0 1 .5-.5h8a.5.5 0 0 1 .5.5v9a.5.5 0 0 1-.5.5h-8a.5.5 0 0 1-.5-.5v-2a.5.5 0 0 0-1 0v2A1.5 1.5 0 0 0 6.5 14h8a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2h-8A1.5 1.5 0 0 0 5 3.5v2a.5.5 0 0 0 1 0v-2z\"/>\n");
      out.write("                                    <path fill-rule=\"evenodd\" d=\"M11.854 8.354a.5.5 0 0 0 0-.708l-3-3a.5.5 0 1 0-.708.708L10.293 7.5H1.5a.5.5 0 0 0 0 1h8.793l-2.147 2.146a.5.5 0 0 0 .708.708l3-3z\"/>\n");
      out.write("                                    </svg>\n");
      out.write("                                </button>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-4\">\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <BR><br>\n");
      out.write("                ");

                    if (session.getAttribute("Denego") == null) {

                    } else {


                
      out.write("\n");
      out.write("                ");
                String msj = (String) session.getAttribute("Denego");
                    if (msj.equals("1")) {


                
      out.write("\n");
      out.write("                <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("                    swal(\"Que mal!\", \"Correo o contraseña mal colocada\", \"error\");\n");
      out.write("\n");
      out.write("                </script>\n");
      out.write("                ");
                    session.setAttribute("Denego", null);
                
      out.write("\n");
      out.write("\n");
      out.write("                ");
                    }
                    }
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </main>    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"js/SistemaCarga.js\"></script>\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
      out.write("\n");
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
