/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import service.Trabajador;

/**
 *
 * @author carlo
 */
public class Service_Trabajador {

    public Service_Trabajador() {
    }

    public Trabajador validarTrabajador(java.lang.String contra, java.lang.String correo) {
        service.ServiciosTrabajador_Service service = new service.ServiciosTrabajador_Service();
        service.ServiciosTrabajador port = service.getServiciosTrabajadorPort();
        return port.validarTrabajador(contra, correo);
    }

    public Trabajador eliminarT(int id) {
        service.ServiciosTrabajador_Service service = new service.ServiciosTrabajador_Service();
        service.ServiciosTrabajador port = service.getServiciosTrabajadorPort();
        return port.eliminarT(id);
    }

    public String insertarTrabajador(java.lang.String nickname, java.lang.String correo, java.lang.String contrasena, java.lang.String numero, java.lang.String dui, int idrol) {
        service.ServiciosTrabajador_Service service = new service.ServiciosTrabajador_Service();
        service.ServiciosTrabajador port = service.getServiciosTrabajadorPort();
        return port.insertarTrabajador(nickname, correo, contrasena, numero, dui, idrol);
    }

    public java.util.List<service.Trabajador> listar() {
        service.ServiciosTrabajador_Service service = new service.ServiciosTrabajador_Service();
        service.ServiciosTrabajador port = service.getServiciosTrabajadorPort();
        return port.listar();
    }

    public java.util.List<service.Trabajador> listarEspecifico(int id) {
        service.ServiciosTrabajador_Service service = new service.ServiciosTrabajador_Service();
        service.ServiciosTrabajador port = service.getServiciosTrabajadorPort();
        return port.listarEspecifico(id);
    }

    public String actualizarTrabajador(int id, java.lang.String nickname, java.lang.String correo, java.lang.String contrasena, java.lang.String numero, java.lang.String dui, int idROL) {
        service.ServiciosTrabajador_Service service = new service.ServiciosTrabajador_Service();
        service.ServiciosTrabajador port = service.getServiciosTrabajadorPort();
        return port.actualizarTrabajador(id, nickname, correo, contrasena, numero, dui, idROL);
    }
    
}
