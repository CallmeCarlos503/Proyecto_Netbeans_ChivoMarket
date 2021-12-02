<%-- 
    Document   : Zonas
    Created on : 13-nov-2021, 21:09:28
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
        <body id="body" style="background-image: url(img/banner-bg.jpg)">
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

                    <a href="AcercadeNosotros.jsp" >
                        <div class="option">
                            <i class="far fa-sticky-note" title="Blog"></i>
                            <h4>Acerca de Nosotros</h4>
                        </div>
                    </a>

                    <a href="Zonas.jsp" class="selected">
                        <div class="option">
                            <i class="fa fa-map-marker"  title="Contacto"></i>
                            <h4>Punto de referencias</h4>
                        </div>
                    </a>



                </div>

            </div>
        <center>
            <h1>Ciudad Delgado San Salvador</h1>
            <br>
            
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3875.9315785953527!2d-89.17266898620149!3d13.722592201669299!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8f633754adfdbe23%3A0xf360ec6715a11aa4!2sAlcald%C3%ADa%20Municipal%20de%20Ciudad%20Delgado!5e0!3m2!1ses-419!2ssv!4v1637193733846!5m2!1ses-419!2ssv" width="400" height="300" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
            <br>
            <h1>Metrocentro San Salvador (Etapa 1)</h1>
            <br>
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3876.209856939242!2d-89.21296778620174!3d13.705736102054326!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8f63312cffdc0e23%3A0xfd208b3a87cfb4d9!2sMetrocentro%20San%20Salvador!5e0!3m2!1ses-419!2ssv!4v1637194016039!5m2!1ses-419!2ssv" width="400" height="300" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
            <br>
            <h1>Multiplaza San Salvador(Etapa 2)</h1>
            <br>
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3876.643971230999!2d-89.25093418620207!3d13.679399902655074!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x8f632e2afad31d7d%3A0x40f719aa05749a78!2sMultiplaza!5e0!3m2!1ses-419!2ssv!4v1637194148925!5m2!1ses-419!2ssv" width="400" height="300" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
        </center>
        
        <script src="js/SistemaCarga.js"></script>
        <script src="js/script.js"></script>
    </body>
</html>
