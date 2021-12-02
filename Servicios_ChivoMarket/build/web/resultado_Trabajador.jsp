<%-- 
    Document   : resultado_Trabajador
    Created on : 13-nov-2021, 13:34:18
    Author     : carlo
--%>

<%@page import="service.Trabajador"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Service_Productos"%>
<%@page import="service.Productos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos de Chivo Market</title>
        <link href="css/main.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/ContenedorCarga.css">

        <link rel="stylesheet" href="css/bulma.css">

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

        <link rel="stylesheet" href="css/estilos.css">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>

        <script src="https://kit.fontawesome.com/41bcea2ae3.js" crossorigin="anonymous"></script>
    </head>
    <body id="body">



        <%
            Trabajador tra = new Trabajador();
            tra = (Trabajador) request.getSession().getAttribute("Trabajador");

        %>
        <%            String verificacion = request.getParameter("accion");
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
                    if(session.getAttribute("Rol")==null){
                        
                    }
                    else{
                        
                    
                %>
                   <%
                       if(session.getAttribute("Rol").equals(2)){
                           
                       
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
                    <a href="ListaTrabajador.jsp" >
                    <div class="option">
                        <i class="fas fa-user-plus" title="Carrito"></i>
                        <h4 style="color:salmon;">Lista de trabajadores</h4>
                    </div>
                </a>
                   
                   <%}%>
                   <%
                     if(session.getAttribute("Rol").equals(1)){
                         
                     
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
                <form action="resultado.jsp">
                    <input class="input is-info" type="text" placeholder="Tostadora del futuro 3000" name="txtBusco" id="searchTerm" onkeyup="doSearch()" style="color: white;">
                    <br><br>

                    <br>     
                </form>



            </section>
            <br><br>
            <%
                String Categoria = request.getParameter("accion");
                int Dato = 0;
                if (Categoria.equals("ELECTRONICO")) {
                    Dato = 1;
                } else if (Categoria.equals("MODA")) {
                    Dato = 2;
                } else {
                    Dato = 3;
                }
                Service_Productos pros = new Service_Productos();
                List<Productos> lista = pros.buscar(Dato);
            %>

            <table class="table" id="datos"  >
                <tr>
                    <th colspan="3" align="center">
                        Menu de seleccion
                    </th>
                </tr>
                <%
                    for (Productos pro : lista) {

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
                        <p> Descripcion:<br>      <%= pro.getDescripcion()%> </p>
                        <p hidden><%= pro.getIDCategoria()%></p>
                        <%
                            if(session.getAttribute("Rol")==null){
                                
                            }
                            else{
                                
                            
                        
                        
                        %>
                        <%
                            if(session.getAttribute("Rol").equals(2))
                            {
                                
                            
                        %>
                        <form method="Post" action="Controlador?accion=Agregar&Nombre=<%=pro.getNombre()%>&Precio=<%= pro.getPrecio()%>&ID_Producto=<%= pro.getID()%>&ID=<%= session.getAttribute("ID")%>&Cantidad=<%= pro.getCantidad()%>">
                            <a href="Area_de_edicion.jsp?ID_Producto=<%=pro.getID()%>"class="btn btn-primary">Editar</a>
                            <a href="Controlador?accion=EliminarP&ID=<%=pro.getID()%>" class="btn btn-danger">Eliminar</a>
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









        </main>


        <script src="js/BuscadorTabla.js" type="text/javascript"></script>
        <script src="js/SistemaCarga.js"></script>
        <script src="js/script.js"></script>
    </body>
</html>