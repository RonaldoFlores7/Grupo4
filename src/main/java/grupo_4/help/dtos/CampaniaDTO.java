package grupo_4.help.dtos;

import grupo_4.help.entities.Distrito;
import grupo_4.help.entities.TipoAyuda;
import grupo_4.help.entities.TipoCampania;
import grupo_4.help.entities.Usuario;

import java.time.LocalDate;

public class CampaniaDTO {
    private int idCampania;
    private Usuario idDamnificado;
    private TipoCampania idTipoCampania;
    private TipoAyuda idTipoAyuda;
    private Distrito idDistrito;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String cuentaDestino;
    private String lugarDestinoViveres;
    private String descripcionCampania;
    private String estadoCampania;

    public int getIdCampania() {
        return idCampania;
    }

    public void setIdCampania(int idCampania) {
        this.idCampania = idCampania;
    }

    public Usuario getIdDamnificado() {
        return idDamnificado;
    }

    public void setIdDamnificado(Usuario idDamnificado) {
        this.idDamnificado = idDamnificado;
    }

    public TipoCampania getIdTipoCampania() {
        return idTipoCampania;
    }

    public void setIdTipoCampania(TipoCampania idTipoCampania) {
        this.idTipoCampania = idTipoCampania;
    }

    public TipoAyuda getIdTipoAyuda() {
        return idTipoAyuda;
    }

    public void setIdTipoAyuda(TipoAyuda idTipoAyuda) {
        this.idTipoAyuda = idTipoAyuda;
    }

    public Distrito getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(Distrito idDistrito) {
        this.idDistrito = idDistrito;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public String getLugarDestinoViveres() {
        return lugarDestinoViveres;
    }

    public void setLugarDestinoViveres(String lugarDestinoViveres) {
        this.lugarDestinoViveres = lugarDestinoViveres;
    }

    public String getDescripcionCampania() {
        return descripcionCampania;
    }

    public void setDescripcionCampania(String descripcionCampania) {
        this.descripcionCampania = descripcionCampania;
    }

    public String getEstadoCampania() {
        return estadoCampania;
    }

    public void setEstadoCampania(String estadoCampania) {
        this.estadoCampania = estadoCampania;
    }
}
