
package tienda.modelo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import tienda.conexion.Conexion;
import tienda.modelo.bean.Articulo;


public class ArticulosDAO extends Conexion {
    
    
    public ArrayList<Articulo> buscarINombre(String nom) {
        ArrayList<Articulo> Articulo = new ArrayList<>();
        Articulo ar = null;
        String sql = "select*from empleado where nombre like ?";
        cn = abrirConexion();
        try {
            stm = cn.prepareStatement(sql);
            //asignar valor al parametro ?
            stm.setString(1, nom);
            rs = stm.executeQuery();
            if (rs.next()) {
                ar = new Articulo();
                ar.setIdempelado(rs.getInt(1));
                ar.setNombre(rs.getString(2));
                ar.setPaterno(rs.getString(3));
                ar.setMaterno(rs.getString(4));
                ar.setCargo(rs.getString(5));
                //agrgar emp al arreglo
                Articulo.add(ar);
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
