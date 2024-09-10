package grupo_4.help.dtos;

public class DonationsByUserDTO {
    private String nombreCompleto;
    private double totalDonaciones;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public double getTotalDonaciones() {
        return totalDonaciones;
    }

    public void setTotalDonaciones(double totalDonaciones) {
        this.totalDonaciones = totalDonaciones;
    }
}
