
package tienda.modelo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import tienda.conexion.Conexion;
import tienda.modelo.bean.Articulo;
import tienda.modelo.bean.Empleado;

public class EmpleadoDao extends Conexion {
    public ArrayList<Empleado> Listar2(String nomb){
        ArrayList<Empleado> Em = new ArrayList<>();
        Empleado ple = null;
        String sql = "SELECT e.idempleado , e.nombre , e.apepaterno , e.apematerno , e.cargo , a.nombre , a.descripcion , a.precio , a.foto , pd.precio , pd.cantidad , pd.subtotal , pe.fecha , pe.total , c.apellidos , c.nombres , c.email , p.pais "
                + "FROM empleado e , articulo a, pedido_detalle pd , pedido_encabezado pe , cliente c , pais p "
                + "where e.idempleado = pe.idempleado and pd.idpedido = pe.idpedido and pe.idcliente = c.idcliente and pd.idarticulo = a.idarticulo and c.idpais = p.idpais and e.nombre like '"+nomb+"'";
        cn = abrirConexion();        
        try {
            stm = cn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()){
                ple = new Empleado();
                ple.setIdempleado(rs.getInt(1));
                ple.setNombre(rs.getString(2));
                ple.setApepaterno(rs.getString(3));
                ple.setApematerno(rs.getString(4));
                ple.setCargo(rs.getString(5));
                ple.setNombrea(rs.getString(6));
                ple.setDescripcion(rs.getString(7));
                ple.setPrecio(rs.getDouble(8));
                ple.setFoto(rs.getString(9));
                ple.setPrecio2(rs.getDouble(10));
                ple.setCantidad(rs.getInt(11));
                ple.setSubtotal(rs.getDouble(12));
                ple.setFecha(rs.getString(13));
                ple.setTotal(rs.getDouble(14));
                ple.setApelidosc(rs.getString(15));
                ple.setNombresc(rs.getString(16));
                ple.setEmail(rs.getString(17));
                ple.setPais(rs.getString(18));
                Em.add(ple);
            }
        } catch (Exception e) {
        }finally{
            cerrar(stm);
            cerrar(rs);
            cerrar(cn);
        }
        return Em;
    }
    
    public ArrayList<Articulo> Listar4(String nomb ){
        ArrayList<Articulo> Ar = new ArrayList<>();
        Articulo ti = null;
        cn = abrirConexion();
        String sql = "select a.idarticulo , a.nombre , a.descripcion , a.precio "
                + "from articulo a , pedido_detalle pd , pedido_encabezado pe , empleado e "
                + "where pd.idarticulo = a.idarticulo and pd.idpedido = pe.idpedido and pe.idempleado = e.idempleado and e.nombre ='"+nomb+"'";
        try { 
            stm = cn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()){
                ti = new Articulo();    
                ti.setIdarticulo(rs.getInt(1));
                ti.setNombre(rs.getString(2));
                ti.setDescripcion(rs.getString(3));
                ti.setPrecio(rs.getDouble(4));
                Ar.add(ti);
            }
        } catch (SQLException e) {
            return null;
        }finally{
            cerrar(rs);
            cerrar(stm);
            cerrar(cn);
        }
        return Ar;
    }  
}
