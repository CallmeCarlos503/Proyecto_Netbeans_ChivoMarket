<%-- 
    Document   : AcercadeNosotros
    Created on : 13-nov-2021, 21:08:31
    Author     : carlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <html lang="en" style="background-image: url(img/banner-bg.jpg);" >
        <head>
            <meta charset="UTF-8">
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Bienvenido a ChivoMarket!</title>
            <link rel="stylesheet" href="css/ContenedorCarga.css">
            <link rel="stylesheet" href="css/bulma.css">
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>

            <link rel="stylesheet" href="css/estilos.css">

            <script src="https://kit.fontawesome.com/41bcea2ae3.js" crossorigin="anonymous"></script>
        </head>
        <body id="body" style="background-image: url(img/banner-bg.jpg);">
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

                    <a href="Index.jsp" >
                        <div class="option">
                            <i class="fas fa-home" title="Inicio"></i>
                            <h4>Inicio</h4>
                        </div>
                    </a>

                    <a href="Controlador?accion=iniciar">
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

                    <a href="AcercadeNosotros.jsp" class="selected">
                        <div class="option">
                            <i class="far fa-sticky-note" title="Blog"></i>
                            <h4>Acerca de Nosotros</h4>
                        </div>
                    </a>

                    <a href="Zonas.jsp" >
                        <div class="option">
                            <i class="fa fa-map-marker"  title="Contacto"></i>
                            <h4>Punto de referencias</h4>
                        </div>
                    </a>


                </div>

            </div>
            <br><br>
           

            <script src="js/SistemaCarga.js"></script>
            <script src="js/script.js"></script>
        </body>
    </html>
