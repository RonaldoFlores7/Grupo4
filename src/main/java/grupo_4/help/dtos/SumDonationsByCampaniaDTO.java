package grupo_4.help.dtos;

public class SumDonationsByCampaniaDTO {
    private String descripcionCampania;
    private double montoTransferido;

    public String getDescripcionCampania() {
        return descripcionCampania;
    }

    public void setDescripcionCampania(String descripcionCampania) {
        this.descripcionCampania = descripcionCampania;
    }

    public double getMontoTransferido() {
        return montoTransferido;
    }

    public void setMontoTransferido(double montoTransferido) {
        this.montoTransferido = montoTransferido;
    }
}
