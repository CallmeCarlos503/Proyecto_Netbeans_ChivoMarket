/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Modelo.Cliente;
import Modelo.ClienteDAO;
import Modelo.Productos;
import Modelo.ProductosDAO;
import java.sql.ResultSet;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author carlo
 */
@WebService(serviceName = "ServiciosDatosUsuarios")
public class ServiciosDatosUsuarios {
ClienteDAO DAO= new ClienteDAO();
    /**
     * Web service operation
     */
    @WebMethod(operationName = "Registrarse")
    public String Registrarse(@WebParam(name = "nickname") String nickname, @WebParam(name = "contrasena") String contrasena, @WebParam(name = "correo") String correo, @WebParam(name = "telefono") String telefono) {
        //TODO write your implementation code here:
        
        String datos=DAO.Register(nickname, contrasena, correo, telefono);
        return datos;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ValidarUsuario")
    public Cliente ValidarUsuario(@WebParam(name = "Correo") String Correo, @WebParam(name = "Contrasena") String Contrasena) {
        try{
            ClienteDAO CLDAO= new ClienteDAO();
            Cliente CL= new Cliente();
            CL.setCorreo(Correo);
            CL.setContrasena(Contrasena);
            Cliente RESULT= CLDAO.ValidarUsuario(CL);
            return RESULT;
        }
        catch(Exception ex){
            
        return null;
        }
    }
    @WebMethod(operationName = "Verificar")
    public Cliente Verificar(@WebParam(name = "Correo") String Correo) {
        try{
            ClienteDAO CLDAO= new ClienteDAO();
            Cliente CL= new Cliente();
            CL.setCorreo(Correo);
            
            Cliente RESULT= CLDAO.Verificador(CL);
            return RESULT;
        }
        catch(Exception ex){
            
        return null;
        }
    }






}
