/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Modelo.Pedidos;
import Modelo.PedidosDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author carlo
 */
@WebService(serviceName = "Servicios_Pedidos")
public class Servicios_Pedidos {

    /**
     * Web service operation
     */
    PedidosDAO DAO= new PedidosDAO();
    @WebMethod(operationName = "Insertar_Carro")
    public String Insertar_Carro(@WebParam(name = "Nombre") String Nombre, @WebParam(name = "Precio") double Precio, @WebParam(name = "cantidad") int cantidad, @WebParam(name = "Estado") int Estado, @WebParam(name = "ID_Usuario") int ID_Usuario, @WebParam(name = "ID_Producto") int ID_Producto) {
       String datos=DAO.Agregar_Carrito(Nombre, Precio, cantidad, Estado, ID_Usuario, ID_Producto);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Buscar_Carrito")
    public List<Pedidos> Buscar_Carrito(@WebParam(name = "ID") int ID) {
       
         List datos=DAO.Busqueda_ID(ID);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Eliminar")
    public Pedidos Eliminar(@WebParam(name = "ID_Pedido") int ID_Pedido, @WebParam(name = "ID_USER") int ID_USER) {
        Pedidos pe= new Pedidos();
        PedidosDAO D= new PedidosDAO();
        pe=D.delete(ID_Pedido, ID_USER);
        return pe;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ActualizarPedido")
    public String ActualizarPedido(@WebParam(name = "ID_Pedido") int ID_Pedido, @WebParam(name = "ID_Producto") int ID_Producto, @WebParam(name = "Cantidad") int Cantidad,@WebParam(name = "Devuelto") int Devuelto) {
        PedidosDAO D= new PedidosDAO();
        String Dato=D.Actualizar_Pedido(ID_Pedido, ID_Producto, Cantidad,Devuelto);
        return Dato;
    }



}
