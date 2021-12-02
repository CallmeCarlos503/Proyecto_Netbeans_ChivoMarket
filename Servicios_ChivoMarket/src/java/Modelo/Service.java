/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import service.Cliente;

/**
 *
 * @author carlo
 */
public class Service {

    public Service() {
    }

    public String registrarse(java.lang.String nickname, java.lang.String contrasena, java.lang.String correo, java.lang.String telefono) {
        service.ServiciosDatosUsuarios_Service service = new service.ServiciosDatosUsuarios_Service();
        service.ServiciosDatosUsuarios port = service.getServiciosDatosUsuariosPort();
        return port.registrarse(nickname, contrasena, correo, telefono);
    }

    public Cliente validarUsuario(java.lang.String correo, java.lang.String contrasena) {
        service.ServiciosDatosUsuarios_Service service = new service.ServiciosDatosUsuarios_Service();
        service.ServiciosDatosUsuarios port = service.getServiciosDatosUsuariosPort();
        return port.validarUsuario(correo, contrasena);
    }

   public  Cliente verificar(java.lang.String correo) {
        service.ServiciosDatosUsuarios_Service service = new service.ServiciosDatosUsuarios_Service();
        service.ServiciosDatosUsuarios port = service.getServiciosDatosUsuariosPort();
        return port.verificar(correo);
    }
    
}
