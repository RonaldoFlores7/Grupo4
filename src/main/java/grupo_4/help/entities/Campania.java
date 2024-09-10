package grupo_4.help.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Campania")
public class Campania {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCampania;
    @ManyToOne
    @JoinColumn(name = "idDamnificado")
    private Usuario idDamnificado;
    @ManyToOne
    @JoinColumn(name = "idTipoCampania")
    private TipoCampania idTipoCampania;
    @ManyToOne
    @JoinColumn(name = "idTipoDonacion")
    private TipoDonacion idTipoDonacion;
    @ManyToOne
    @JoinColumn(name = "idDistrito")
    private Distrito idDistrito;
    @Column(name = "fechaInicio", nullable = false)
    private LocalDate fechaInicio;
    @Column(name = "fechaFin", nullable = false)
    private LocalDate fechaFin;
    @Column(name = "cuentaDestino", nullable = false,length = 20)
    private String cuentaDestino;
    @Column(name = "lugarDestinoViveres", nullable = false,length = 40)
    private String lugarDestinoViveres;
    @Column(name = "descripcionCampania", nullable = false,length = 200)
    private String descripcionCampania;
    @Column(name = "estadoCampania", nullable = false,length = 15)
    private String estadoCampania;

    public Campania() {
    }

    public Campania(int idCampania, Usuario idDamnificado, TipoCampania idTipoCampania, TipoDonacion idTipoDonacion, Distrito idDistrito, LocalDate fechaInicio, LocalDate fechaFin, String cuentaDestino, String lugarDestinoViveres, String descripcionCampania, String estadoCampania) {
        this.idCampania = idCampania;
        this.idDamnificado = idDamnificado;
        this.idTipoCampania = idTipoCampania;
        this.idTipoDonacion = idTipoDonacion;
        this.idDistrito = idDistrito;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cuentaDestino = cuentaDestino;
        this.lugarDestinoViveres = lugarDestinoViveres;
        this.descripcionCampania = descripcionCampania;
        this.estadoCampania = estadoCampania;
    }

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

    public TipoDonacion getIdTipoDonacion() {
        return idTipoDonacion;
    }

    public void setIdTipoDonacion(TipoDonacion idTipoDonacion) {
        this.idTipoDonacion = idTipoDonacion;
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
