<%-- 
    Document   : Menu_Productos_Edit
    Created on : 13-nov-2021, 10:54:40
    Author     : carlo
--%>


<%@page import="java.util.List"%>
<%@page import="service.Productos"%>
<%@page import="service.Productos"%>
<%@page import="Modelo.Service_Productos"%>
<%@page import="service.Trabajador"%>
<%@page import="service.Trabajador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos de Chivo Market</title>
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/ContenedorCarga.css">

        <link rel="stylesheet" href="css/bulma.css">
        <link rel="stylesheet" href="https://unpkg.com/purecss@2.0.6/build/pure-min.css" integrity="sha384-Uu6IeWbM+gzNVXJcM9XV3SohHtmWE+3VGi496jvgX1jyvDTXfdK+rfZc8C1Aehk5" crossorigin="anonymous">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

        <link rel="stylesheet" href="css/estilos.css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script src="https://kit.fontawesome.com/41bcea2ae3.js" crossorigin="anonymous"></script>
    </head>
    <body id="body">

        <%
            if (session.getAttribute("ID") == null) {
                response.sendRedirect("Index.jsp");
            }

        %>

        <%            Trabajador TL = new Trabajador();
            TL = (Trabajador) request.getSession().getAttribute("Trabajador");

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
                <%
                    if (session.getAttribute("Rol") == null) {

                    } else {


                %>
                <%                       if (session.getAttribute("Rol").equals(2)) {

                %>

                <a href="Menu_Productos_Edit.jsp" class="selected">
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
                <a href="ListaTrabajador.jsp">
                    <div class="option">
                        <i class="fas fa-user-plus" title="Carrito"></i>
                        <h4 style="color:salmon;">Lista de trabajadores</h4>
                    </div>
                </a>

                <%}%>
                <%
                    if (session.getAttribute("Rol").equals(1)) {

                %>
                <a href="#" class="selected">
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

                <a href="Cancelar.jsp">
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

                <input class="input is-info" type="text" placeholder="Tostadora del futuro 3000" name="txtBusco" id="searchTerm" onkeyup="doSearch()" style="color: white;">
                <br><br>

                <br>     




            </section>
            <br><br>



            <%
                Service_Productos Service = new Service_Productos();
                List<Productos> datos = Service.listarProducto();

            %>










            <table class="table" id="datos"  >
                <tr>
                    <th colspan="3" align="center">
                        Menu de seleccion
                    </th>
                </tr>
                <%                    for (Productos pro : datos) {
                %>
                <tr>

                    <td>


                        <input type="hidden" id="id" name="id">
                        <input type="hidden" id="ncontador" name="ncontador">
                        <h5>Nombre:      <%=pro.getNombre()%></h5>
                        <p> Cantidad:    <%= pro.getCantidad()%> </p>
                        <%
                            String MSJ;
                            if (pro.getCantidad() > 0) {
                                MSJ = "Disponible";
                            } else {
                                MSJ = "no disponible";
                            }
                        %>
                        <p style="color:red;">
                            <%=MSJ%>
                        </p>
                        <p> Precio:      <%= pro.getPrecio()%> </p>
                        <p hidden><%= pro.getIDCategoria()%></p>
                        <div class="mb-auto">
                            <p>Descripcion:<br>   <%=pro.getDescripcion()%></p>
                        </div>
                        
                        <%
                            if (session.getAttribute("Rol") == null) {

                            } else {


                        %>
                        <%                            if (session.getAttribute("Rol").equals(2)) {


                        %>
                        <form method="Post" action="Controlador">


                            <a href="Area_de_edicion.jsp?ID_Producto=<%=pro.getID()%>"class="btn btn-primary">Editar
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-pencil" viewBox="0 0 16 16">
                                <path d="M12.146.146a.5.5 0 0 1 .708 0l3 3a.5.5 0 0 1 0 .708l-10 10a.5.5 0 0 1-.168.11l-5 2a.5.5 0 0 1-.65-.65l2-5a.5.5 0 0 1 .11-.168l10-10zM11.207 2.5 13.5 4.793 14.793 3.5 12.5 1.207 11.207 2.5zm1.586 3L10.5 3.207 4 9.707V10h.5a.5.5 0 0 1 .5.5v.5h.5a.5.5 0 0 1 .5.5v.5h.293l6.5-6.5zm-9.761 5.175-.106.106-1.528 3.821 3.821-1.528.106-.106A.5.5 0 0 1 5 12.5V12h-.5a.5.5 0 0 1-.5-.5V11h-.5a.5.5 0 0 1-.468-.325z"/>
                                </svg>
                            </a>
                            <a href="Controlador?accion=EliminarP&ID=<%=pro.getID()%>" class="btn btn-danger">Eliminar
                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-trash" viewBox="0 0 16 16">
                                <path d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z"/>
                                <path fill-rule="evenodd" d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z"/>
                                </svg>
                            </a>
                                

                        </form>
                        <%}%>
                        <%}%>



                    </td>
                    <td>

                        <img src="<%=pro.getImagen()%>"  style="width: 213px; height: 194px; ">
                    </td>

                </tr>
                <%}%>

            </table>
            <%
                if (session.getAttribute("OBO") == null) {

                } else {

            %>
            <%if (session.getAttribute("OBO").equals("1")) {

            %>
            <script type="text/javascript">

                swal("Exito!", "Se logro la modificaciones del producto", "success");

            </script>


            <%}
                    session.setAttribute("OBO", null);
                }%>

            <%
                if (session.getAttribute("SD") == null) {

                } else {


            %>
            <%              if (session.getAttribute("SD").equals("2")) {


            %>
            <script type="text/javascript">

                swal("Exito!", "Se logro la Insercion del producto", "success");

            </script>
            <%                      session.setAttribute("SD", null);
                    }
                }
            %>
            <%if (session.getAttribute("Cancel") == null) {

                } else {

            %>
            <%if (session.getAttribute("Cancel").equals("3")) {

            %>
            <script type="text/javascript">

                swal("Exito!", "Se logro la cancelacion del producto", "success");

            </script>
            <%session.setAttribute("Cancel", null);%>
            <%}
                }%>










        </main>

        <script src="js/BuscadorTabla.js" type="text/javascript"></script>
        <script src="js/SistemaCarga.js"></script>
        <script src="js/script.js"></script>
    </body>
</html>
