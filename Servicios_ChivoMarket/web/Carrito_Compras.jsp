<%-- 
    Document   : Carrito_Compras.jsp
    Created on : 11-nov-2021, 22:37:00
    Author     : carlo
--%>
<%@page import="Modelo.Service_Productos"%>
<%@page import="service.Productos"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="service.Pedidos"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Service_Pedido"%>
<%@page import="service.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carrito de Compras</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/ContenedorCarga.css">
        <link rel="stylesheet" href="css/bulma.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <link rel="stylesheet" href="css/estilos.css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
        <script src="https://kit.fontawesome.com/41bcea2ae3.js" crossorigin="anonymous"></script>
    </head>
    <body id="body">
        <%
            Cliente cl = new Cliente();
            cl = (Cliente) request.getSession().getAttribute("Cliente");
        %>
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
                <a href="Menu_Productos.jsp">
                    <div class="option">
                        <i class="fa fa-product-hunt" title="Todo para ti usuario promedio"></i>
                        <h4 style="color:salmon;">Productos</h4>
                    </div> 
                </a>
                <a href="resultado.jsp?accion=ELECTRONICO">
                    <div class="option">
                        <i class="fa fa-desktop" title="Categorias"></i>
                        <h4 style="color:salmon;">Electronica</h4>
                    </div>
                </a>
                <a href="resultado.jsp?accion=MODA">
                    <div class="option">
                        <i class="fa fa-smile-o" title="Moda"></i>
                        <h4 style="color:salmon;">Moda General y urbana</h4>
                    </div>
                </a>
                <a href="resultado.jsp?accion=OTROS">
                    <div class="option">
                        <i class="fa fa-filter" title="otros"></i>
                        <h4 style="color:salmon;">Otros</h4>
                    </div>
                </a>
                <a href="#" class="selected">
                    <div class="option">
                        <i class="fa fa-cart-plus" title="Carrito"></i>
                        <h4 style="color:salmon;">Carrito de Compras</h4>
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
                    <h1>Reporte general de pedidos</h1>     
                </form>
            </section>
            <br><br>
            <table class="table table-dark table-hover">
                <tr>
                    <%
                        String Categoria = request.getParameter("accion");
                        int Dato = Integer.parseInt(request.getParameter("ID_User"));
                        Service_Pedido ServiceP = new Service_Pedido();
                        List<Pedidos> lista = ServiceP.buscarCarrito(Dato);
                        double Total = 0.00;
                        double multiplicador = 0.00;
                        Service_Productos po= new Service_Productos();
                        int resp=0;
                    %>
                    <td>Nombre</td>
                    <td>Cantidad </td>
                    <td>Precio </td>
                    <td>Cantidad x Precio </td>
                    <td>Acciones</td>
                </tr>
                </thead>
                <tbody>
                    <% for (Pedidos pe : lista) {
                            DecimalFormat ff = new DecimalFormat("#.00");
                            double Precio = pe.getPrecio();
                            ff.format(Precio);
                            multiplicador = pe.getPrecio() * pe.getCantidad();
                            List<Productos> pross = po.busquedaIDProducto(pe.getIDProducto());
                            for (Productos por : pross) {
                                resp = por.getCantidad() + pe.getCantidad();
                            }
                    %>
                <form  method="POST" action="Controlador?ID=<%=pe.getID()%>&ID_User=<%=pe.getIDUsuario()%>&ID_Producto=<%=pe.getIDProducto()%>&Cantidad=<%=pe.getCantidad()%>"> 
                    <tr>
                        <td name="tdNombre"> <%=pe.getNombre()%></td>
                        <td name="tdCantidad"><input type="number" min="1" max="<%=resp%>" name="txtActualizo" value="<%=pe.getCantidad()%>" placeholder="1"> </td>
                        <td name="tdPrecio"> <%=Precio%></td>
                        <td type="hidden">
                            <%=ff.format(multiplicador)%>
                            <input type="hidden" id="ID" value="<%=pe.getID()%>">
                            <input type="hidden" id="ID_USER" value="<%=pe.getIDUsuario()%>">
                            <input type="hidden" id="ID_Productos" value="<%=pe.getIDProducto()%>">
                            <input type="hidden" id="Cantidad" value="<%=pe.getCantidad()%>">
                        </td>
                        <td>                                                            
                            <button name="accion" value="AC" class="btn btn-primary" type="submit">
                                Actualizar <br>
                            </button>
                            <button name="accion" onclick="Elimino()" id="elimino" value="Delete"  type="submit" class="btn btn-danger">Eliminar</button>
                        </td>
                        <%
                            Total = Total + multiplicador;
                        %>
                    </tr>
                </form>
                <%                            }
                %>
                </tbody>
            </table>
            <%            DecimalFormat df = new DecimalFormat("#.00");
            %>
            <h1>TOTAL A PAGAR: $<%=df.format(Total)%></h1> <br>
            <h4>ID DE REFERENCIA:<%=session.getAttribute("ID")%> </h4>
            <center>
                <a class="btn btn-primary" href="Ticket_Generado.jsp?ID_User=<%=session.getAttribute("ID")%>">Imprimir ticket</a>
                <br>
                <br>
                <a class="btn btn-primary" href="Controlador?accion=Generar&ID_User=<%= session.getAttribute("ID")%>" >
                    Confirmar pedido 
                </a>
                <br>
                <br>
                <div class="alert alert-warning" role="alert">
                    <h1>Advertencia</h1>
                    <p>
                        Al momento de confirmar el pedido se direccionara a un sistema de ticket por el cual se puede imprimir<br>
                        por medio del boton "imprimir ticket"
                    </p>
                </div>
            </center>
        </div>
        <%
            if (session.getAttribute("L") == null) {
            } else {
                if (session.getAttribute("L").equals("1")) {
        %>
        <script type="text/javascript">
            swal("Exito!", "Se ha generado el ticket con exito", "success");
        </script>
        <%            session.setAttribute("L", null);
        %>
        <%}%>
        <%}%>
        <script src="js/BuscadorTabla.js" type="text/javascript"></script>
        <script src="js/SistemaCarga.js"></script>
        <script src="js/script.js"></script>
</body>
</html>
