package grupo_4.help.dtos;

import java.time.LocalDate;

public class CampaniaDonacionesDTO {
    private int idCampaniaD;
    private String nombreCampaniaD;
    private String descripcionCampaniaD;
    private LocalDate fechaInicioCampaniaD;
    private LocalDate fechaFinCampaniaD;
    private String estadoCampaniaD;

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
