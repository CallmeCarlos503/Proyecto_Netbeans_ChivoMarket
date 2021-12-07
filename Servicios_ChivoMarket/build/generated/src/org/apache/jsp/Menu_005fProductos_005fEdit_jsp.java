package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import service.Productos;
import service.Productos;
import Modelo.Service_Productos;
import service.Trabajador;
import service.Trabajador;

public final class Menu_005fProductos_005fEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Productos de Chivo Market</title>\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/ContenedorCarga.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bulma.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/purecss@2.0.6/build/pure-min.css\" integrity=\"sha384-Uu6IeWbM+gzNVXJcM9XV3SohHtmWE+3VGi496jvgX1jyvDTXfdK+rfZc8C1Aehk5\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/41bcea2ae3.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body id=\"body\">\n");
      out.write("        ");

            if (session.getAttribute("ID") == null) {
                response.sendRedirect("Index.jsp");
            }
        
      out.write("\n");
      out.write("        ");
            Trabajador TL = new Trabajador();
            TL = (Trabajador) request.getSession().getAttribute("Trabajador");

        
      out.write("\n");
      out.write("        <div id=\"contenedor_carga\"><div id=\"carga\"></div></div>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"icon__menu\">\n");
      out.write("                <i class=\"fas fa-bars\" id=\"btn_open\"></i>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"menu__side\" id=\"menu_side\">\n");
      out.write("            <div class=\"name__page\" id=\"exclusion\">\n");
      out.write("                <i class=\"fas fa-store\"></i>\n");
      out.write("                <h4 style=\"color:salmon;\">");
      out.print( session.getAttribute("user"));
      out.write("</h4>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"options__menu\" id=\"excluyente\" style=\"color:black;\">\t\n");
      out.write("                ");

                    if (session.getAttribute("Rol") == null) {

                    } else {
                
      out.write("\n");
      out.write("                ");
                       if (session.getAttribute("Rol").equals(2)) {

                
      out.write("\n");
      out.write("                <a href=\"Menu_Productos_Edit.jsp\" class=\"selected\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-product-hunt\" title=\"Todo para ti usuario promedio\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Productos</h4>\n");
      out.write("                    </div> \n");
      out.write("                </a>\n");
      out.write("                <a href=\"resultado_Trabajador.jsp?accion=ELECTRONICO\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-desktop\" title=\"Categorias\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Electronica</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"resultado_Trabajador.jsp?accion=MODA\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-smile-o\" title=\"Moda\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Moda General y urbana</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"resultado_Trabajador.jsp?accion=OTROS\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-filter\" title=\"Otros\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Otros</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"AgregarP.jsp\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-plus\" title=\"Carrito\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Agregar Productos</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"ListaTrabajador.jsp\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fas fa-user-plus\" title=\"Carrito\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Lista de trabajadores</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                ");

                    if (session.getAttribute("Rol").equals(1)) {
                
      out.write("\n");
      out.write("                <a href=\"#\" class=\"selected\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-product-hunt\" title=\"Todo para ti usuario promedio\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Productos</h4>\n");
      out.write("                    </div> \n");
      out.write("                </a>\n");
      out.write("                <a href=\"resultado_Trabajador.jsp?accion=ELECTRONICO\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-desktop\" title=\"Categorias\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Electronica</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"resultado_Trabajador.jsp?accion=MODA\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-smile-o\" title=\"Moda\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Moda General y urbana</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"resultado_Trabajador.jsp?accion=OTROS\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-filter\" title=\"Otros\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Otros</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                <a href=\"Cancelar.jsp\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-check-square\"title=\"Carrito\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Cancelar Producto</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("                <a href=\"Index.jsp\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-sign-out\" title=\"Exit\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Salir Sesion</h4>\n");
      out.write("                    </div>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <main style=\"background-image: url(img/banner-bg.jpg);\">\n");
      out.write("            <section class=\"section is-medium\" style=\"background-image: url(https://w0.peakpx.com/wallpaper/654/548/HD-wallpaper-rgb-rain.jpg); text-align: center;\" >\n");
      out.write("                <h1 class=\"title\" style=\"color: white;\">Chivo Market</h1>\n");
      out.write("                <h2 class=\"subtitle\" style=\"color: white;\">\n");
      out.write("                    Selecciona lo que gustes de manera general!\n");
      out.write("                </h2>\n");
      out.write("                <input class=\"input is-info\" type=\"text\" placeholder=\"Tostadora del futuro 3000\" name=\"txtBusco\" id=\"searchTerm\" onkeyup=\"doSearch()\" style=\"color: white;\">\n");
      out.write("                <br><br>\n");
      out.write("                <br>     \n");
      out.write("            </section>\n");
      out.write("            <br><br>\n");
      out.write("            ");

                Service_Productos Service = new Service_Productos();
                List<Productos> datos = Service.listarProducto();
            
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
      out.write("                    <td>\n");
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
      out.write("                        <p hidden>");
      out.print( pro.getIDCategoria());
      out.write("</p>\n");
      out.write("                        <div class=\"mb-auto\">\n");
      out.write("                            <p>Descripcion:<br>   ");
      out.print(pro.getDescripcion());
      out.write("</p>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            if (session.getAttribute("Rol") == null) {

                            } else {
                        
      out.write("\n");
      out.write("                        ");
                            if (session.getAttribute("Rol").equals(2)) {
                        
      out.write("\n");
      out.write("                        <form method=\"Post\" action=\"Controlador\">\n");
      out.write("                            <a href=\"Area_de_edicion.jsp?ID_Producto=");
      out.print(pro.getID());
      out.write("\"class=\"btn btn-primary\">Editar\n");
      out.write("                                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-pencil\" viewBox=\"0 0 16 16\">\n");
      out.write("                                <path d=\"M12.146.146a.5.5 0 0 1 .708 0l3 3a.5.5 0 0 1 0 .708l-10 10a.5.5 0 0 1-.168.11l-5 2a.5.5 0 0 1-.65-.65l2-5a.5.5 0 0 1 .11-.168l10-10zM11.207 2.5 13.5 4.793 14.793 3.5 12.5 1.207 11.207 2.5zm1.586 3L10.5 3.207 4 9.707V10h.5a.5.5 0 0 1 .5.5v.5h.5a.5.5 0 0 1 .5.5v.5h.293l6.5-6.5zm-9.761 5.175-.106.106-1.528 3.821 3.821-1.528.106-.106A.5.5 0 0 1 5 12.5V12h-.5a.5.5 0 0 1-.5-.5V11h-.5a.5.5 0 0 1-.468-.325z\"/>\n");
      out.write("                                </svg>\n");
      out.write("                            </a>\n");
      out.write("                            <a href=\"Controlador?accion=EliminarP&ID=");
      out.print(pro.getID());
      out.write("\" class=\"btn btn-danger\">Eliminar\n");
      out.write("                                <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" fill=\"currentColor\" class=\"bi bi-trash\" viewBox=\"0 0 16 16\">\n");
      out.write("                                <path d=\"M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z\"/>\n");
      out.write("                                <path fill-rule=\"evenodd\" d=\"M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z\"/>\n");
      out.write("                                </svg>\n");
      out.write("                            </a>\n");
      out.write("                        </form>\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                        ");
}
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <img src=\"");
      out.print(pro.getImagen());
      out.write("\"  style=\"width: 213px; height: 194px; \">\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </table>\n");
      out.write("            ");

                if (session.getAttribute("OBO") == null) {

                } else {

            
      out.write("\n");
      out.write("            ");
if (session.getAttribute("OBO").equals("1")) {

            
      out.write("\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                swal(\"Exito!\", \"Se logro la modificaciones del producto\", \"success\");\n");
      out.write("            </script>\n");
      out.write("            ");
}
                    session.setAttribute("OBO", null);
                }
      out.write("\n");
      out.write("            ");

                if (session.getAttribute("SD") == null) {
                } else {
            
      out.write("\n");
      out.write("            ");
              if (session.getAttribute("SD").equals("2")) {
            
      out.write("\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                swal(\"Exito!\", \"Se logro la Insercion del producto\", \"success\");\n");
      out.write("            </script>\n");
      out.write("            ");
                      session.setAttribute("SD", null);
                    }
                }
            
      out.write("\n");
      out.write("            ");
if (session.getAttribute("Cancel") == null) {
                } else {
            
      out.write("\n");
      out.write("            ");
if (session.getAttribute("Cancel").equals("3")) {
            
      out.write("\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                swal(\"Exito!\", \"Se logro la cancelacion del producto\", \"success\");\n");
      out.write("            </script>\n");
      out.write("            ");
session.setAttribute("Cancel", null);
      out.write("\n");
      out.write("            ");
}
                }
      out.write("\n");
      out.write("        </main>\n");
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
