/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author carlo
 */
public interface CRUD {
    public String Register(String nickname,String contrasena,String correo,String telefono);
    public Cliente ValidarUsuario(Cliente cl);
    public Cliente Verificador(Cliente cl);
}
