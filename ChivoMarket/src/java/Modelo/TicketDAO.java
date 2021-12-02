/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class TicketDAO implements CRUD_Ticket {
 PreparedStatement ps;
    ResultSet rs;
    Connection con;
    int res;
    CallableStatement st;
    String msj;
    ConexionSQL conex = new ConexionSQL();
    @Override
    public int agregar(int ID) {
         String SQL = "{Call SP_INSERT_TICKET(?)}";
         int I;
        try {
            con = conex.getConexionSql();
            ps = con.prepareStatement(SQL);
          
            ps.setInt(1, ID);
          
            res = ps.executeUpdate();
            if (res == 1) {
                I = 1;

            }
        } catch (Exception ex) {
            msj = ex.getMessage();

        }
        return res;
    }

    @Override
    public List busquedaT(int ID) {
        List<Ticket> datosT = new ArrayList<>();
        String sql = "{call SP_BUSQUEDA_Ticket(" + ID + ")}";
       
        try {
            con=conex.getConexionSql();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Ticket T= new Ticket();
                T.setID(rs.getInt("ID"));
                T.setCantidad(rs.getInt("Cantidad"));
                T.setNombre(rs.getString("Nombre"));
                T.setPrecio(rs.getDouble("precio"));
                T.setEstado(rs.getInt("Estado"));
                T.setID_Usuario(rs.getInt("ID_Usuario"));
                T.setID_Producto(rs.getInt("ID_Producto"));
                datosT.add(T);
            }
        } catch (Exception ex) {

        }
        return datosT;
    }

    @Override
    public String Actualizar(int ID) {
       String sql = "{call SP_CANCELAR_TICKET(?)}";
        String MSJ = "";
        try {

            int res = 0;
           con=conex.getConexionSql();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID);
            res = ps.executeUpdate();
            if (res == 1) {
                MSJ = "Ticket Cancelado";
            } else {
                MSJ = "Error";
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MSJ;
    }

   

    @Override
    public Ticket Delete(int ID_ticket, int ID_Producto, int Cantidad) {
          String sql = "{call SP_Eliminar_Ticket("+ID_ticket+","+ID_Producto+","+Cantidad+")}";
        Ticket TI= new Ticket();
       try{
           con=conex.getConexionSql();
           ps=con.prepareStatement(sql);
           ps.executeUpdate();
       }
       catch(Exception ex){
           
       }
       return TI;
    }

    @Override
    public String ActualizarT(int ID, int ID_PRODCUCTO, int Cantidad, int Devuelto) {
        String sql = "{call  SP_Actualizar_Ticket(?,?,?,?)}";
        String MSJ = "";
        try {

            int res = 0;
            con = conex.getConexionSql();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID);
            ps.setInt(2, ID_PRODCUCTO);
            ps.setInt(3, Cantidad);
            ps.setInt(4, Devuelto);
            res = ps.executeUpdate();
            if (res == 1) {
                MSJ = "Cantidad Actualizada";
            } else {
                MSJ = "Error";
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MSJ;
    }
    
}
