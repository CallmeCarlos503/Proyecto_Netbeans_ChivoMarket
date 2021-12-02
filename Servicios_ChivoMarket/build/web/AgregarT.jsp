<%-- 
    Document   : AgregarT
    Created on : 24-nov-2021, 12:51:48
    Author     : carlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" style="background-image: url(img/banner-bg.jpg);" >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos de Chivo Market</title>

        <link rel="stylesheet" href="css/ContenedorCarga.css">

        <link rel="stylesheet" href="css/bulma.css">

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">

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
                 <a href="ListaTrabajador.jsp" class="selected" >
                    <div class="option">
                        <i class="fas fa-user-plus" title="Carrito"></i>
                        <h4 style="color:salmon;">Lista de trabajadores</h4>
                    </div>
                </a>
                <a href="Cancelar.jsp">
                    <div class="option">
                        <i class="fa fa-check-square" title="Carrito"></i>
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
            <section class="section is-small" style="background-image: url(https://w0.peakpx.com/wallpaper/654/548/HD-wallpaper-rgb-rain.jpg); text-align: center;" >
                <h1 class="title" style="color: white;">Chivo Market</h1>
                <h2 class="subtitle" style="color: white;">
                    Selecciona lo que gustes de manera general!
                </h2>
                <form action="resultado.jsp">
                    <h1>Fase de Inclusion</h1>     
                </form>



            </section>
            <br><br>


            <form action="Controlador" method="GET">
                <div class="container">
                    <div class="row justify-content-start">
                        <div class="col-4">

                        </div>
                        <div class="col-4">



                            <center>
                                <img src="https://cdn-icons-png.flaticon.com/512/2450/2450449.png" style="width: 150px; height: 140px;" alt="">
                            </center>
                            <br><br>
                            <div class="field">
                                <label class="label">Nombre del trabajador</label>
                                <div class="control">
                                    <input class="form-control" name="txtNickname" type="text"   required>
                                </div>
                            </div>
                            <div class="field">
                                <label class="label">Correo</label>
                                <div class="control">
                                    <input class="form-control" name="txtCorreo" type="email"   required>
                                </div>
                            </div>
                             <div class="field">
                                <label class="label">Contraseña</label>
                                <div class="control">
                                    <input class="form-control" name="txtContrasena" type="password"   required>
                                </div>
                            </div>
                             <div class="field">
                                <label class="label">Telefono</label>
                                <div class="control">
                                    <input class="form-control" maxlength="8" minlength="8" name="txtTelefono" type="tel"   required>
                                </div>
                            </div>
                             <div class="field">
                                <label class="label">DUI</label>
                                <div class="control">
                                    <input class="form-control" name="txtDUI" type="text"   required>
                                </div>
                            </div>
                            
                       
                            <div class="field">
                                <label class="label">Privilegios</label>
                                <div class="control">
                                    <select name="cbo_Privilegios">


                                        <option value="Administrador">Administrador</option>
                                        <option value="Trabajador">Trabajador</option>

                                    </select>

                                    
                                        </div>
                                    </div>

                                    <br>
                                </div>
                            </div>

                            <div class="control">

                                <input class="btn btn-success" type="submit" name="accion" value="Agregar Trabajador">
                                <br><br>
                                <a href="ListaTrabajador.jsp" class="btn btn-secondary">Volver a la seleccion de Trabajadores</a>
                            </div>



                        </div>
                        <div class="col-4">

                        </div>
                    </div>
                </div>




            </form>

        </main> 


    </body>
    <script src="js/BuscadorTabla.js" type="text/javascript"></script>
    <script src="js/SistemaCarga.js"></script>
    <script src="js/script.js"></script>
</html>
