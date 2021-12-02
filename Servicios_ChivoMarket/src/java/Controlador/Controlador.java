/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.*;
import java.sql.ResultSet;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
import service.Cliente;
import service.Productos;
import service.ServiciosProductos;
import service.Trabajador;

/**
 *
 * @author carlo
 */
public class Controlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String Accion = request.getParameter("accion");
            Service service = new Service();
            HttpSession session = request.getSession();
            String Acceso = "";
            ResultSet rs;
            String Cache = "";
            String CacheNombrepedido;
            double precioPedido;
            int Cantidadpedido;
            int Estadopedido;
            int ID_usuariocache;
            int ID_ProductoCache;
            int seguro = 0;
            Service_Productos serviceP = new Service_Productos();
            Service_Pedido serviceD= new Service_Pedido();
            
            if (Accion.equals("registrar")) {
                String Correo = request.getParameter("txtCorreo");
                String Nickname = request.getParameter("txtNombre");
                String Password = request.getParameter("txtPassword");
                String Telefono = request.getParameter("txtTelefono");
               
                Cliente cl= new Cliente();
                
                cl = service.verificar(Correo);
                if(cl.getID()>0){
                    session.setAttribute("JS", "1");
                    Acceso="Registro.jsp";
                }
                else{
                session.setAttribute("JS", "2");
                service.registrarse(Nickname, Password, Correo, Telefono); 
                Acceso = "Registro.jsp";
                }
                 
            } else if (Accion.equals("Agregar")) {
                String Nombre = request.getParameter("Nombre");
                double Precio = Double.parseDouble(request.getParameter("Precio"));
                int Cantidad = Integer.parseInt(request.getParameter("txtcantidad"));
                int Estado = 1;
                int ID_Usuario = Integer.parseInt(request.getParameter("ID"));
                int ID_Producto = Integer.parseInt(request.getParameter("ID_Producto"));
                Service_Pedido pedido = new Service_Pedido();
                pedido.insertarCarro(Nombre, Precio, Cantidad, Estado, ID_Usuario, ID_Producto);
                Service_Productos servicioP= new Service_Productos(); 
                int CantidadDisp=Integer.parseInt(request.getParameter("Cantidad"));
                
                servicioP.actualizarCantidad(ID_Producto, -Cantidad);
                Acceso = "Menu_Productos.jsp";
                CacheNombrepedido = Nombre;

            } else if (Accion.equals("iniciar")) {
                Cliente cl = new Cliente();
                if (seguro > 1) {
                    Acceso = "Menu_Productos.jsp";
                    session.setAttribute("user", cl.getNickname());
                    
                    session.setAttribute("ID", cl.getID());
                } else {
                    Acceso = "Login.jsp";
                }
            } else if (Accion.equals("Ingresar")) {
                String Correo = request.getParameter("txtCorreo");
                String Password = request.getParameter("txtPassword");
                Cliente cl = new Cliente();
                int valido;
                Trabajador tr= new Trabajador();
                Service_Trabajador trabajador= new Service_Trabajador();
                cl = service.validarUsuario(Password, Correo);
                tr=trabajador.validarTrabajador(Password, Correo);
                seguro = cl.getID();
              
                if (cl.getID() > 0) {
                   
                    Acceso = "Menu_Productos.jsp";
                    session.setAttribute("user", cl.getNickname());
                    
                    session.setAttribute("ID", cl.getID());
                    
                } 
                else if(tr.getID()>0){
                    Acceso = "Menu_Productos_Edit.jsp";
                    session.setAttribute("user", tr.getNickname());
                    session.setAttribute("Rol",tr.getIDROL());
                    session.setAttribute("ID", tr.getID());
                    session.setAttribute("ID_ROL", tr.getIDROL());
                    
                   
                }
                else {
                     session.setAttribute("Denego","1");
                    Acceso = "Login.jsp";
                }
            }
            else if(Accion.equals("Delete")){
                int ID=Integer.parseInt(request.getParameter("ID"));
                int ID_Usuario=Integer.parseInt(request.getParameter("ID_User"));;
                serviceD.eliminar(ID,ID_Usuario);
                Service_Productos servicioP= new Service_Productos(); 
                int ID_producto=Integer.parseInt(request.getParameter("ID_Producto"));
                int Cantidad=Integer.parseInt(request.getParameter("Cantidad"));
                servicioP.actualizarCantidad(ID_producto, Cantidad);
                Acceso="Carrito_Compras.jsp";
            }
            else if(Accion.equals("Generar")){
                Service_Ticket ticket= new Service_Ticket();
                int ID_Usuario=Integer.parseInt(request.getParameter("ID_User"));
                ticket.generacion(ID_Usuario);
                session.setAttribute("L","1");
                Acceso="Carrito_Compras.jsp";
            }
            else if(Accion.equals("Actualizar Producto")){
                String Nombre=request.getParameter("txtNombre");
                int Cantidad=Integer.parseInt(request.getParameter("txtCantidad"));
                double Precio=Double.parseDouble(request.getParameter("txtprecio"));
                String decision=request.getParameter("cbo_Categoria");
                int ID_Categoria=0;
                if(decision.equals("ELECTRONICO")){
                    ID_Categoria=1;
                }
                else if(decision.equals("MODA")){
                    ID_Categoria=2;
                }
                else if(decision.equals("OTROS")){
                    ID_Categoria=3;
                }
                String IMG=request.getParameter("txtdireccionIMG");
                int ID= Integer.parseInt(request.getParameter("txtID"));
                String Descripcion=request.getParameter("txtDescripcion");
                Service_Productos serP= new Service_Productos();
                serP.cambiarDatosProductos(Nombre, ID, Cantidad, Precio, ID_Categoria, IMG,Descripcion);
               session.setAttribute("OBO","1");
                Acceso="Menu_Productos_Edit.jsp";
            }
            else if(Accion.equals("EliminarP")){
                Service_Productos serP= new Service_Productos();
                int ID=Integer.parseInt(request.getParameter("ID"));
                serP.eliminarP(ID);
                Acceso="Menu_Productos_Edit.jsp";
            }
            else if(Accion.equals("Agregar Productos")){
                 Service_Productos serP= new Service_Productos();
                 String Nombre=request.getParameter("txtNombre");
                 int Cantidad=Integer.parseInt(request.getParameter("txtCantidad"));
                 double precio=Double.parseDouble(request.getParameter("txtprecio"));
                 String decision=request.getParameter("cbo_Categoria");
                int ID_Categoria=0;
                if(decision.equals("ELECTRONICO")){
                    ID_Categoria=1;
                }
                else if(decision.equals("MODA")){
                    ID_Categoria=2;
                }
                else if(decision.equals("OTROS")){
                    ID_Categoria=3;
                }
                 String IMG=request.getParameter("txtdireccionIMG");
                 String Descripcion=request.getParameter("txtDescripcion");
                 serP.agregarProducto(Nombre, IMG, precio, Cantidad, ID_Categoria,Descripcion);
                 session.setAttribute("SD","2");
                 Acceso="Menu_Productos_Edit.jsp";
                
                 
            
            }
            else if(Accion.equals("Cancelar")){
                int ID= Integer.parseInt(request.getParameter("ID"));
                Service_Ticket T= new Service_Ticket();
                T.cancelar(ID);
                session.setAttribute("Cancel","3");
                Acceso="Menu_Productos_Edit.jsp";
                
            }
            else if(Accion.equals("EliminarTi")){
                int ID_Ticket=Integer.parseInt(request.getParameter("ID_Ticket"));
                int ID_Producto=Integer.parseInt(request.getParameter("ID_Producto"));
                int Cantidad=Integer.parseInt(request.getParameter("Cantidad"));
                Service_Ticket SS= new Service_Ticket();
                SS.delete(ID_Ticket, ID_Producto, Cantidad);
                Acceso="ResultadoT.jsp";
            }
            else if(Accion.equals("AC")){
                int ID=Integer.parseInt(request.getParameter("ID"));
                int ID_Producto=Integer.parseInt(request.getParameter("ID_Producto"));
                int Cantidad=Integer.parseInt(request.getParameter("txtActualizo"));
                int Cantidad2=Integer.parseInt(request.getParameter("Cantidad"));
                int totalC=Cantidad2-Cantidad;
                Service_Pedido pe= new Service_Pedido();
                if(totalC>Cantidad2){
                    pe.actualizarPedido(ID, ID_Producto, Cantidad, -totalC);
                }
                else if(totalC<Cantidad2){
                    pe.actualizarPedido(ID, ID_Producto, Cantidad, totalC);
                }
                
                Acceso="Carrito_Compras.jsp";
            }
            else if(Accion.equals("ModificarTT")){
                int ID=Integer.parseInt(request.getParameter("ID_Ticket"));
                int ID_Producto=Integer.parseInt(request.getParameter("ID_Producto"));
                int Cantidad=Integer.parseInt(request.getParameter("txtCantidad"));
                int Resultante=Integer.parseInt(request.getParameter("Cantidad"));
                int total=Resultante-Cantidad;
                Service_Ticket tt= new Service_Ticket();
                if(total<Resultante){
                    tt.actualizarT(ID, ID_Producto, Cantidad, total); 
                }
                else if(total>Resultante){
                     tt.actualizarT(ID, ID_Producto, Cantidad, -total); 
                }
                
                Acceso="ResultadoT.jsp";
            }
            else if(Accion.equals("EliminarTrabajador")){
                int ID=Integer.parseInt(request.getParameter("ID"));
                Service_Trabajador tra= new Service_Trabajador();
                tra.eliminarT(ID);
                Acceso="ListaTrabajador.jsp";
            }
            else if(Accion.equals("Actualizar Trabajador")){
                int ID=Integer.parseInt(request.getParameter("txtID"));
                String Correo=request.getParameter("txtCorreo");
                String Nickname= request.getParameter("txtNickname");
                String Contrasena=request.getParameter("txtContrasena");
                String Numero=request.getParameter("txtNumero");
                String DUI=request.getParameter("txtDUI");
                String Decision=request.getParameter("cbo_Privilegios");
                int ID_Rol=0;
                if(Decision.equals("TRABAJADOR")){
                    ID_Rol=1;
                }
                else if(Decision.equals("Administrador")){
                    ID_Rol=2;
                }
                Service_Trabajador Service= new Service_Trabajador();
                Service.actualizarTrabajador(ID, Nickname, Correo, Contrasena, Numero, DUI, ID_Rol);
                session.setAttribute("Agrega", "2");
                Acceso="ListaTrabajador.jsp";
            }
            else if(Accion.equals("Agregar Trabajador")){
                String Correo=request.getParameter("txtCorreo");
                String Nickname= request.getParameter("txtNickname");
                String Contrasena=request.getParameter("txtContrasena");
                String Numero=request.getParameter("txtTelefono");
                String DUI=request.getParameter("txtDUI");
                String Decision=request.getParameter("cbo_Privilegios");
                int ID_Rol=0;
                if(Decision.equals("Trabajador")){
                    ID_Rol=1;
                }
                else if(Decision.equals("Administrador")){
                    ID_Rol=2;
                }
                Service_Trabajador Service= new Service_Trabajador();
                Service.insertarTrabajador(Nickname, Correo, Contrasena, Numero, DUI, ID_Rol);
                session.setAttribute("Agrega", "1");
                 Acceso="ListaTrabajador.jsp";
            }
            
            

            RequestDispatcher dispatcher = request.getRequestDispatcher(Acceso);
            dispatcher.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
