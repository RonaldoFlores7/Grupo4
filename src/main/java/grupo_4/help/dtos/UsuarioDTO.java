package grupo_4.help.dtos;

import grupo_4.help.entities.TipoUsuario;

public class UsuarioDTO {
    private int idUsuario;
    private String nombre;
    private String apellidos;
    private String correo;
    private String contrasenia;

    private TipoUsuario tu;

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
        return tu;
    }

    public void setTu(TipoUsuario tu) {
        this.tu = tu;
    }
}
