
package tienda.modelo.dao;

import java.util.ArrayList;
import tienda.conexion.Conexion;
import tienda.modelo.bean.Articulo;


public class ArticuloDAO extends Conexion{
    public ArrayList<Articulo> buscar(String nomb){
        ArrayList<Articulo> a = new ArrayList<>();
        Articulo p = null;
        cn = abrirConexion();
        try {
            stm = cn.prepareStatement("select * from articulo where nombre like ?");
            stm.setString(1, nomb+"%");
            rs = stm.executeQuery();
            while(rs.next()){
               p = new Articulo();
               p.setCodigo(rs.getInt(1));
               p.setNombre(rs.getString(3));
               p.setDescripcion(rs.getString(4));
               p.setPrecio(rs.getDouble(5));
               a.add(p);       
            }
        } catch (Exception e) {
        }finally{
            cerrar(cn);
            cerrar(stm);
            cerrar(rs);
        }
        return a;
    }
}
