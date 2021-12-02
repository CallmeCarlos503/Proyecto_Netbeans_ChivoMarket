/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Modelo.Productos;
import Modelo.ProductosDAO;
import Modelo.Trabajador;
import Modelo.TrabajadorDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author carlo
 */
@WebService(serviceName = "ServiciosTrabajador")
public class ServiciosTrabajador {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ValidarTrabajador")
    public Trabajador ValidarTrabajador(@WebParam(name = "Contra") String Contra, @WebParam(name = "Correo") String Correo) {
        try{
            
            TrabajadorDAO TDAO= new TrabajadorDAO();
            Trabajador TRA = new Trabajador();
            TRA.setCorreo(Correo);
            TRA.setContrasena(Contra);
            Trabajador RESULTT=TDAO.ValidarUsuario(TRA);
            return TRA;
        }
        catch(Exception EX){
            
        }
        return null;

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Insertar_Trabajador")
    public String Insertar_Trabajador(@WebParam(name = "Nickname") String Nickname, @WebParam(name = "Correo") String Correo, @WebParam(name = "Contrasena") String Contrasena, @WebParam(name = "Numero") String Numero, @WebParam(name = "DUI") String DUI, @WebParam(name = "IDROL") int IDROL) {
        TrabajadorDAO DAO= new TrabajadorDAO();
        String Dato=DAO.InsertarTrabajador(Nickname, Correo, Contrasena, Numero, DUI, IDROL);
        return Dato;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ActualizarTrabajador")
    public String ActualizarTrabajador(@WebParam(name = "ID") int ID, @WebParam(name = "Nickname") String Nickname, @WebParam(name = "Correo") String Correo, @WebParam(name = "Contrasena") String Contrasena, @WebParam(name = "Numero") String Numero, @WebParam(name = "DUI") String DUI, @WebParam(name = "ID_ROL") int ID_ROL) {
       TrabajadorDAO DAO= new TrabajadorDAO();
       String Dato=DAO.ActualizarTrabajador(ID, Nickname, Correo, Contrasena, Numero, DUI, ID_ROL);
       return Dato;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "EliminarT")
    public Trabajador EliminarT(@WebParam(name = "ID") int ID){
        Trabajador pe= new Trabajador();
        TrabajadorDAO D= new TrabajadorDAO();
        pe=D.Delete_Trabajador(ID);
        return pe;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Listar")
    public List<Trabajador> Listar() {
        TrabajadorDAO DAO= new TrabajadorDAO();
        List Datos=DAO.ListarTrabajador();
        return Datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ListarEspecifico")
    public List<Trabajador> ListarEspecifico(@WebParam(name = "id") int id) {
       TrabajadorDAO DAO= new TrabajadorDAO();
        List Datos=DAO.ListarTrabajadorEspecifico(id);
        return Datos;
    }
}
