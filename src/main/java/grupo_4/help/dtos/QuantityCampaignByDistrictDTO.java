package grupo_4.help.dtos;

public class QuantityCampaignByDistrictDTO {
    private String nombreDistrito;
    private int cantidadCampanias;

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }

    public int getCantidadCampanias() {
        return cantidadCampanias;
    }

    public void setCantidadCampanias(int cantidadCampanias) {
        this.cantidadCampanias = cantidadCampanias;
    }
}
