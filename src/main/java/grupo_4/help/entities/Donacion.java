package grupo_4.help.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Donacion")
public class Donacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDonacion;

    @Column(name = "telefono", nullable = false, length = 9)
    private String telefono;

    @Column (name = "montoTransferido", nullable = false)
    private double montoTransferido;

    @Column (name = "descripcionDonacion", nullable = false)
    private String descripcionDonacion;

    @Column (name = "fechaDonacion", nullable = false, length = 100)
    private LocalDate fechaDonacion;

    @Column (name = "estado", nullable = false, length = 15)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario us;

    @ManyToOne
    @JoinColumn(name = "idCampania")
    private Campania ca;

    @ManyToOne
    @JoinColumn(name = "idTipoDonacion")
    private TipoDonacion td;

    public Donacion() {}

    public Donacion(int idDonacion, String telefono, double montoTransferido, String descripcionDonacion, LocalDate fechaDonacion, String estado, Usuario us, Campania ca, TipoDonacion ta) {
        this.idDonacion = idDonacion;
        this.telefono = telefono;
        this.montoTransferido = montoTransferido;
        this.descripcionDonacion = descripcionDonacion;
        this.fechaDonacion = fechaDonacion;
        this.estado = estado;
        this.us = us;
        this.ca = ca;
        this.td = td;
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

    public String getDescripcionDonacion() { return descripcionDonacion;}

    public void setDescripcionDonacion(String descripcionDonacion) {
        this.descripcionDonacion = descripcionDonacion;
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

    public TipoDonacion getTd() {
        return td;
    }

    public void setTd(TipoDonacion td) {
        this.td = td;
    }
}
