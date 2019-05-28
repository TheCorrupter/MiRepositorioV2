
package tienda.modelo.bean;

public class Usuario {
   private int idus;
   private String usuario;
   private String password;
   private String eatado;
   private int idempledo;

    public int getIdus() {
        return idus;
    }
   public void setIdus(int idus) {
        this.idus = idus;
    }
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEatado() {
        return eatado;
    }

    public void setEatado(String eatado) {
        this.eatado = eatado;
    }

    public int getIdempledo() {
        return idempledo;
    }

    public void setIdempledo(int idempledo) {
        this.idempledo = idempledo;
    }
   
}
