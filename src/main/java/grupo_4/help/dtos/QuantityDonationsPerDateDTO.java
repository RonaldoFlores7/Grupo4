package grupo_4.help.dtos;

import java.time.LocalDate;

public class QuantityDonationsPerDateDTO {
    public LocalDate fecha;
    public int cantidadDonacionesPorFecha;

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getCantidadDonacionesPorFecha() {
        return cantidadDonacionesPorFecha;
    }

    public void setCantidadDonacionesPorFecha(int cantidadDonacionesPorFecha) {
        this.cantidadDonacionesPorFecha = cantidadDonacionesPorFecha;
    }
}
