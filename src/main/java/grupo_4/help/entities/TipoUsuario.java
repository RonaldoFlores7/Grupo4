package grupo_4.help.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "TipoUsuario")
public class TipoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoUsuario;

    @Column(name = "nombre",nullable = false, length = 15)
    private String nombre;

    public TipoUsuario() {
    }

    public TipoUsuario(int idTipoUsuario, String nombre) {
        this.idTipoUsuario = idTipoUsuario;
        this.nombre = nombre;
    }

    public int getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(int idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
