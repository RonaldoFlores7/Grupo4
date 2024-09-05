package grupo_4.help.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(
        name = "Donacion"
)
public class Donacion {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int idDonacion;
    @Column(
            name = "telefono",
            nullable = false
    )
    private String telefono;
    @Column (
            name = "montoTransferido",
            nullable = false,
            length = 9
    )
    private double montoTransferido;
    @Column (
            name = "descripcionDonac",
            nullable = false
    )
    private String descripcionDonac;
    @Column (
            name = "fechaDonacion",
            nullable = false,
            length = 100
    )
    private LocalDate fechaDonacion;
    @Column (
            name = "estado",
            nullable = false,
            length = 15
    )
    private String estado;
    @ManyToOne
    @JoinColumn(
            name = "idUsuario"
    )
    private Usuario us;
    @ManyToOne
    @JoinColumn(
            name = "idCampania"
    )
    private Campania ca;
    @ManyToOne
    @JoinColumn(
            name = "idTipoDonacion"
    )
    private TipoDonacion ta;
    public Donacion() {}

    public Donacion(int idDonacion, String telefono, double montoTransferido, String descripcionDonac, LocalDate fechaDonacion, String estado, Usuario us, Campania ca, TipoDonacion ta) {
        this.idDonacion = idDonacion;
        this.telefono = telefono;
        this.montoTransferido = montoTransferido;
        this.descripcionDonac = descripcionDonac;
        this.fechaDonacion = fechaDonacion;
        this.estado = estado;
        this.us = us;
        this.ca = ca;
        this.ta = ta;
    }

    public int getIdDonacion() {
        return idDonacion;
    }

    public void setIdDonacion(int idDonacion) {
        this.idDonacion = idDonacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getMontoTransferido() {
        return montoTransferido;
    }

    public void setMontoTransferido(double montoTransferido) {
        this.montoTransferido = montoTransferido;
    }

    public String getDescripcionDonac() {
        return descripcionDonac;
    }

    public void setDescripcionDonac(String descripcionDonac) {
        this.descripcionDonac = descripcionDonac;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LocalDate getFechaDonacion() {
        return fechaDonacion;
    }

    public void setFechaDonacion(LocalDate fechaDonacion) {
        this.fechaDonacion = fechaDonacion;
    }

    public Usuario getUs() {
        return us;
    }

    public void setUs(Usuario us) {
        this.us = us;
    }

    public Campania getCa() {
        return ca;
    }

    public void setCa(Campania ca) {
        this.ca = ca;
    }

    public TipoDonacion getTa() {
        return ta;
    }

    public void setTa(TipoDonacion ta) {
        this.ta = ta;
    }
}
