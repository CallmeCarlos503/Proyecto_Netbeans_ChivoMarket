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

/**
 *
 * @author carlo
 */
public class ClienteDAO implements CRUD {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    int res;
    CallableStatement st;
    String msj;
    ConexionSQL conex = new ConexionSQL();

    @Override
    public String Register(String nickname, String contrasena, String correo, String telefono) {
        String SQL = "{Call PR_Register(?,?,?,?)}";
        try {
            con = conex.getConexionSql();
            ps = con.prepareStatement(SQL);
            ps.setString(1, nickname);
            ps.setString(2, contrasena);
            ps.setString(3, correo);
            ps.setString(4, telefono);
            res = ps.executeUpdate();
            if (res == 1) {
                msj = "Usuario Agregado";

            }
        } catch (Exception ex) {
            msj = ex.getMessage();

        }
        return msj;
    }

    @Override
    public Cliente ValidarUsuario(Cliente cl) {
        try {
            con = conex.getConexionSql();
            st = con.prepareCall("{Call PR_VALIDACION(?,?)}");
            st.setString(1, cl.getCorreo());
            st.setString(2, cl.getContrasena());
            rs = st.executeQuery();
            if (rs.next()) {
                res = rs.getInt("ID");
               
                if (res > 0) {
                    cl.setID(rs.getInt("ID"));
                    cl.setNickname(rs.getString("Nickname"));
                    cl.setCorreo(rs.getString("correo"));
                    cl.setContrasena(rs.getString("contrasena"));
                    cl.setTelefono(rs.getString("telefono"));
                    cl.setID_Rol(rs.getInt("ID_Rol"));
                } else {
                    cl.setID(-1);
                }

            }

        } catch (Exception ex) {
            cl.setID(0);
            cl.setNickname(ex.getMessage());
            return cl;
        }
        return cl;

    }

    @Override
    public Cliente Verificador(Cliente cl) {
      try {
            con = conex.getConexionSql();
            st = con.prepareCall("{Call SP_verificador(?)}");
            st.setString(1, cl.getCorreo());
            
            rs = st.executeQuery();
            if (rs.next()) {
                res = rs.getInt("ID");
               
                if (res > 0) {
                    cl.setID(rs.getInt("ID"));
                    cl.setNickname(rs.getString("Nickname"));
                    cl.setCorreo(rs.getString("correo"));
                    cl.setContrasena(rs.getString("contrasena"));
                    cl.setTelefono(rs.getString("telefono"));
                    cl.setID_Rol(rs.getInt("ID_Rol"));
                } else {
                    cl.setID(-1);
                }

            }

        } catch (Exception ex) {
            cl.setID(0);
            cl.setNickname(ex.getMessage());
            return cl;
        }
        return cl;
    }

}
