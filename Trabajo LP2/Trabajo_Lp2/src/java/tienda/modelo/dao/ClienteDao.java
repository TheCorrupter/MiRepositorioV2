
package tienda.modelo.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import tienda.conexion.Conexion;
import tienda.modelo.bean.Cliente;
import tienda.modelo.bean.Pais;


public class ClienteDao extends Conexion {
    
    public ArrayList<Pais> Listar7(){
            ArrayList<Pais> p = new ArrayList<>();
            Pais ps = null;
            cn = abrirConexion();
            String sql="SELECT * FROM pais WHERE Idpais != 3 and Idpais != 5";
            try {
                stm = cn.prepareStatement(sql);
                rs = stm.executeQuery();
                while(rs.next()){
                    ps = new Pais();
                    ps.setIdpais(rs.getInt(1));
                    ps.setNombres(rs.getString(2));
                    p.add(ps);
                }           
            } catch (SQLException e) {
                return null;
            }finally{
                cerrar(rs);
                cerrar(stm);
                cerrar(cn);
            }
            return p;
        }
    
    public ArrayList<Pais> Listar8(){
            ArrayList<Pais> pa = new ArrayList<>();
            Pais is = null;
            cn = abrirConexion();
            String sql="select p.pais , pe.fecha , pe.total , c.nombres "
                    + "from pais p , pedido_encabezado pe , cliente c "
                    + "where pe.idcliente = c.idcliente and c.idPais = p.idPais";
            try {
                stm = cn.prepareStatement(sql);
                rs = stm.executeQuery();
                while(rs.next()){
                    is = new Pais();
                    is.setPais(rs.getString(1));
                    is.setFecha(rs.getString(2));
                    is.setTotal(rs.getDouble(3));
                    is.setNombres(rs.getString(4));
                    pa.add(is);
                }
            } catch (SQLException e) {
                return null;
            }finally{
                cerrar(rs);
                cerrar(stm);
                cerrar(cn);
            }
            return pa;
        }
    
     public ArrayList<Cliente> Listar10(){
        ArrayList<Cliente> Cl = new ArrayList<>();
        Cliente ie = null;
        cn = abrirConexion();
        String sql = "select c.nombres, c.apellidos, c.email from cliente c where idcliente NOT IN(select cliente_idcliente from pedido_encabezado)";
        try { 
            stm = cn.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()){
                ie = new Cliente();    
                ie.setIdcliente(rs.getInt(1));
                ie.setNombres(rs.getString(3));
                ie.setApellidos(rs.getString(2));
                ie.setEmail(rs.getString(4));
                Cl.add(ie);
            }
        } catch (Exception e) {
            return null;
        }finally{
            cerrar(rs);
            cerrar(stm);
            cerrar(cn);
        }
        return Cl;
        
    }
}
