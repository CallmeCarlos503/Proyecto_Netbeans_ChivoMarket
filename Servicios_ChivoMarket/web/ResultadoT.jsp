<%-- 
    Document   : ResultadoT
    Created on : 18-nov-2021, 13:04:45
    Author     : carlo
--%>
<%@page import="service.Productos"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="service.Ticket"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.*"%>
<%@page import="service.Trabajador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carrito de Compras</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/ContenedorCarga.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.9.4/dist/css/uikit.min.css" />
        <link rel="stylesheet" href="css/bulma.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
        <link rel="stylesheet" href="css/estilos.css">
        <script src="https://cdn.jsdelivr.net/npm/uikit@3.9.4/dist/js/uikit.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/uikit@3.9.4/dist/js/uikit-icons.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/41bcea2ae3.js" crossorigin="anonymous"></script>
    </head>
    <body id="body">
        <div id="contenedor_carga"><div id="carga"></div></div>
        <header>
            <div class="icon__menu">
                <i class="fas fa-bars" id="btn_open"></i>
            </div>
        </header>
        <div class="menu__side" id="menu_side">
            <div class="name__page" id="exclusion">
                <i class="fas fa-store"></i>
                <h4 style="color:salmon;"><%= session.getAttribute("user")%></h4>
            </div>
            <div class="options__menu" id="excluyente" style="color:black;">	
                <%
                    if (session.getAttribute("Rol") == null) {
                    } else {
                %>
                <%                       if (session.getAttribute("Rol").equals(2)) {
                %>
                <a href="Menu_Productos_Edit.jsp" >
                    <div class="option">
                        <i class="fa fa-product-hunt" title="Todo para ti usuario promedio"></i>
                        <h4 style="color:salmon;">Productos</h4>
                    </div> 
                </a>
                <a href="resultado_Trabajador.jsp?accion=ELECTRONICO">
                    <div class="option">
                        <i class="fa fa-desktop" title="Categorias"></i>
                        <h4 style="color:salmon;">Electronica</h4>
                    </div>
                </a>
                <a href="resultado_Trabajador.jsp?accion=MODA">
                    <div class="option">
                        <i class="fa fa-smile-o" title="Moda"></i>
                        <h4 style="color:salmon;">Moda General y urbana</h4>
                    </div>
                </a>
                <a href="resultado_Trabajador.jsp?accion=OTROS">
                    <div class="option">
                        <i class="fa fa-filter" title="Otros"></i>
                        <h4 style="color:salmon;">Otros</h4>
                    </div>
                </a>
                <a href="AgregarP.jsp">
                    <div class="option">
                        <i class="fa fa-plus" title="Carrito"></i>
                        <h4 style="color:salmon;">Agregar Productos</h4>
                    </div>
                </a>
                <a href="ListaTrabajador.jsp" >
                    <div class="option">
                        <i class="fas fa-user-plus" title="Carrito"></i>
                        <h4 style="color:salmon;">Lista de trabajadores</h4>
                    </div>
                </a>
                <%}%>
                <%
                    if (session.getAttribute("Rol").equals(1)) {
                %>
                <a href="Menu_Productos_Edit.jsp" >
                    <div class="option">
                        <i class="fa fa-product-hunt" title="Todo para ti usuario promedio"></i>
                        <h4 style="color:salmon;">Productos</h4>
                    </div> 
                </a>

                <a href="resultado_Trabajador.jsp?accion=ELECTRONICO">
                    <div class="option">
                        <i class="fa fa-desktop" title="Categorias"></i>
                        <h4 style="color:salmon;">Electronica</h4>

                    </div>
                </a>
                <a href="resultado_Trabajador.jsp?accion=MODA">
                    <div class="option">
                        <i class="fa fa-smile-o" title="Moda"></i>
                        <h4 style="color:salmon;">Moda General y urbana</h4>
                    </div>
                </a>
                <a href="resultado_Trabajador.jsp?accion=OTROS">
                    <div class="option">
                        <i class="fa fa-filter" title="Otros"></i>
                        <h4 style="color:salmon;">Otros</h4>
                    </div>
                </a>
                <%}%>
                <%}%>
                <a href="Cancelar.jsp" class="selected">
                    <div class="option">
                        <i class="fa fa-check-square"title="Carrito"></i>
                        <h4 style="color:salmon;">Cancelar Producto</h4>
                    </div>
                </a>
                <a href="Index.jsp">
                    <div class="option">
                        <i class="fa fa-sign-out" title="Exit"></i>
                        <h4 style="color:salmon;">Salir Sesion</h4>
                    </div>
                </a>
            </div>
        </div>
        <main style="background-image: url(img/banner-bg.jpg);">
            <section class="section is-medium" style="background-image: url(https://w0.peakpx.com/wallpaper/654/548/HD-wallpaper-rgb-rain.jpg); text-align: center;" >
                <h1 class="title" style="color: white;">Chivo Market</h1>
                <h2 class="subtitle" style="color: white;">
                    Selecciona lo que gustes de manera general!
                </h2>
                <form action="resultado.jsp">
                    <h1>Reporte Especifico de ticket</h1>     
                </form>
            </section>
            <br><br>
            <table class="table table-dark table-hover">
                <tr>
                    <%
                        int Dato = Integer.parseInt(request.getParameter("txtID"));
                        Service_Ticket Ticket = new Service_Ticket();
                        Service_Productos po = new Service_Productos();
                        List<Ticket> lista = Ticket.busquedaT(Dato);
                        int resp = 0;
                        double Total = 0.00;
                        double multiplicador = 0.00;
                    %>
                    <td>Nombre</td>
                    <td>Cantidad </td>
                    <td>Precio </td>
                    <td>Cantidad x Precio </td>
                    <td>Accione a seleccion</td>
                </tr>
                </thead>
                <tbody>
                    <% for (Ticket ti : lista) {
                            DecimalFormat ff = new DecimalFormat("#.00");
                            double precio = ti.getPrecio();
                            ff.format(precio);
                            multiplicador = ti.getPrecio() * ti.getCantidad();
                            List<Productos> pross = po.busquedaIDProducto(ti.getIDProducto());
                            for (Productos por : pross) {
                                resp = por.getCantidad() + ti.getCantidad();
                            }
                    %>
                <form action="Controlador?txtID=<%=ti.getIDUsuario()%>&ID_Ticket=<%=ti.getID()%>&ID_Producto=<%=ti.getIDProducto()%>&Cantidad=<%=ti.getCantidad()%>" method="POST">
                    <tr>
                        <td> <%=ti.getNombre()%></td>
                        <td>
                            <input type="number" min="1" max="<%=resp%>" name="txtCantidad" value="<%=ti.getCantidad()%>" placeholder="<%=ti.getCantidad()%>"> </td>
                        <td> <%=ff.format(precio)%></td>
                        <td type="hidden">
                            <%=ff.format(multiplicador)%>
                        </td>
                        <td>
                            <button class="btn btn-danger" value="EliminarTi" name="accion" type="submit">Eliminar</button>
                            <button class="btn btn-primary" value="ModificarTT" name="accion" type="submit">Modificar</button>
                        </td>
                </form>
                <%
                    Total = Total + multiplicador;
                %>
                </tr>
                <%                            }
                %>
                </tbody>
            </table>
            <%                    DecimalFormat ff2 = new DecimalFormat("#.00");
            %>
            <h1>TOTAL A PAGAR: $<%=ff2.format(Total)%></h1> <br>
            <h4>ID DE REFERENCIA:<%=request.getParameter("txtID")%> </h4>
            <center>
                <a class="btn btn-danger" href="Controlador?ID=<%=request.getParameter("txtID")%>&accion=Cancelar">Cancelar</a>
                <br><br>

                <p uk-margin>
                    <a class="uk-button uk-button-default btn btn-secondary" href="#modal-media-image" uk-toggle>Generar Codigo</a>
                </p>
                <br>
                <div id="smart-button-container">
                    <div style="text-align: center;">
                        <div id="paypal-button-container"></div>
                    </div>
                </div>
                <script src="https://www.paypal.com/sdk/js?client-id=sb&enable-funding=venmo&currency=USD" data-sdk-integration-source="button-factory"></script>
                <script>
                    function initPayPalButton() {
                        paypal.Buttons({
                            style: {
                                shape: 'pill',
                                color: 'blue',
                                layout: 'vertical',
                                label: 'pay',

                            },

                            createOrder: function (data, actions) {
                                return actions.order.create({
                                    purchase_units: [{"amount": {"currency_code": "USD", "value": <%=Total%>}}]
                                });
                            },

                            onApprove: function (data, actions) {
                                return actions.order.capture().then(function (orderData) {

                                    // Full available details
                                    console.log('Capture result', orderData, JSON.stringify(orderData, null, 2));

                                    // Show a success message within this page, e.g.
                                    const element = document.getElementById('paypal-button-container');
                                    element.innerHTML = '';
                                    element.innerHTML = '<h3>Thank you for your payment!</h3>';

                                    // Or go to another URL:  actions.redirect('thank_you.html');

                                });
                            },

                            onError: function (err) {
                                console.log(err);
                            }
                        }).render('#paypal-button-container');
                    }
                    initPayPalButton();
                </script>
            </center>
            <br>
            <div id="modal-media-image" class="uk-flex-top " uk-modal>
                <div class="uk-modal-dialog uk-width-auto uk-margin-auto-vertical">
                    <button class="uk-modal-close-outside" type="button" uk-close></button>
                    <img src="img/qr-code.png" width="350" alt=""/>                   
                </div>
            </div>
        </div>
        <script src="js/BuscadorTabla.js" type="text/javascript"></script>
        <script src="js/SistemaCarga.js"></script>
        <script src="js/script.js"></script>
</body>
</html>
