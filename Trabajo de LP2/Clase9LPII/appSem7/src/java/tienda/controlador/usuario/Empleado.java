
package tienda.controlador.usuario;

public class Empleado {
 private int idempelado;
 private String nombre;
 private String paterno;
 private String materno;
 private String cargo;

    public int getIdempelado() {
        return idempelado;
    }

    public void setIdempelado(int idempelado) {
        this.idempelado = idempelado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
