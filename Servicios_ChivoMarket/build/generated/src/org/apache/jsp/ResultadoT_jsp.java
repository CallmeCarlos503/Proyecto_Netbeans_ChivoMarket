package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import service.Productos;
import java.text.DecimalFormat;
import service.Ticket;
import java.util.List;
import Modelo.*;
import service.Trabajador;

public final class ResultadoT_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Carrito de Compras</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/main.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/ContenedorCarga.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/uikit@3.9.4/dist/css/uikit.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bulma.css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/uikit@3.9.4/dist/js/uikit.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/uikit@3.9.4/dist/js/uikit-icons.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ\" crossorigin=\"anonymous\"></script>\n");
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
      out.write("                <a href=\"Menu_Productos_Edit.jsp\" >\n");
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
      out.write("                <a href=\"ListaTrabajador.jsp\" >\n");
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
      out.write("                <a href=\"Menu_Productos_Edit.jsp\" >\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-product-hunt\" title=\"Todo para ti usuario promedio\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Productos</h4>\n");
      out.write("                    </div> \n");
      out.write("                </a>\n");
      out.write("\n");
      out.write("                <a href=\"resultado_Trabajador.jsp?accion=ELECTRONICO\">\n");
      out.write("                    <div class=\"option\">\n");
      out.write("                        <i class=\"fa fa-desktop\" title=\"Categorias\"></i>\n");
      out.write("                        <h4 style=\"color:salmon;\">Electronica</h4>\n");
      out.write("\n");
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
      out.write("                <a href=\"Cancelar.jsp\" class=\"selected\">\n");
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
      out.write("                <form action=\"resultado.jsp\">\n");
      out.write("                    <h1>Reporte Especifico de ticket</h1>     \n");
      out.write("                </form>\n");
      out.write("            </section>\n");
      out.write("            <br><br>\n");
      out.write("            <table class=\"table table-dark table-hover\">\n");
      out.write("                <tr>\n");
      out.write("                    ");

                        int Dato = Integer.parseInt(request.getParameter("txtID"));
                        Service_Ticket Ticket = new Service_Ticket();
                        Service_Productos po = new Service_Productos();
                        List<Ticket> lista = Ticket.busquedaT(Dato);
                        int resp = 0;
                        double Total = 0.00;
                        double multiplicador = 0.00;
                    
      out.write("\n");
      out.write("                    <td>Nombre</td>\n");
      out.write("                    <td>Cantidad </td>\n");
      out.write("                    <td>Precio </td>\n");
      out.write("                    <td>Cantidad x Precio </td>\n");
      out.write("                    <td>Accione a seleccion</td>\n");
      out.write("                </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");
 for (Ticket ti : lista) {
                            DecimalFormat ff = new DecimalFormat("#.00");
                            double precio = ti.getPrecio();
                            ff.format(precio);
                            multiplicador = ti.getPrecio() * ti.getCantidad();
                            List<Productos> pross = po.busquedaIDProducto(ti.getIDProducto());
                            for (Productos por : pross) {
                                resp = por.getCantidad() + ti.getCantidad();
                            }
                    
      out.write("\n");
      out.write("                <form action=\"Controlador?txtID=");
      out.print(ti.getIDUsuario());
      out.write("&ID_Ticket=");
      out.print(ti.getID());
      out.write("&ID_Producto=");
      out.print(ti.getIDProducto());
      out.write("&Cantidad=");
      out.print(ti.getCantidad());
      out.write("\" method=\"POST\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td> ");
      out.print(ti.getNombre());
      out.write("</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"number\" min=\"1\" max=\"");
      out.print(resp);
      out.write("\" name=\"txtCantidad\" value=\"");
      out.print(ti.getCantidad());
      out.write("\" placeholder=\"");
      out.print(ti.getCantidad());
      out.write("\"> </td>\n");
      out.write("                        <td> ");
      out.print(ff.format(precio));
      out.write("</td>\n");
      out.write("                        <td type=\"hidden\">\n");
      out.write("                            ");
      out.print(ff.format(multiplicador));
      out.write("\n");
      out.write("                        </td>\n");
      out.write("                        <td>\n");
      out.write("                            <button class=\"btn btn-danger\" value=\"EliminarTi\" name=\"accion\" type=\"submit\">Eliminar</button>\n");
      out.write("                            <button class=\"btn btn-primary\" value=\"ModificarTT\" name=\"accion\" type=\"submit\">Modificar</button>\n");
      out.write("                        </td>\n");
      out.write("                </form>\n");
      out.write("                ");

                    Total = Total + multiplicador;
                
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                ");
                            }
                
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("            ");
                    DecimalFormat ff2 = new DecimalFormat("#.00");
            
      out.write("\n");
      out.write("            <h1>TOTAL A PAGAR: $");
      out.print(ff2.format(Total));
      out.write("</h1> <br>\n");
      out.write("            <h4>ID DE REFERENCIA:");
      out.print(request.getParameter("txtID"));
      out.write(" </h4>\n");
      out.write("            <center>\n");
      out.write("                <a class=\"btn btn-danger\" href=\"Controlador?ID=");
      out.print(request.getParameter("txtID"));
      out.write("&accion=Cancelar\">Cancelar</a>\n");
      out.write("                <br><br>\n");
      out.write("\n");
      out.write("                <p uk-margin>\n");
      out.write("                    <a class=\"uk-button uk-button-default btn btn-secondary\" href=\"#modal-media-image\" uk-toggle>Generar Codigo</a>\n");
      out.write("                </p>\n");
      out.write("                <br>\n");
      out.write("                <div id=\"smart-button-container\">\n");
      out.write("                    <div style=\"text-align: center;\">\n");
      out.write("                        <div id=\"paypal-button-container\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <script src=\"https://www.paypal.com/sdk/js?client-id=sb&enable-funding=venmo&currency=USD\" data-sdk-integration-source=\"button-factory\"></script>\n");
      out.write("                <script>\n");
      out.write("                    function initPayPalButton() {\n");
      out.write("                        paypal.Buttons({\n");
      out.write("                            style: {\n");
      out.write("                                shape: 'pill',\n");
      out.write("                                color: 'blue',\n");
      out.write("                                layout: 'vertical',\n");
      out.write("                                label: 'pay',\n");
      out.write("\n");
      out.write("                            },\n");
      out.write("\n");
      out.write("                            createOrder: function (data, actions) {\n");
      out.write("                                return actions.order.create({\n");
      out.write("                                    purchase_units: [{\"amount\": {\"currency_code\": \"USD\", \"value\": ");
      out.print(Total);
      out.write("}}]\n");
      out.write("                                });\n");
      out.write("                            },\n");
      out.write("\n");
      out.write("                            onApprove: function (data, actions) {\n");
      out.write("                                return actions.order.capture().then(function (orderData) {\n");
      out.write("\n");
      out.write("                                    // Full available details\n");
      out.write("                                    console.log('Capture result', orderData, JSON.stringify(orderData, null, 2));\n");
      out.write("\n");
      out.write("                                    // Show a success message within this page, e.g.\n");
      out.write("                                    const element = document.getElementById('paypal-button-container');\n");
      out.write("                                    element.innerHTML = '';\n");
      out.write("                                    element.innerHTML = '<h3>Thank you for your payment!</h3>';\n");
      out.write("\n");
      out.write("                                    // Or go to another URL:  actions.redirect('thank_you.html');\n");
      out.write("\n");
      out.write("                                });\n");
      out.write("                            },\n");
      out.write("\n");
      out.write("                            onError: function (err) {\n");
      out.write("                                console.log(err);\n");
      out.write("                            }\n");
      out.write("                        }).render('#paypal-button-container');\n");
      out.write("                    }\n");
      out.write("                    initPayPalButton();\n");
      out.write("                </script>\n");
      out.write("            </center>\n");
      out.write("            <br>\n");
      out.write("            <div id=\"modal-media-image\" class=\"uk-flex-top \" uk-modal>\n");
      out.write("                <div class=\"uk-modal-dialog uk-width-auto uk-margin-auto-vertical\">\n");
      out.write("                    <button class=\"uk-modal-close-outside\" type=\"button\" uk-close></button>\n");
      out.write("                    <img src=\"img/qr-code.png\" width=\"350\" alt=\"\"/>                   \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/BuscadorTabla.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/SistemaCarga.js\"></script>\n");
      out.write("        <script src=\"js/script.js\"></script>\n");
      out.write("</body>\n");
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
