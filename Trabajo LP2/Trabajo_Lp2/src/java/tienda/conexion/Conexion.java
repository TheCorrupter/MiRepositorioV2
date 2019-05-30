/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author RAFAEL
 */
public class Conexion {
    
    protected Connection cn = null ;
    protected String url = "jdbc:mysql://localhost/tienda";
    protected String us = "root";
    protected String pass = "12345678";
    protected PreparedStatement stm ;
    protected ResultSet rs ;
    
    public Connection abrirConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
           cn = DriverManager.getConnection(url, us, pass);
        } catch (Exception e) {
            return null;
        }
        return cn;
    }
    
    protected static void cerrar(Connection con) throws RuntimeException {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException se) {
            System.err.println("Error: cerrarConexion: " + se);
        }
    }

    protected static void cerrar(ResultSet rs) throws RuntimeException {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException se) {
            System.err.println("Error: cerrarResultSet: " + se);
        }
    }

    protected static void cerrar(PreparedStatement stmt)
            throws RuntimeException {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException se) {
            System.err.println("Error: cerrarStatement: " + se);
        }
    }
    
}
