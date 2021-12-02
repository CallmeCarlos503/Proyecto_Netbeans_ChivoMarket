/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author carlo
 */
public interface CRUD_PRODUCTOS {
     public List ListarProductos();
     public List Busqueda(int ID);
     public String Cambiar_Cantidad(int ID,int Cantidad);
     public List BusquedaporPorducto(int ID_Producto);
     public String Actualzar_Producto(String Nombre,int ID,int Cantidad, double precio,int ID_CAT, String IMG, String Descripcion);
     public Productos EliminarP(int ID);
     public String AgregarP(String Nombre,String Imagen,double precio,int cantidad, int categoria,String Descripcion);
}
