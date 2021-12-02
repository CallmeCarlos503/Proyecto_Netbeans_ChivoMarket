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
public class PedidosDAO implements CRUD_PEDIDOS {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    int res;
    CallableStatement st;
    String msj;
    ConexionSQL conex = new ConexionSQL();

    @Override
    public String Agregar_Carrito(String Nombre, double precio, int cantidad, int Estado, int ID_Usuario, int ID_Producto) {
        String SQL = "{Call SP_Insertar_Pedido(?,?,?,?,?,?)}";
        try {
            con = conex.getConexionSql();
            ps = con.prepareStatement(SQL);
            ps.setString(1, Nombre);
            ps.setDouble(2, precio);
            ps.setInt(3, cantidad);
            ps.setInt(4, Estado);
            ps.setInt(5, ID_Usuario);
            ps.setInt(6, ID_Producto);
            res = ps.executeUpdate();
            if (res == 1) {
                msj = "Pedido Agregado con exito";

            }
        } catch (Exception ex) {
            msj = ex.getMessage();

        }
        return msj;
    }

    @Override
    public List Busqueda_ID(int ID) {
        List<Pedidos> datos = new ArrayList<>();
        String sql = "{call SP_BUSCAR_PENDIENTE(" + ID + ")}";

        try {
            con = conex.getConexionSql();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Pedidos pe = new Pedidos();
                pe.setID(rs.getInt("ID"));
                pe.setNombre(rs.getString("Nombre"));
                pe.setPrecio(rs.getDouble("precio"));
                pe.setCantidad(rs.getInt("cantidad"));
                pe.setID_Producto(rs.getInt("ID_Producto"));
                pe.setID_Usuario(rs.getInt("ID_Usuario"));
                pe.setEstado(rs.getInt("Estado"));
                datos.add(pe);

            }
        } catch (Exception ex) {

        }
        return datos;
    }
    Pedidos pedidos = new Pedidos();

    @Override
    public Pedidos delete(int ID_Producto, int ID_USER) {
        String sql = "{call SP_Delete_Pedido(" + ID_Producto + "," + ID_USER + ")}";
        try {
            con = conex.getConexionSql();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception ex) {

        }
        return pedidos;
    }

    @Override
    public String Actualizar_Pedido(int ID_Pedido, int ID_Producto, int Cantidad, int Devuelto) {
        String sql = "{call  SP_Actualizar_Pedido(?,?,?,?)}";
        String MSJ = "";
        try {

            int res = 0;
            con = conex.getConexionSql();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Pedido);
            ps.setInt(2, ID_Producto);
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
