/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author carlo
 */
public interface CRUD_TRABAJADOR {
    public Trabajador ValidarUsuario(Trabajador T);
    public String InsertarTrabajador(String Nickname, String Correo,String Contrasena,String Numero,String DUI,int ID_ROL );
    public String ActualizarTrabajador(int ID,String Nickname, String Correo,String Contrasena,String Numero,String DUI,int ID_ROL );
    public Trabajador Delete_Trabajador(int ID);
    public List ListarTrabajador();
    public List ListarTrabajadorEspecifico(int ID);
}
