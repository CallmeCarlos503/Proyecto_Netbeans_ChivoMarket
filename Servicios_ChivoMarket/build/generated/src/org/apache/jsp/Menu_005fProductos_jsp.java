package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import service.Productos;
import Modelo.Service_Productos;
import service.Cliente;

public final class Menu_005fProductos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Productos de Chivo Market</title>\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/ContenedorCarga.css\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bulma.css\">\n");
      out.write("\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://kit.fontawesome.com/41bcea2ae3.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"body\">\n");
      out.write("        ");

            if (session.getAttribute("ID") == null) {
                response.sendRedirect("Index.jsp");
            }

        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
            Cliente cl = new Cliente();
            cl = (Cliente) request.getSession().getAttribute("Cliente");


        
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
      out.write("            <div class=\"name__page\" id=\"exclusion\">\n");
      out.write("                <i class=\"fas fa-store\"></i>\n");
      out.write("                <h4 style=\"color:salmon;\">");
      out.print( session.getAttribute("user"));
      out.write("</h4>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"options__menu\" id=\"excluyente\" style=\"color:black;\">\t\n");
      out.write("\n");
      out.write("                <a href=\"\" class=\"selected\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-product-hunt\" title=\"Todo para ti usuario promedio\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Productos</h4>\n");
      out.write("                    </div> \n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"resultado.jsp?accion=ELECTRONICO\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-desktop\" title=\"Categorias\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Electronica</h4>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"resultado.jsp?accion=MODA\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-smile-o\" title=\"Moda\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Moda General y urbana</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"resultado.jsp?accion=OTROS\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-filter\" title=\"Otros\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Otros</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"Carrito_Compras.jsp?ID_User=");
      out.print( session.getAttribute("ID"));
      out.write("\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-cart-plus\" title=\"Carrito\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Carrito de Compras</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <a href=\"Index.jsp\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-sign-out\" title=\"Exit\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Salir Sesion</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <main style=\"background-image: url(img/banner-bg.jpg);\">\n");
      out.write("\n");
      out.write("            <section class=\"section is-medium\" style=\"background-image: url(https://w0.peakpx.com/wallpaper/654/548/HD-wallpaper-rgb-rain.jpg); text-align: center;\" >\n");
      out.write("                <h1 class=\"title\" style=\"color: white;\">Chivo Market</h1>\n");
      out.write("                <h2 class=\"subtitle\" style=\"color: white;\">\n");
      out.write("                    Selecciona lo que gustes de manera general!\n");
      out.write("                </h2>\n");
      out.write("                <form action=\"resultado.jsp\">\n");
      out.write("                    <input class=\"input is-info\" type=\"text\" placeholder=\"Tostadora del futuro 3000\" name=\"txtBusco\" id=\"searchTerm\" onkeyup=\"doSearch()\" style=\"color: white;\">\n");
      out.write("                    <br><br>\n");
      out.write("\n");
      out.write("                    <br>     \n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("            <br><br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");

                Service_Productos Service = new Service_Productos();
                List<Productos> datos = Service.listarProducto();

            
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <table class=\"table\" id=\"datos\"  >\n");
      out.write("                <tr>\n");
      out.write("                    <th colspan=\"3\" align=\"center\">\n");
      out.write("                        Menu de seleccion\n");
      out.write("                    </th>\n");
      out.write("                </tr>\n");
      out.write("                ");
                    for (Productos pro : datos) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <input type=\"hidden\" id=\"id\" name=\"id\">\n");
      out.write("                        <input type=\"hidden\" id=\"ncontador\" name=\"ncontador\">\n");
      out.write("                        <h5>Nombre:      ");
      out.print(pro.getNombre());
      out.write("</h5>\n");
      out.write("                        <p> Cantidad:    ");
      out.print( pro.getCantidad());
      out.write(" </p>\n");
      out.write("                        ");

                            String MSJ;
                            if (pro.getCantidad() > 0) {
                                MSJ = "Disponible";
                            } else {
                                MSJ = "no disponible";
                            }
                        
      out.write("\n");
      out.write("                        <p style=\"color:red;\">\n");
      out.write("                            ");
      out.print(MSJ);
      out.write("\n");
      out.write("                        </p>\n");
      out.write("                        <p> Precio:      ");
      out.print( pro.getPrecio());
      out.write(" </p>\n");
      out.write("                        <p> Descripcion:<br>      ");
      out.print( pro.getDescripcion());
      out.write(" </p>\n");
      out.write("                        <p hidden>");
      out.print( pro.getIDCategoria());
      out.write("</p>\n");
      out.write("                        <form method=\"Post\" action=\"Controlador?accion=Agregar&Nombre=");
      out.print(pro.getNombre());
      out.write("&Precio=");
      out.print( pro.getPrecio());
      out.write("&ID_Producto=");
      out.print( pro.getID());
      out.write("&ID=");
      out.print( session.getAttribute("ID"));
      out.write("&Cantidad=");
      out.print( pro.getCantidad());
      out.write("\">\n");
      out.write("                            <p>Seleccione su cantidad</p> \n");
      out.write("                            <input type=\"number\" value=\"1\" min=\"1\" max=\"");
      out.print( pro.getCantidad());
      out.write("\" name=\"txtcantidad\" requiered=\"true\" > <br> <br>\n");
      out.write("                            <input type=\"submit\" value=\"Agregar\" class=\"btn btn-primary\">\n");
      out.write("                            <div class=\"modal\">\n");
      out.write("                                <div class=\"modal-background\"></div>\n");
      out.write("                                <div class=\"modal-content\">\n");
      out.write("                                    <!-- Any other Bulma elements you want -->\n");
      out.write("                                </div>\n");
      out.write("                                <button class=\"modal-close is-large\" aria-label=\"close\"></button>\n");
      out.write("                            </div>\n");
      out.write("                        </form> \n");
      out.write("\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("\n");
      out.write("                        <img src=\"");
      out.print(pro.getImagen());
      out.write("\"  style=\"width: 213px; height: 194px; \">\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("        <script src=\"js/BuscadorTabla.js\" type=\"text/javascript\"></script>\n");
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
