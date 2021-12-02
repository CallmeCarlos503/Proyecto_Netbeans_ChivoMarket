/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author carlo
 */
public class ConexionSQL {
    Connection cn;
    String url = "jdbc:sqlserver://localhost\\:1433;databaseName=chivo_Mark3t";
    String user = "invitado";
    String password = "123";
    
    public Connection getConexionSql(){//Sql-Server
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            cn=DriverManager.getConnection(url, user, password);
        }
        catch (ClassNotFoundException | SQLException ex){
            return null;
        }
        return cn;
    }
}
