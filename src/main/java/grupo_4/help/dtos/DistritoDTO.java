package grupo_4.help.dtos;

import grupo_4.help.entities.Departamento;

public class DistritoDTO {

    private int idDistrito;

    private String nombreDistrito;

    private Departamento de;

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }

    public Departamento getDe() {
        return de;
    }

    public void setDe(Departamento de) {
        this.de = de;
    }
}
