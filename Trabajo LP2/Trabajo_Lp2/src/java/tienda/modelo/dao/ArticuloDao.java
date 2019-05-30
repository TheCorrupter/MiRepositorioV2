
package tienda.modelo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import tienda.conexion.Conexion;
import tienda.modelo.bean.Articulo;
import tienda.modelo.bean.Detalle;

public class ArticuloDao extends Conexion {
    
    public ArrayList<Articulo> Listar1(String nomb){
        ArrayList<Articulo> Ar = new ArrayList<>();
        Articulo ti=null;
        cn = abrirConexion();
        String sql = "select articulo.idarticulo , articulo.nombre , articulo.descripcion, articulo.precio , articulo.foto , categoria.categoria "
                + "from articulo INNER JOIN categoria on articulo.idcategoria = categoria.idcategoria "
                + "where categoria like '"+nomb+"%'";
        try {
            stm = cn.prepareStatement(sql);
            rs = stm.executeQuery();
            
            while(rs.next()){
                ti = new Articulo();
                ti.setIdarticulo(rs.getInt(1));
                ti.setNombre(rs.getString(2));
                ti.setDescripcion(rs.getString(3));
                ti.setPrecio(rs.getDouble(4));
                ti.setFoto(rs.getString(5));  
                Ar.add(ti);
            }
        } catch (SQLException e) {
            return null;
        }finally{
            cerrar(cn);
            cerrar(stm);
            cerrar(rs);
        }
        return Ar;
    }
    
    public ArrayList<Detalle> Listar3(String fechai , String fechaf){
        ArrayList<Detalle> De = new ArrayList<>();
        Detalle ta = null;
        String sql = "select pd.idpedido , pd.fecha , pd.total , e.nombre , e.apepaterno , e.apematerno, e.cargo , c.apellidos, c.nombres , c.email , p.pais "
                + "from pedido_encabezado pd , empleado e , cliente c , pais p "
                + "where pd.idempleado = e.idempleado and pd.idcliente = c.idcliente and c.Idpais = p.Idpais and pd.fecha between '"+fechai+"' and '"+fechaf+"'";
        cn = abrirConexion();      
        try {
            stm = cn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()){
                ta = new Detalle();    
                ta.setIdpedido(rs.getInt(1));
                ta.setFecha(rs.getString(2));
                ta.setTotal(rs.getDouble(3));
                ta.setNombre(rs.getString(4));
                ta.setApepaterno(rs.getString(5));
                ta.setApematerno(rs.getString(6));
                ta.setCargo(rs.getString(7));
                ta.setNombres(rs.getString(8));
                ta.setApellidos(rs.getString(9));
                ta.setEmail(rs.getString(10));
                ta.setPais(rs.getString(11));
                De.add(ta);
            }
        } catch (SQLException e) {
           return null;
        }finally{
            cerrar(rs);
            cerrar(stm);
            cerrar(cn);
        }
        return De;
    }   
    
    public ArrayList<Articulo> Listar5(){
        ArrayList<Articulo> Ar = new ArrayList<>();
        Articulo ti = null;
        String sql = "select * from articulo where articulo.precio = ( select max(precio) from articulo )";  
        cn = abrirConexion(); 
        try {
            stm = cn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()){
                ti = new Articulo();
                ti.setIdarticulo(rs.getInt(1));
                ti.setIdcategoria(rs.getString(2));
                ti.setNombre(rs.getString(3));
                ti.setDescripcion(rs.getString(4));
                ti.setPrecio(rs.getDouble(5));
                ti.setFoto(rs.getString(6));
               
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
    public ArrayList<Articulo> Listar6(String nomb ){
        ArrayList<Articulo> Ar = new ArrayList<>();
        Articulo ti = null;
        cn = abrirConexion();
        String sql = "select * from articulo where articulo.nombre like ?";
        try { 
            stm = cn.prepareStatement(sql);
            stm.setString(1, nomb+"%");
            rs = stm.executeQuery();
            while (rs.next()){
                ti = new Articulo();    
                ti.setIdarticulo(rs.getInt(1));
                ti.setNombre(rs.getString(3));
                ti.setDescripcion(rs.getString(4));
                ti.setPrecio(rs.getDouble(5));
                ti.setFoto(rs.getString(6));
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
    
    public ArrayList<Articulo> Listar9(){
        ArrayList<Articulo> Ar = new ArrayList<>();
        Articulo ti = null;
        cn = abrirConexion();
        String sql = "select * from articulo a where idarticulo != 4 and idarticulo != 1 and idarticulo != 2";
        try { 
            stm = cn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()){
                ti = new Articulo();    
                ti.setIdarticulo(rs.getInt(1));
                ti.setNombre(rs.getString(3));
                ti.setDescripcion(rs.getString(4));
                ti.setPrecio(rs.getDouble(5));
                ti.setFoto(rs.getString(6));
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
    
    public ArrayList<Articulo> Listar11(){
        ArrayList<Articulo> Ar = new ArrayList<>();
        Articulo ti = null;
        cn = abrirConexion();
        String sql = "select a.idarticulo , a.nombre , a.precio from articulo a ,pedido_detalle pd where pd.idarticulo = a.idarticulo";
        try { 
            stm = cn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()){
                ti = new Articulo();    
                ti.setIdarticulo(rs.getInt(1));
                ti.setNombre(rs.getString(2));
                ti.setPrecio(rs.getDouble(3));
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
    
    public int Listar12(){
        int cant = 0;
        cn = abrirConexion();
        String sql = "select * from articulo a where idarticulo != 4 and idarticulo != 1 and idarticulo != 2";
        try { 
            stm = cn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()){
                cant++;
            }
        } catch (SQLException e) {
            return 0;
        }finally{
            cerrar(rs);
            cerrar(stm);
            cerrar(cn);
        }
        return cant;
        
    }
}
