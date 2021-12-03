package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\" style=\"background-image: url(img/banner-bg.jpg);\" >\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Bienvenido a ChivoMarket!</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/ContenedorCarga.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bulma.css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("        <script src=\"https://kit.fontawesome.com/41bcea2ae3.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"body\">\n");
      out.write("        <div id=\"contenedor_carga\"><div id=\"carga\"></div></div>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"icon__menu\">\n");
      out.write("                <i class=\"fas fa-bars\" id=\"btn_open\"></i>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"menu__side\" id=\"menu_side\">\n");
      out.write("            <div class=\"name__page\">\n");
      out.write("                <i class=\"fas fa-store\"></i>\n");
      out.write("                <h4>ChivoMarket</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"options__menu\">\t\n");
      out.write("                <a href=\"#\" class=\"selected\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fas fa-home\" title=\"Inicio\"></i>\n");
      out.write("                        <h4>Inicio</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"Controlador?accion=iniciar\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"far fa-user\" title=\"Portafolio\"></i>\n");
      out.write("                        <h4>Iniciar Sesion</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"Registro.jsp\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fas fa-address-card\" title=\"Cursos\"></i>\n");
      out.write("                        <h4>Registrarse</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"AcercadeNosotros.jsp\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"far fa-sticky-note\" title=\"Blog\"></i>\n");
      out.write("                        <h4>Acerca de Nosotros</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"Zonas.jsp\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-map-marker\"  title=\"Contacto\"></i>\n");
      out.write("                        <h4>Punto de referencias</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <main style=\"background-image: url(img/banner-bg.jpg);\">\n");
      out.write("            <section class=\"section is-medium\" style=\"background-image: url(https://w0.peakpx.com/wallpaper/654/548/HD-wallpaper-rgb-rain.jpg); text-align: center;\" >\n");
      out.write("                <h1 class=\"title\" style=\"color: white;\">Chivo Market</h1>\n");
      out.write("                <h2 class=\"subtitle\" style=\"color: white;\">\n");
      out.write("                    Bienvenido a nuestro sistema de usuarios, dedicado a la venta de articulos del gusto del cliente <br>\n");
      out.write("                    Sera un Gusto Atenderle a lo que necesite\n");
      out.write("                </h2>\n");
      out.write("            </section>\n");
      out.write("            <br><br><br>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row justify-content-start\">\n");
      out.write("                    <div class=\"col-4\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-content\">\n");
      out.write("                                <p class=\"title\">\n");
      out.write("                                    “Un sistema libre de errores, pensado para ti y para mi. Sientete comodo querido usuario y espero que la pases bien”\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"subtitle\">\n");
      out.write("                                    Grupo TI\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                            <footer class=\"card-footer\">\n");
      out.write("                                <p class=\"card-footer-item\">\n");
      out.write("                                    <span>\n");
      out.write("                                        Ver en <a href=\"https://twitter.com/codinghorror/status/506010907021828096\">Twitter</a>\n");
      out.write("                                    </span>\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"card-footer-item\">\n");
      out.write("                                    <span>\n");
      out.write("                                        Compartir en <a href=\"#\">Facebook</a>\n");
      out.write("                                    </span>\n");
      out.write("                                </p>\n");
      out.write("                            </footer>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-4\">\n");
      out.write("                        <div id=\"carouselExampleControls\" class=\"carousel slide\" data-bs-ride=\"carousel\">\n");
      out.write("                            <div class=\"carousel-inner\">\n");
      out.write("                                <div class=\"carousel-item active\">\n");
      out.write("                                    <img src=\"https://i.pinimg.com/originals/24/63/5d/24635d14bd8cd6250c642ad6393f97ef.gif\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"carousel-item\">\n");
      out.write("                                    <img src=\"https://c.tenor.com/HbLUlHHVKIgAAAAM/app-online-store.gif\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"carousel-item\">\n");
      out.write("                                    <img src=\"https://media4.giphy.com/media/3o85xFVvjn7iywaQUM/giphy.gif\" class=\"d-block w-100\" alt=\"...\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <button class=\"carousel-control-prev\" type=\"button\" data-bs-target=\"#carouselExampleControls\" data-bs-slide=\"prev\">\n");
      out.write("                                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                                <span class=\"visually-hidden\">Anterior</span>\n");
      out.write("                            </button>\n");
      out.write("                            <button class=\"carousel-control-next\" type=\"button\" data-bs-target=\"#carouselExampleControls\" data-bs-slide=\"next\">\n");
      out.write("                                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                                <span class=\"visually-hidden\">Siguiente</span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-4\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-content\">\n");
      out.write("                                <p class=\"title\">\n");
      out.write("                                    “Recuerda Usuario, Busca lo que quieras, chivo market esta pensado para el amor de las compras y pedidos por ticket”\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"subtitle\">\n");
      out.write("                                    Grupo TI\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                            <footer class=\"card-footer\">\n");
      out.write("                                <p class=\"card-footer-item\">\n");
      out.write("                                    <span>\n");
      out.write("                                        Ver en <a href=\"https://twitter.com/codinghorror/status/506010907021828096\">Twitter</a>\n");
      out.write("                                    </span>\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"card-footer-item\">\n");
      out.write("                                    <span>\n");
      out.write("                                        Compartir en <a href=\"#\">Facebook</a>\n");
      out.write("                                    </span>\n");
      out.write("                                </p>\n");
      out.write("                            </footer>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("        <script src=\"js/SistemaCarga.js\"></script>\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
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
