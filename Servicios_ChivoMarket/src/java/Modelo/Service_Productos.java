/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import service.Productos;

/**
 *
 * @author carlo
 */
public class Service_Productos {

    public Service_Productos() {
    }

    public java.util.List<service.Productos> listarProducto() {
        service.ServiciosProductos_Service service = new service.ServiciosProductos_Service();
        service.ServiciosProductos port = service.getServiciosProductosPort();
        return port.listarProducto();
    }

  public java.util.List<service.Productos> buscar(int idCategoria) {
        service.ServiciosProductos_Service service = new service.ServiciosProductos_Service();
        service.ServiciosProductos port = service.getServiciosProductosPort();
        return port.buscar(idCategoria);
    }

    public String actualizarCantidad(int id, int cantidad) {
        service.ServiciosProductos_Service service = new service.ServiciosProductos_Service();
        service.ServiciosProductos port = service.getServiciosProductosPort();
        return port.actualizarCantidad(id, cantidad);
    }

    public  java.util.List<service.Productos> busquedaIDProducto(int id) {
        service.ServiciosProductos_Service service = new service.ServiciosProductos_Service();
        service.ServiciosProductos port = service.getServiciosProductosPort();
        return port.busquedaIDProducto(id);
    }

  

    public Productos eliminarP(int idProducto) {
        service.ServiciosProductos_Service service = new service.ServiciosProductos_Service();
        service.ServiciosProductos port = service.getServiciosProductosPort();
        return port.eliminarP(idProducto);
    }

    public String cambiarDatosProductos(java.lang.String nombreProducto, int id, int cantidad, double precio, int idCAT, java.lang.String imagen, java.lang.String descripcion) {
        service.ServiciosProductos_Service service = new service.ServiciosProductos_Service();
        service.ServiciosProductos port = service.getServiciosProductosPort();
        return port.cambiarDatosProductos(nombreProducto, id, cantidad, precio, idCAT, imagen, descripcion);
    }

    public String agregarProducto(java.lang.String nombre, java.lang.String imagen, double precio, int cantidad, int idCategoria, java.lang.String descripcion) {
        service.ServiciosProductos_Service service = new service.ServiciosProductos_Service();
        service.ServiciosProductos port = service.getServiciosProductosPort();
        return port.agregarProducto(nombre, imagen, precio, cantidad, idCategoria, descripcion);
    }

 

   
    

   

 

    

    
    
    
}
