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
public class Pedidos {
    int ID,Cantidad,Estado,ID_Usuario,ID_Producto;
    double precio;
    String Nombre;

    public Pedidos() {
    }

    public Pedidos(int ID, int Cantidad, int Estado, int ID_Usuario, int ID_Producto, double precio, String Nombre) {
        this.ID = ID;
        this.Cantidad = Cantidad;
        this.Estado = Estado;
        this.ID_Usuario = ID_Usuario;
        this.ID_Producto = ID_Producto;
        this.precio = precio;
        this.Nombre = Nombre;
    }

    public int getID_Producto() {
        return ID_Producto;
    }

    public void setID_Producto(int ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

 

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public int getID_Usuario() {
        return ID_Usuario;
    }

    public void setID_Usuario(int ID_Usuario) {
        this.ID_Usuario = ID_Usuario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
