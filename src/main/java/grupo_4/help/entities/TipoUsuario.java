package grupo_4.help.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "TipoUsuario")
public class TipoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoUsuario;
    private String rol;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private Usuario user;

    public TipoUsuario() {
    }

    public TipoUsuario(int idTipoUsuario, String rol, Usuario user) {
        this.idTipoUsuario = idTipoUsuario;
        this.rol = rol;
        this.user = user;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
