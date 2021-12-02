/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import service.Ticket;

/**
 *
 * @author carlo
 */
public class Service_Ticket {

    public Service_Ticket() {
    }

    public int generacion(int id) {
        service.ServiciosTicket_Service service = new service.ServiciosTicket_Service();
        service.ServiciosTicket port = service.getServiciosTicketPort();
        return port.generacion(id);
    }

    public  java.util.List<service.Ticket> busquedaT(int idUsuario) {
        service.ServiciosTicket_Service service = new service.ServiciosTicket_Service();
        service.ServiciosTicket port = service.getServiciosTicketPort();
        return port.busquedaT(idUsuario);
    }

    public String cancelar(int idUsuario) {
        service.ServiciosTicket_Service service = new service.ServiciosTicket_Service();
        service.ServiciosTicket port = service.getServiciosTicketPort();
        return port.cancelar(idUsuario);
    }

    public  Ticket delete(int idTicket, int idProducto, int cantidad) {
        service.ServiciosTicket_Service service = new service.ServiciosTicket_Service();
        service.ServiciosTicket port = service.getServiciosTicketPort();
        return port.delete(idTicket, idProducto, cantidad);
    }

    public String actualizarT(int idTicket, int idProducto, int cantidad, int devuelto) {
        service.ServiciosTicket_Service service = new service.ServiciosTicket_Service();
        service.ServiciosTicket port = service.getServiciosTicketPort();
        return port.actualizarT(idTicket, idProducto, cantidad, devuelto);
    }
    
    
}
