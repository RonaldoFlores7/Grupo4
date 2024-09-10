package grupo_4.help.dtos;

import grupo_4.help.entities.Campania;
import grupo_4.help.entities.TipoDonacion;
import grupo_4.help.entities.Usuario;


import java.time.LocalDate;

public class DonacionDTO {
    private int idDonacion;
    private String telefono;
    private double montoTransferido;
    private String descripcionDonac;
    private LocalDate fechaDonacion;
    private String estado;
    private Usuario us;
    private Campania ca;
    private TipoDonacion td;

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

    public LocalDate getFechaDonacion() {
        return fechaDonacion;
    }

    public void setFechaDonacion(LocalDate fechaDonacion) {
        this.fechaDonacion = fechaDonacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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
