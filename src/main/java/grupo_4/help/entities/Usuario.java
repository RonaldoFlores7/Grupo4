package grupo_4.help.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "nombre", nullable = false, length = 20)
    private String nombre;

    @Column(name = "apellidos", nullable = false, length = 30)
    private String apellidos;

    @Column(name = "correo", nullable = false, length = 50)
    private String correo;

    @Column(name = "contrasenia", nullable = false, length = 25)
    private String contrasenia;

    @ManyToOne
    @JoinColumn(name = "idTipoUsuario")
    private TipoUsuario Tu;

    public Usuario() {
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public TipoUsuario getTu() {
        return Tu;
    }

    public void setTu(TipoUsuario tu) {
        Tu = tu;
    }
}
