/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Modelo.Ticket;
import Modelo.TicketDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author carlo
 */
@WebService(serviceName = "Servicios_Ticket")
public class Servicios_Ticket {

    /**
     * Web service operation
     */
    TicketDAO DAO= new TicketDAO();
    @WebMethod(operationName = "Generacion")
    public int Generacion(@WebParam(name = "ID") int ID) {
        int Dato=DAO.agregar(ID);
        return Dato;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "BusquedaT")
    public List<Ticket> BusquedaT(@WebParam(name = "ID_Usuario") int ID_Usuario) {
       TicketDAO DAO= new TicketDAO();
       List Datos= DAO.busquedaT(ID_Usuario);
        return Datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Cancelar")
    public String Cancelar(@WebParam(name = "ID_Usuario") int ID_Usuario) {
         TicketDAO DAO= new TicketDAO();
         String Datos=DAO.Actualizar(ID_Usuario);
        return Datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Delete")
    public Ticket Delete(@WebParam(name = "ID_Ticket") int ID_Ticket, @WebParam(name = "ID_Producto") int ID_Producto, @WebParam(name = "Cantidad") int Cantidad) {
        TicketDAO DAO= new TicketDAO();
        Ticket T= DAO.Delete(ID_Ticket, ID_Producto, Cantidad);
        return T;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ActualizarT")
    public String ActualizarT(@WebParam(name = "ID_Ticket") int ID_Ticket, @WebParam(name = "ID_Producto") int ID_Producto, @WebParam(name = "Cantidad") int Cantidad, @WebParam(name = "Devuelto") int Devuelto) {
        TicketDAO DAO= new TicketDAO();
        String Dato=DAO.ActualizarT(ID_Ticket, ID_Producto, Cantidad, Devuelto);
        return Dato;
    }
}
