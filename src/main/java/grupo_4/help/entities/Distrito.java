package grupo_4.help.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Distrito")
public class Distrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDistrito;

    @Column(name = "nombreDistrito", nullable = false, length = 20)
    private String nombreDistrito;

    @ManyToOne
    @JoinColumn(name = "idDepartamento")
    private Departamento de;

    public Distrito() {
    }

    public Distrito(int idDistrito, String nombreDistrito, Departamento de) {
        this.idDistrito = idDistrito;
        this.nombreDistrito = nombreDistrito;
        this.de = de;
    }

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
