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
public interface CRUD_PEDIDOS {
    public String Agregar_Carrito(String Nombre,double precio,int cantidad,int Estado,int ID_Usuario,int ID_Producto);
    public List Busqueda_ID(int ID);
    public Pedidos delete(int ID_Producto, int ID_USER);
    public String Actualizar_Pedido(int ID_Pedido,int ID_Producto,int Cantidad, int Devuelto);
}
