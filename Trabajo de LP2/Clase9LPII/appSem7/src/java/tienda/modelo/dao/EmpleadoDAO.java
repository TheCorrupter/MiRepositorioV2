package tienda.modelo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import tienda.conexion.Conexion;
import tienda.controlador.usuario.Empleado;

public class EmpleadoDAO extends Conexion {

    public Empleado buscarID(int id) {
        Empleado em = null;
        String sql = "select*from empleado where idempleado=?";
        cn = abrirConexion();
        try {
            stm = cn.prepareStatement(sql);
            //asignar valor al parametro ?
            stm.setInt(1, id);
            rs = stm.executeQuery();
            if (rs.next()) {
                em = new Empleado();
                em.setIdempelado(rs.getInt(1));
                em.setNombre(rs.getString(2));
                em.setPaterno(rs.getString(3));
                em.setMaterno(rs.getString(4));
                em.setCargo(rs.getString(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cerrar(cn);
            cerrar(stm);
            cerrar(rs);
        }
        return em;
    }

    public ArrayList<Empleado> buscarINombre(String nom) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Empleado em = null;
        String sql = "select*from empleado where nombre like ?";
        cn = abrirConexion();
        try {
            stm = cn.prepareStatement(sql);
            //asignar valor al parametro ?
            stm.setString(1, nom);
            rs = stm.executeQuery();
            if (rs.next()) {
                em = new Empleado();
                em.setIdempelado(rs.getInt(1));
                em.setNombre(rs.getString(2));
                em.setPaterno(rs.getString(3));
                em.setMaterno(rs.getString(4));
                em.setCargo(rs.getString(5));
                //agrgar emp al arreglo
                empleados.add(em);
            }
        } catch (SQLException ex) {
            return null;
        } finally {
            cerrar(cn);
            cerrar(stm);
            cerrar(rs);
        }
        return empleados;
    }
}
