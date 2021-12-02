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
public interface CRUD_Ticket {
    public int agregar(int ID);
    public List busquedaT(int ID);
    public String Actualizar(int ID);
    public Ticket Delete(int ID_ticket,int ID_Producto,int Cantidad);
    public String ActualizarT(int ID,int ID_PRODCUCTO,int Cantidad, int Devuelto );
}
