package grupo_4.help.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="CampaniaDonaciones")
public class CampaniaDonaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCampaniaD;
    @Column(name = "nombreCampaniaD", length = 30, nullable = false)
    private String nombreCampaniaD;
    @Column(name = "descripcionCampaniaD", length = 100)
    private String descripcionCampaniaD;
    @Column(name = "fechaInicioCampaniaD", nullable = false)
    private LocalDate fechaInicioCampaniaD;
    @Column(name = "fechaFinCampaniaD", nullable = false)
    private LocalDate fechaFinCampaniaD;
    @Column(name = "estadoCampaniaD",length = 30, nullable = false)
    private String estadoCampaniaD;

    public CampaniaDonaciones() {
    }

    public CampaniaDonaciones(int idCampaniaD, String nombreCampaniaD, String descripcionCampaniaD, LocalDate fechaInicioCampaniaD, LocalDate fechaFinCampaniaD, String estadoCampaniaD) {
        this.idCampaniaD = idCampaniaD;
        this.nombreCampaniaD = nombreCampaniaD;
        this.descripcionCampaniaD = descripcionCampaniaD;
        this.fechaInicioCampaniaD = fechaInicioCampaniaD;
        this.fechaFinCampaniaD = fechaFinCampaniaD;
        this.estadoCampaniaD = estadoCampaniaD;
    }

    public int getIdCampaniaD() {
        return idCampaniaD;
    }

    public void setIdCampaniaD(int idCampaniaD) {
        this.idCampaniaD = idCampaniaD;
    }

    public String getNombreCampaniaD() {
        return nombreCampaniaD;
    }

    public void setNombreCampaniaD(String nombreCampaniaD) {
        this.nombreCampaniaD = nombreCampaniaD;
    }

    public String getDescripcionCampaniaD() {
        return descripcionCampaniaD;
    }

    public void setDescripcionCampaniaD(String descripcionCampaniaD) {
        this.descripcionCampaniaD = descripcionCampaniaD;
    }

    public LocalDate getFechaInicioCampaniaD() {
        return fechaInicioCampaniaD;
    }

    public void setFechaInicioCampaniaD(LocalDate fechaInicioCampaniaD) {
        this.fechaInicioCampaniaD = fechaInicioCampaniaD;
    }

    public LocalDate getFechaFinCampaniaD() {
        return fechaFinCampaniaD;
    }

    public void setFechaFinCampaniaD(LocalDate fechaFinCampaniaD) {
        this.fechaFinCampaniaD = fechaFinCampaniaD;
    }

    public String getEstadoCampaniaD() {
        return estadoCampaniaD;
    }

    public void setEstadoCampaniaD(String estadoCampaniaD) {
        this.estadoCampaniaD = estadoCampaniaD;
    }
}
