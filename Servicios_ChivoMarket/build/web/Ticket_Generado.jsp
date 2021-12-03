<%-- 
    Document   : Ticket_Generado
    Created on : 23-nov-2021, 22:43:46
    Author     : carlo
--%>
<%@page import="service.Ticket"%>
<%@page import="Modelo.Service_Ticket"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="service.Pedidos"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Service_Pedido"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Ticket</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </head>
    <body onload="window.print()">
        <img src="data:image/png;base64,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" width="120">
    <center>
        <b>
            <h1>Ticket Generado</h1>
            <br>
        </b>
        <div class="container">
            <div class="row">
                <div class="col-2">

                </div>
                <div class="col-8">
                    <%
                        String Categoria = request.getParameter("accion");
                        int Dato = Integer.parseInt(request.getParameter("ID_User"));

                       
                       DecimalFormat ff = new DecimalFormat("#.00");
                        Service_Ticket ticket= new Service_Ticket();
                        List<Ticket> listo= ticket.busquedaT(Dato);
                        double Total = 0.00;
                        double multiplicador = 0.00;
                    %>
                    <table class="table">
                        <thead>
                            <tr>
                                
                                <th scope="col">Producto</th>
                                <th scope="col">Precio</th>
                                <th scope="col">Cantidad</th>
                                <th scope="col">Cantidad X Precio</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%double suma=0.00;%>
                            <% for (Ticket pe : listo) {
                                    
                                    double Precio = pe.getPrecio();
                                    ff.format(Precio);
                                    multiplicador = pe.getPrecio() * pe.getCantidad();
                                    
                                    suma=multiplicador+suma;
                            %>
                            <tr>
                                <td name="tdNombre"> <%=pe.getNombre()%></td>
                                <td><%=pe.getPrecio()%></td>
                                <td name="tdPrecio"> <%=pe.getCantidad()%></td>
                                <td><%=ff.format(multiplicador)%></td>
                            </tr>
<%}%>
                        </tbody>
                    </table>
                </div>
                <div class="col-2">
                </div>
            </div>
        </div>
    </center>
    <br>
    <h3>
        ID de Referencia:<%=session.getAttribute("ID")%>
    </h3>
    <h3>
        Total a pagar:<%=ff.format(suma)%>
    </h3>
    <h1>-------------------------------------------------------</h1>
</body>
</html>