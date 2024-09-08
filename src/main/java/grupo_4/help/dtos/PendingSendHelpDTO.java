package grupo_4.help.dtos;

import java.time.LocalDate;

public class PendingSendHelpDTO {
    public int idPedirAyuda;
    public String descripcion;
    public LocalDate fechaPedidoAyuda;
    public String nombreDepartamento;
    public String nombreDistrito;

    public int getIdPedirAyuda() {
        return idPedirAyuda;
    }

    public void setIdPedirAyuda(int idPedirAyuda) {
        this.idPedirAyuda = idPedirAyuda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaPedidoAyuda() {
        return fechaPedidoAyuda;
    }

    public void setFechaPedidoAyuda(LocalDate fechaPedidoAyuda) {
        this.fechaPedidoAyuda = fechaPedidoAyuda;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }
}
