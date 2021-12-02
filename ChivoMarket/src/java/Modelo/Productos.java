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
public class Productos {
    int ID;
    String Nombre,imagen;
    double Precio;
    int Cantidad;
    int ID_Categoria;
    String Descripcion;
    public Productos() {
    }

    public Productos(int ID, String Nombre, String imagen, double Precio, int Cantidad, int ID_Categoria, String Descripcion) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.imagen = imagen;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
        this.ID_Categoria = ID_Categoria;
        this.Descripcion = Descripcion;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getID_Categoria() {
        return ID_Categoria;
    }

    public void setID_Categoria(int ID_Categoria) {
        this.ID_Categoria = ID_Categoria;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    
}
