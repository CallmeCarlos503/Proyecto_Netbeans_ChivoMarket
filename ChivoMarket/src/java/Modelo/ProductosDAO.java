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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlo
 */
public class ProductosDAO implements CRUD_PRODUCTOS {

    Connection conex;
    ConexionSQL cn = new ConexionSQL();
    CallableStatement st;
    ResultSet rs;
    int r = 0;
    PreparedStatement ps;
    Statement f;

    @Override
    public List ListarProductos() {
        List<Productos> datos = new ArrayList<>();
        String sql = "{call SP_LISTAR_PRODUCTOS()}";
        try {
            conex = cn.getConexionSql();
            ps = conex.prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()) {
                Productos pro = new Productos();
                pro.setID(rs.getInt("ID"));
                pro.setNombre(rs.getString("Nombre"));
                pro.setImagen(rs.getString("imagen"));
                pro.setPrecio(rs.getDouble("precio"));
                pro.setCantidad(rs.getInt("cantidad"));
                pro.setID_Categoria(rs.getInt("ID_Categoria"));
                pro.setDescripcion(rs.getString("Descripcion"));
                datos.add(pro);

            }
        } catch (Exception ex) {

        }
        return datos;
    }
    Productos productos2 = new Productos();
    List<Productos> datos = new ArrayList<>();

    @Override
    public List Busqueda(int ID_Categoria) {
        List<Productos> datos2 = new ArrayList<>();
        String sql = "{call SP_BUSCAR_CATEGORIA(" + ID_Categoria + ")}";
        Productos Pro = new Productos();
        try {
            conex = cn.getConexionSql();
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Productos pro1 = new Productos();
                pro1.setID(rs.getInt("ID"));
                pro1.setNombre(rs.getString("Nombre"));
                pro1.setImagen(rs.getString("imagen"));
                pro1.setPrecio(rs.getDouble("precio"));
                pro1.setCantidad(rs.getInt("cantidad"));
                pro1.setID_Categoria(rs.getInt("ID_Categoria"));
                pro1.setDescripcion(rs.getString("Descripcion"));
                datos.add(pro1);
            }
        } catch (Exception ex) {

        }
        return datos;

    }

    @Override
    public String Cambiar_Cantidad(int ID, int Cantidad) {
        String sql = "{call SP_Modificar_Cantidad(?,?)}";
        String MSJ = "";
        try {

            int res = 0;
            conex = cn.getConexionSql();
            ps = conex.prepareStatement(sql);
            ps.setInt(1, ID);
            ps.setInt(2, Cantidad);
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

    @Override
    public List BusquedaporPorducto(int ID_Producto) {
        List<Productos> datos2 = new ArrayList<>();
        String sql = "{call SP_BUSCAR_PRODUCTO_SECCION(" + ID_Producto + ")}";
        Productos Pro = new Productos();
        try {
            conex = cn.getConexionSql();
            ps = conex.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                Productos pro2 = new Productos();
                pro2.setID(rs.getInt("ID"));
                pro2.setNombre(rs.getString("Nombre"));
                pro2.setImagen(rs.getString("imagen"));
                pro2.setPrecio(rs.getDouble("precio"));
                pro2.setCantidad(rs.getInt("cantidad"));
                pro2.setID_Categoria(rs.getInt("ID_Categoria"));
                pro2.setDescripcion(rs.getString("Descripcion"));
                datos.add(pro2);
            }
        } catch (Exception ex) {

        }
        return datos;

    }

    @Override
    public String Actualzar_Producto(String Nombre, int ID, int Cantidad, double precio, int ID_CAT, String IMG, String Descripcion) {
        String sql = "{call SP_Actualizar_Producto(?,?,?,?,?,?,?)}";
        String MSJ = "";
        try {

            int res = 0;
            conex = cn.getConexionSql();
            ps = conex.prepareStatement(sql);
            ps.setString(1, Nombre);
            ps.setInt(2, ID);
            ps.setInt(3, Cantidad);
            ps.setDouble(4, precio);
             ps.setInt(5, ID_CAT);
             ps.setString(6, IMG);
             ps.setString(7, Descripcion);
            res = ps.executeUpdate();
            if (res == 1) {
                MSJ = "Datos Actualizados";
            } else {
                MSJ = "Error";
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return MSJ;
    }
    Productos pros= new Productos();
    @Override
    public Productos EliminarP(int ID) {
       String sql = "{call SP_DELETE_PRODUCTO("+ID+")}";
       try{
           conex=cn.getConexionSql();
           ps=conex.prepareStatement(sql);
           ps.executeUpdate();
       }
       catch(Exception ex){
           
       }
       return pros;
    }

    @Override
    public String AgregarP(String Nombre, String Imagen, double precio, int cantidad, int categoria, String Descripcion) {
     String SQL = "{Call SP_INSERT_PRODUCTO(?,?,?,?,?,?)}";
     String msj="";   
     try {
            conex = cn.getConexionSql();
            ps = conex.prepareStatement(SQL);
            ps.setString(1, Nombre);
            ps.setString(2, Imagen);
            ps.setDouble(3, precio);
            ps.setInt(4, cantidad);
            ps.setInt(5, categoria);
            ps.setString(6, Descripcion);
            r = ps.executeUpdate();
            if (r == 1) {
                msj = "Producto Agregado";

            }
        } catch (Exception ex) {
            msj = ex.getMessage();

        }
        return msj;
    
    
    }

}
