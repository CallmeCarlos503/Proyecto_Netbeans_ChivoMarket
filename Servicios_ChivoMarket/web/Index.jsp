<%-- 
    Document   : Index
    Created on : 06-nov-2021, 21:56:50
    Author     : carlo
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
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
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
                <a href="#" class="selected">
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
                <a href="AcercadeNosotros.jsp">
                    <div class="option">
                        <i class="far fa-sticky-note" title="Blog"></i>
                        <h4>Acerca de nosotros</h4>
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
            <section class="section is-medium" style="background-image: url(https://w0.peakpx.com/wallpaper/654/548/HD-wallpaper-rgb-rain.jpg); text-align: center;" >
                <h1 class="title" style="color: white;">Chivo Market</h1>
                <h2 class="subtitle" style="color: white;">
                    Bienvenido a nuestro sistema de usuarios, dedicado a la venta de articulos del gusto del cliente <br>
                    Sera un Gusto Atenderle a lo que necesite
                </h2>
            </section>
            <br><br><br>
            <div class="container">
                <div class="row justify-content-start">
                    <div class="col-4">
                        <div class="card">
                            <div class="card-content">
                                <p class="title">
                                    “Un sistema libre de errores, pensado para ti y para mi. Sientete comodo querido usuario y espero que la pases bien”
                                </p>
                                <p class="subtitle">
                                    Grupo TI
                                </p>
                            </div>
                            <footer class="card-footer">
                                <p class="card-footer-item">
                                    <span>
                                        Ver en <a href="https://twitter.com/codinghorror/status/506010907021828096">Twitter</a>
                                    </span>
                                </p>
                                <p class="card-footer-item">
                                    <span>
                                        Compartir en <a href="#">Facebook</a>
                                    </span>
                                </p>
                            </footer>
                        </div>
                    </div>
                    <div class="col-4">
                        <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
                            <div class="carousel-inner">
                                <div class="carousel-item active">
                                    <img src="https://i.pinimg.com/originals/24/63/5d/24635d14bd8cd6250c642ad6393f97ef.gif" class="d-block w-100" alt="...">
                                </div>
                                <div class="carousel-item">
                                    <img src="https://c.tenor.com/HbLUlHHVKIgAAAAM/app-online-store.gif" class="d-block w-100" alt="...">
                                </div>
                                <div class="carousel-item">
                                    <img src="https://media4.giphy.com/media/3o85xFVvjn7iywaQUM/giphy.gif" class="d-block w-100" alt="...">
                                </div>
                            </div>
                            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
                                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                <span class="visually-hidden">Anterior</span>
                            </button>
                            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
                                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                <span class="visually-hidden">Siguiente</span>
                            </button>
                        </div>
                    </div>
                    <div class="col-4">
                        <div class="card">
                            <div class="card-content">
                                <p class="title">
                                    “Recuerda Usuario, Busca lo que quieras, chivo market esta pensado para el amor de las compras y pedidos por ticket”
                                </p>
                                <p class="subtitle">
                                    Grupo TI
                                </p>
                            </div>
                            <footer class="card-footer">
                                <p class="card-footer-item">
                                    <span>
                                        Ver en <a href="https://twitter.com/codinghorror/status/506010907021828096">Twitter</a>
                                    </span>
                                </p>
                                <p class="card-footer-item">
                                    <span>
                                        Compartir en <a href="#">Facebook</a>
                                    </span>
                                </p>
                            </footer>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <script src="js/SistemaCarga.js"></script>
        <script src="js/script.js"></script>
    </body>
</html>
