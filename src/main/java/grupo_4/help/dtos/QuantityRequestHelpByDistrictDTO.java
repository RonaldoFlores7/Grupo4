package grupo_4.help.dtos;

public class QuantityRequestHelpByDistrictDTO {
    private String nombreDistrito;
    private int cantidadPedirAyuda;

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }

    public int getCantidadPedirAyuda() {
        return cantidadPedirAyuda;
    }

    public void setCantidadPedirAyuda(int cantidadPedirAyuda) {
        this.cantidadPedirAyuda = cantidadPedirAyuda;
    }

}
