package grupo_4.help.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="PedirAyuda")
public class PedirAyuda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedirAyuda;
    @Column(name = "tipoDesastre", nullable = false, length = 30)
    private String tipoDesastre;
    @Column(name = "descripcion", nullable = false, length = 200)
    private String descripcion;
    @Column(name = "latitud", nullable = false)
    private double latitud;
    @Column(name = "longitud", nullable = false)
    private double longitud;
    @Column(name = "fechaPedidoAyuda", nullable = false)
    private LocalDate fechaPedidoAyuda;
    @Column(name = "estado", nullable = false, length = 15)
    private String estado;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario u;
    @ManyToOne
    @JoinColumn(name = "idDistrito")
    private Distrito d;

    public PedirAyuda() {
    }

    public PedirAyuda(int idPedirAyuda, String tipoDesastre, String descripcion, Long latitud, Long longitud, LocalDate fechaPedidoAyuda, String estado, Usuario u, Distrito d) {
        this.idPedirAyuda = idPedirAyuda;
        this.tipoDesastre = tipoDesastre;
        this.descripcion = descripcion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.fechaPedidoAyuda = fechaPedidoAyuda;
        this.estado = estado;
        this.u = u;
        this.d = d;
    }

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

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
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
