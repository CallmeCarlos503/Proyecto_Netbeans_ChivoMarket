<%-- 
    Document   : Registro
    Created on : 11-oct-2021, 20:22:01
    Author     : carlo
--%>
<%@page import="javax.jms.Session"%>
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
                <a href="Login.jsp">
                    <div class="option">
                        <i class="far fa-user" title="Portafolio"></i>
                        <h4>Iniciar Sesion</h4>
                    </div>
                </a>
                <a href="#" class="selected">
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
            <center>
                <img src="img/Registro.png" alt="">
                <br><br>
            </center>
            <form action="Controlador" method="POST" >
                <div class="container">
                    <div class="row justify-content-start">
                        <div class="col-4">
                        </div>
                        <div class="col-4">
                            <div class="field">
                                <label class="label">Nombre Completo</label>
                                <div class="control">
                                    <input class="form-control" type="text" name="txtNombre" required placeholder="Juanito Alcachofa">
                                </div>
                            </div>
                            <div class="field">
                                <label class="label">Correo Electronico</label>
                                <div class="control">
                                    <input class="form-control" type="email" name="txtCorreo" required placeholder="AlexCapo777@gmail.com">
                                </div>
                            </div>
                            <div class="field">
                                <label class="label">Contraseña</label>
                                <div class="control">
                                    <input class="form-control" type="password" name="txtPassword" required placeholder="Zapote21">
                                </div>
                            </div>
                            <div class="field">
                                <label class="label">Telefono</label>
                                <div class="control">
                                    <input class="form-control" type="tel" minlength="8" maxlength="8"  name="txtTelefono" required placeholder="60004069">
                                </div>
                            </div>
                            <div class="buttons">
                                <button type="submit" value="registrar" name="accion" class="button is-black" style="align-items: center">
                                    Registrarse
                                    <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-person-badge-fill" viewBox="0 0 16 16">
                                    <path d="M2 2a2 2 0 0 1 2-2h8a2 2 0 0 1 2 2v12a2 2 0 0 1-2 2H4a2 2 0 0 1-2-2V2zm4.5 0a.5.5 0 0 0 0 1h3a.5.5 0 0 0 0-1h-3zM8 11a3 3 0 1 0 0-6 3 3 0 0 0 0 6zm5 2.755C12.146 12.825 10.623 12 8 12s-4.146.826-5 1.755V14a1 1 0 0 0 1 1h8a1 1 0 0 0 1-1v-.245z"/>
                                    </svg>
                                </button>
                            </div>
                        </div>
                        <div class="col-4">
                        </div>
                    </div>
                </div>
                <br><br>
                <%
                    if (session.getAttribute("JS") == null) {
                    } else {
                %>
                <%
                    String f = (String) session.getAttribute("JS");
                %>
                <%
                    if (f.equals("1")) {
                %>
                <script type="text/javascript">
                    swal("Que mal!", "Correo ya registrado en nuestra tienda", "error");
                </script>
                <%                       } else if (f.equals("2")) {
                %>
                <script type="text/javascript">
                    swal("Exito!", "Se ha registrado satisfactoriamente", "success");
                </script>
                <%                        }
                        session.setAttribute("JS", null);
                    }%>
            </form>
            <BR>
        </main>
        <script src="js/SistemaCarga.js"></script>
        <script src="js/script.js"></script>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
    </body>
</html>
