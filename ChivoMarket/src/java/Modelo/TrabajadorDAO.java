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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlo
 */
public class TrabajadorDAO implements CRUD_TRABAJADOR {
PreparedStatement ps;
    ResultSet rs;
    Connection con;
    int res;
    CallableStatement st;
    String msj;
    ConexionSQL conex = new ConexionSQL();
    @Override
    public Trabajador ValidarUsuario(Trabajador T) {
        try {
            con = conex.getConexionSql();
            st = con.prepareCall("{Call SP_Login_Trabajador(?,?)}");
            st.setString(1, T.getCorreo());
            st.setString(2, T.getContrasena());
            rs = st.executeQuery();
            if (rs.next()) {
                res = rs.getInt("ID");
               
                if (res > 0) {
                    T.setID(rs.getInt("ID"));
                    T.setNickname(rs.getString("Nickname"));
                    T.setCorreo(rs.getString("correo"));
                    T.setContrasena(rs.getString("contrasena"));
                    T.setNumero(rs.getString("Numero"));
                    T.setDUI(rs.getString("DUI"));
                    T.setID_ROL(rs.getInt("ID_ROL"));
                } else {
                    T.setID(-1);
                }

            }

        } catch (Exception ex) {
            T.setID(0);
            T.setNickname(ex.getMessage());
            return T;
        }
        return T;
    }

    @Override
    public String InsertarTrabajador(String Nickname, String Correo, String Contrasena, String Numero, String DUI, int ID_ROL) {
         String SQL = "{Call SP_INSERT_Trabajador(?,?,?,?,?,?)}";
     String msj="";   
     try {
            con = conex.getConexionSql();
            ps = con.prepareStatement(SQL);
            ps.setString(1, Nickname);
            ps.setString(2, Correo);
            ps.setString(3, Contrasena);
            ps.setString(4, Numero);
            ps.setString (5, DUI);
            ps.setInt(6, ID_ROL);
            res = ps.executeUpdate();
            if (res == 1) {
                msj = "Trabajador Agregado";

            }
        } catch (Exception ex) {
            msj = ex.getMessage();

        }
        return msj;
    }

    @Override
    public String ActualizarTrabajador(int ID, String Nickname, String Correo, String Contrasena, String Numero, String DUI, int ID_ROL) {
        String SQL = "{Call SP_UPDATE_TRABAJADOR(?,?,?,?,?,?,?)}";
     String msj="";   
     try {
            con = conex.getConexionSql();
            ps = con.prepareStatement(SQL);
            ps.setInt(1, ID);
            ps.setString(2, Nickname);
            ps.setString(3, Correo);
            ps.setString(4, Contrasena);
            ps.setString(5, Numero);
            ps.setString (6, DUI);
            ps.setInt(7, ID_ROL);
            res = ps.executeUpdate();
            if (res == 1) {
                msj = "Trabajador Actualizado";

            }
        } catch (Exception ex) {
            msj = ex.getMessage();

        }
        return msj;
    }

    @Override
    public Trabajador Delete_Trabajador(int ID) {
        String sql = "{call SP_DELETE_TRABAJADOR("+ID+")}";
        Trabajador tra= new Trabajador();
       try{
           con=conex.getConexionSql();
           ps=con.prepareStatement(sql);
           ps.executeUpdate();
       }
       catch(Exception ex){
           
       }
       return tra;
    }

    @Override
    public List ListarTrabajador() {
       List<Trabajador> datos = new ArrayList<>();
        String sql = "{call SP_Listar_Trabajador()}";
        try {
            con = conex.getConexionSql();
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();
            while (rs.next()) {
                Trabajador tra = new Trabajador();
                tra.setID(rs.getInt("ID"));
                tra.setNickname(rs.getString("Nickname"));
                tra.setCorreo(rs.getString("Correo"));
                tra.setContrasena(rs.getString("Contrasena"));
                tra.setID_ROL(rs.getInt("ID_Rol"));
                tra.setNumero(rs.getString("Numero"));
                tra.setDUI(rs.getString("DUI"));
                datos.add(tra);

            }
        } catch (Exception ex) {

        }
        return datos;
    }

    @Override
    public List ListarTrabajadorEspecifico(int ID) {
        List<Trabajador> datos = new ArrayList<>();
        String sql = "{call SP_Listar_Trabajador_Especifico("+ID+")}";
        try {
            con = conex.getConexionSql();
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();
            if (rs.next()) {
                Trabajador tra = new Trabajador();
                tra.setID(rs.getInt("ID"));
                tra.setNickname(rs.getString("Nickname"));
                tra.setCorreo(rs.getString("Correo"));
                tra.setContrasena(rs.getString("Contrasena"));
                tra.setID_ROL(rs.getInt("ID_Rol"));
                tra.setNumero(rs.getString("Numero"));
                tra.setDUI(rs.getString("DUI"));
                datos.add(tra);

            }
        } catch (Exception ex) {

        }
        return datos;
    }
    
}
