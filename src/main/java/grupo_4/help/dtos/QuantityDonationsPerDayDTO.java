package grupo_4.help.dtos;

public class QuantityDonationsPerDayDTO {
    public int idDonacion;
    public int cantidadDonacionesPorFecha;

    public int getIdDonacion() {
        return idDonacion;
    }

    public void setIdDonacion(int idDonacion) {
        this.idDonacion = idDonacion;
    }

    public int getCantidadDonacionesPorFecha() {
        return cantidadDonacionesPorFecha;
    }

    public void setCantidadDonacionesPorFecha(int cantidadDonacionesPorFecha) {
        this.cantidadDonacionesPorFecha = cantidadDonacionesPorFecha;
    }
}
