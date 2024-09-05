package grupo_4.help.entities;

import jakarta.persistence.*;

@Entity
@Table(name ="TipoDonacion")
public class TipoDonacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoDonacion;
    @Column(name = "descripcion", nullable = false, length = 25)
    private String descripcion;
    public TipoDonacion() {}

    public TipoDonacion(int idTipoDonacion, String descripcion) {
        this.idTipoDonacion = idTipoDonacion;
        this.descripcion = descripcion;
    }

    public int getIdTipoDonacion() {
        return idTipoDonacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setIdTipoDonacion(int idTipoDonacion) {
        this.idTipoDonacion = idTipoDonacion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}