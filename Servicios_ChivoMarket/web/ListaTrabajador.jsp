<%-- 
    Document   : ListaTrabajador
    Created on : 24-nov-2021, 9:18:48
    Author     : carlo
--%>

<%@page import="service.Trabajador"%>
<%@page import="Modelo.Service_Trabajador"%>
<%@page import="service.ServiciosTrabajador"%>

<%@page import="java.util.List"%>


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
                <a href="ListaTrabajador.jsp" class="selected">
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

            <section class="section is-medium" style="background-image: url(https://w0.peakpx.com/wallpaper/654/548/HD-wallpaper-rgb-rain.jpg); text-align: center;">
                <h1 class="title" style="color: white;">Chivo Market</h1>
                <h2 class="subtitle" style="color: white;">
                    AREA DE SELECCION POR TRABAJADOR
                </h2>

                <input class="input is-info" type="text" placeholder="Juan Carlos Bodoques" name="txtBusco" id="searchTerm" onkeyup="doSearch()" style="color: white;">
                <br>
                <center>

                    <a href="AgregarT.jsp" class="btn btn-primary">
                        Agregar Trabajador
                    </a>
                </center>

                <br><br>

                <br>     




            </section>
            <br><br>

            <br><br>




            <table class="table table-dark" id="datos" >



                <tr>
                    <%

                        Service_Trabajador tr = new Service_Trabajador();
                        List<Trabajador> lista = tr.listar();


                    %>
                    <td>ID</td>
                    <td>Nickname</td>
                    <td>Correo</td>
                    <td>Contraseña</td>
                    <td>Numero</td>
                    <td>DUI</td>
                    <td>ROL</td>
                    <td>Acciones</td>
                </tr>
                </thead>
                <tbody>
                    <% for (Trabajador ti : lista) {

                    %>

                    <tr>
                        <%if (session.getAttribute("ID").equals(ti.getID())) {

                        %>
                        <%} else {%>


                        <td> <%=ti.getID()%></td>
                        <td><%=ti.getNickname()%></td>
                        <td><%=ti.getCorreo()%></td>
                        <td><%=ti.getContrasena()%></td>
                        <td><%=ti.getNumero()%></td>
                        <td><%=ti.getDUI()%></td>

                        <td>
                            <%
                                if (ti.getIDROL() == 2) {


                            %>   
                            <label>Administrador</label>
                            <%                             } else {
                            %>
                            <label>Trabajador</label>
                            <%}%>



                        </td>


                        <td>


                            <a class="btn btn-danger" href="Controlador?accion=EliminarTrabajador&ID=<%=ti.getID()%>">Eliminar</a>
                            <a class="btn btn-primary" href="EditarT.jsp?ID=<%=ti.getID()%>&Nickname=<%=ti.getNickname()%>&Correo=<%=ti.getCorreo()%>&Contrasena=<%=ti.getContrasena()%>&Numero=<%=ti.getNumero()%>&DUI=<%=ti.getDUI()%>&Rol=<%=ti.getIDROL()%>">Editar</a>



                        </td>

                    </tr>

                    <%                            }
                        }


                    %>
                </tbody>


            </table>

            <%         if (session.getAttribute("Agrega") == null) {

                } else {

            %>
            <%if (session.getAttribute("Agrega").equals("1")) {

            %>
            <script type="text/javascript">
                swal("Exito!", "Se agrego el trabajador Exitosamente", "success");
            </script>
            <%     } else if (session.getAttribute("Agrega").equals("2")) {

            %>
            <script type="text/javascript">
                swal("Exito!", "Se logro la modificacion del trabajador", "success");
            </script>
            <%             }
                    session.setAttribute("Agrega", null);
                }

            %>

        </div>
        <script src="js/BuscadorTabla.js" type="text/javascript"></script>
        <script src="js/SistemaCarga.js"></script>
        <script src="js/script.js"></script>
</body>
</html>
