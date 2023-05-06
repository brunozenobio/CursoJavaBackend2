
package mascotaapp.dominio.mascota;

import mascotaapp.dominio.usuario.Usuario;


public class Mascota {
    private int id;
    private String nombre;
    private String apodo;
    private Usuario usuario;

    public Mascota() {
    }

    public Mascota(int id, String nombre, String apodo, Usuario usuario) {
        this.id = id;
        this.nombre = nombre;
        this.apodo = apodo;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", nombre=" + nombre + ", apodo=" + apodo + ", usuario=" + usuario + '}';
    }
    
    
}
