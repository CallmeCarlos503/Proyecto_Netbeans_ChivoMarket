/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import service.Pedidos;

/**
 *
 * @author carlo
 */
public class Service_Pedido {

    public Service_Pedido() {
    }

    public String insertarCarro(java.lang.String nombre, double precio, int cantidad, int estado, int idUsuario, int idProducto) {
        service.ServiciosPedidos_Service service = new service.ServiciosPedidos_Service();
        service.ServiciosPedidos port = service.getServiciosPedidosPort();
        return port.insertarCarro(nombre, precio, cantidad, estado, idUsuario, idProducto);
    }
public  java.util.List<service.Pedidos> buscarCarrito(int id) {
        service.ServiciosPedidos_Service service = new service.ServiciosPedidos_Service();
        service.ServiciosPedidos port = service.getServiciosPedidosPort();
        return port.buscarCarrito(id);
    }

    public Pedidos eliminar(int idPedido, int idUSER) {
        service.ServiciosPedidos_Service service = new service.ServiciosPedidos_Service();
        service.ServiciosPedidos port = service.getServiciosPedidosPort();
        return port.eliminar(idPedido, idUSER);
    }

    public  String actualizarPedido(int idPedido, int idProducto, int cantidad, int devuelto) {
        service.ServiciosPedidos_Service service = new service.ServiciosPedidos_Service();
        service.ServiciosPedidos port = service.getServiciosPedidosPort();
        return port.actualizarPedido(idPedido, idProducto, cantidad, devuelto);
    }
   
    
}
