package tienda.modelo.dao;

import java.sql.SQLException;
import tienda.conexion.Conexion;
import tienda.modelo.bean.Usuario;

public class UsuarioDAO extends Conexion {
    public Usuario validarUsuario(String us, String pas) {
        Usuario u=null;
        //sql para buscar usuario
        String sql = "select*from usuario where usuario=? and password=?";
        //conexion a la base de datos
        cn = abrirConexion();
        try {
            //ejecutar instruccion sql
            stm = cn.prepareStatement(sql);
            //asignar valor a los parametros ??
            stm.setString(1, us);
            stm.setString(2, pas);
            //ejecutar
            rs = stm.executeQuery();
            //leer rs
            if(rs.next()){
                u=new Usuario();
                u.setIdus(rs.getInt(1));
                u.setUsuario(rs.getString(2));
                u.setPassword(rs.getString(3));
                u.setEatado(rs.getString(4));
                u.setIdempledo(rs.getInt(5));
            }
            return u;
        } catch (SQLException ex) {
            return null;
        }finally{
            cerrar(cn);
            cerrar(stm);
            cerrar(rs);
        }
    }
}
