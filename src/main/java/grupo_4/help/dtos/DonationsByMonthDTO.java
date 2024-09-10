package grupo_4.help.dtos;

public class DonationsByMonthDTO {
    private String mes;
    private double totalDonaciones;

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public double getTotalDonaciones() {
        return totalDonaciones;
    }

    public void setTotalDonaciones(double totalDonaciones) {
        this.totalDonaciones = totalDonaciones;
    }
}
