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
public class Trabajador {
    int ID;
    String Correo,Contrasena,Numero,DUI,Nickname;
    int ID_ROL;

    public Trabajador() {
    }

    public Trabajador(int ID, String Correo, String Contrasena, String Numero, String DUI, String Nickname, int ID_ROL) {
        this.ID = ID;
        this.Correo = Correo;
        this.Contrasena = Contrasena;
        this.Numero = Numero;
        this.DUI = DUI;
        this.Nickname = Nickname;
        this.ID_ROL = ID_ROL;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public int getID_ROL() {
        return ID_ROL;
    }

    public void setID_ROL(int ID_ROL) {
        this.ID_ROL = ID_ROL;
    }
    
    
}
