package grupo_4.help.entities;

import jakarta.persistence.*;

@Entity
@Table(name ="TipoAyuda")
public class TipoAyuda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoAyuda;
    @Column(name = "descripcion", nullable = false, length = 25)
    private String descripcion;
    public TipoAyuda() {}

    public TipoAyuda(int idTipoAyuda, String descripcion) {
        this.idTipoAyuda = idTipoAyuda;
        this.descripcion = descripcion;
    }

    public int getIdTipoAyuda() {
        return idTipoAyuda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setIdTipoAyuda(int idTipoAyuda) {
        this.idTipoAyuda = idTipoAyuda;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}