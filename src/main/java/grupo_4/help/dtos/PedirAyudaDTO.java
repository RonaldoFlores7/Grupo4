package grupo_4.help.dtos;


import grupo_4.help.entities.Distrito;
import grupo_4.help.entities.Usuario;

import java.time.LocalDate;

public class PedirAyudaDTO {
    private int idPedirAyuda;
    private String tipoDesastre;
    private String descripcion;
    private Long latitud;
    private Long longitud;
    private LocalDate fechaPedidoAyuda;
    private String estado;
    private Usuario u;
    private Distrito d;

    public int getIdPedirAyuda() {
        return idPedirAyuda;
    }

    public void setIdPedirAyuda(int idPedirAyuda) {
        this.idPedirAyuda = idPedirAyuda;
    }

    public String getTipoDesastre() {
        return tipoDesastre;
    }

    public void setTipoDesastre(String tipoDesastre) {
        this.tipoDesastre = tipoDesastre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getLatitud() {
        return latitud;
    }

    public void setLatitud(Long latitud) {
        this.latitud = latitud;
    }

    public Long getLongitud() {
        return longitud;
    }

    public void setLongitud(Long longitud) {
        this.longitud = longitud;
    }

    public LocalDate getFechaPedidoAyuda() {
        return fechaPedidoAyuda;
    }

    public void setFechaPedidoAyuda(LocalDate fechaPedidoAyuda) {
        this.fechaPedidoAyuda = fechaPedidoAyuda;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }

    public Distrito getD() {
        return d;
    }

    public void setD(Distrito d) {
        this.d = d;
    }
}
