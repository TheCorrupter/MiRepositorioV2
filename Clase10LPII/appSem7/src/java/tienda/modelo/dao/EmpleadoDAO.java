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
    
    public ArrayList<Empleado> listar() {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Empleado em = null;
        String sql = "select*from empleado";
        cn = abrirConexion();
        try {
            stm = cn.prepareStatement(sql);
                       
            rs = stm.executeQuery();
            while (rs.next()) {
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
    public void registrar(Empleado emp){
        String sql= "insert into empleado(nombre, apepaterno,apematerno,cargo )values(?,?,?,?)";
        //abrir la conexion
        cn=abrirConexion();
        try{
            
            stm=cn.prepareStatement(sql);
            //asignar valor a los parametros
            stm.setString(1,emp.getNombre());
            stm.setString(2,emp.getPaterno());
            stm.setString(3,emp.getMaterno());
            stm.setString(4,emp.getCargo());
            //ejecutar stm
            stm.executeUpdate(); ///para insert, update, delete
            
            
        }
        catch (SQLException ex){
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cerrar(cn);
            cerrar(stm);
        }
    }
    
    
    public void editar (Empleado emp){
        String sql= "update empleado set nombre=?, apepaterno=?,apematerno=?,cargo=? where idempleado=?";
        //abrir la conexion
        cn=abrirConexion();
        try{
            
            stm=cn.prepareStatement(sql);
            //asignar valor a los parametros ?,?,?,?
            stm.setString(1,emp.getNombre());
            stm.setString(2,emp.getPaterno());
            stm.setString(3,emp.getMaterno());
            stm.setString(4,emp.getCargo());
            stm.setInt(5,emp.getIdempelado());
            //ejecutar stm
            stm.executeUpdate(); ///para insert, update, delete
            
            
        }
        catch (SQLException ex){
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cerrar(cn);
            cerrar(stm);
        }
    }
    
    
     public void eliminar (int cod){
        String sql= "delete from empleado where idempleado=?";
        //abrir la conexion
        cn=abrirConexion();
        try{
            
            stm=cn.prepareStatement(sql);
            stm.setInt(1,cod);
           
            //ejecutar stm
            stm.executeUpdate(); ///para insert, update, delete
            
            
        }
        catch (SQLException ex){
            Logger.getLogger(EmpleadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            cerrar(cn);
            cerrar(stm);
        }
    }
}
