<%-- 
    Document   : Login
    Created on : 11-oct-2021, 20:21:53
    Author     : CallmeCarlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html lang="en" style="background-image: url(img/banner-bg.jpg);" >
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Bienvenido a ChivoMarket!</title>
        <link rel="stylesheet" href="css/ContenedorCarga.css">
        <link rel="stylesheet" href="css/bulma.css">


        <link href="css/alertify.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
        <script src="js/jquery-3.2.1.min.js" type="text/javascript"></script>
        <script src="js/alertify.js" type="text/javascript"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <link rel="stylesheet" href="css/estilos.css">

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

            <div class="name__page">
                <i class="fas fa-store"></i>
                <h4>ChivoMarket</h4>
            </div>

            <div class="options__menu">	

                <a href="Index.jsp">
                    <div class="option">
                        <i class="fas fa-home" title="Inicio"></i>
                        <h4>Inicio</h4>
                    </div>
                </a>

                <a href="" class="selected">
                    <div class="option">
                        <i class="far fa-user" title="Portafolio"></i>
                        <h4>Iniciar Sesion</h4>
                    </div>
                </a>

                <a href="Registro.jsp">
                    <div class="option">
                        <i class="fas fa-address-card" title="Cursos"></i>
                        <h4>Registrarse</h4>
                    </div>
                </a>

                <a href="AcercadeNosotros.jsp">
                    <div class="option">
                        <i class="far fa-sticky-note" title="Blog"></i>
                        <h4>Acerca de Nosotros</h4>
                    </div>
                </a>

                <a href="Zonas.jsp">
                    <div class="option">
                        <i class="fa fa-map-marker"  title="Contacto"></i>
                        <h4>Punto de referencias</h4>
                    </div>
                </a>



            </div>

        </div>

        <main style="background-image: url(img/banner-bg.jpg);">
            <form action="Controlador" method="GET">
                <div class="container">
                    <div class="row justify-content-start">
                        <div class="col-4">

                        </div>
                        <div class="col-4">

                            <center>
                                <img src="img/Login.png" alt="">
                            </center>
                            <div class="field">
                                <label class="label">Correo electronico</label>
                                <div class="control">
                                    <input class="form-control" name="txtCorreo" type="email" placeholder="ChivoMarket@chivo.com" required>
                                </div>
                            </div>

                            <div class="field">
                                <label class="label">Contraseña</label>
                                <div class="control">
                                    <input class="form-control" type="password" name="txtPassword" placeholder="Zapote23" required>
                                </div>
                            </div>
                            <div class="control">

                                <button class="btn btn-success" id="btn1" type="submit" name="accion" value="Ingresar">
                                    Iniciar Sesion
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-box-arrow-in-right" viewBox="0 0 16 16">
                                    <path fill-rule="evenodd" d="M6 3.5a.5.5 0 0 1 .5-.5h8a.5.5 0 0 1 .5.5v9a.5.5 0 0 1-.5.5h-8a.5.5 0 0 1-.5-.5v-2a.5.5 0 0 0-1 0v2A1.5 1.5 0 0 0 6.5 14h8a1.5 1.5 0 0 0 1.5-1.5v-9A1.5 1.5 0 0 0 14.5 2h-8A1.5 1.5 0 0 0 5 3.5v2a.5.5 0 0 0 1 0v-2z"/>
                                    <path fill-rule="evenodd" d="M11.854 8.354a.5.5 0 0 0 0-.708l-3-3a.5.5 0 1 0-.708.708L10.293 7.5H1.5a.5.5 0 0 0 0 1h8.793l-2.147 2.146a.5.5 0 0 0 .708.708l3-3z"/>
                                    </svg>
                                </button>
                            </div>



                        </div>
                        <div class="col-4">

                        </div>
                    </div>
                </div>
                <BR><br>
                <%
                    if (session.getAttribute("Denego") == null) {

                    } else {


                %>
                <%                String msj = (String) session.getAttribute("Denego");
                    if (msj.equals("1")) {


                %>
                <script type="text/javascript">

                    swal("Que mal!", "Correo o contraseña mal colocada", "error");

                </script>
                <%                    session.setAttribute("Denego", null);
                %>

                <%                    }
                    }
                %>



            </form>

        </main>    



        <script src="js/SistemaCarga.js"></script>
        <script src="js/script.js"></script>


    </body>
</html>
