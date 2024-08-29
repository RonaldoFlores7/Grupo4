package grupo_4.help.dtos;

public class TipoAyudaDTO {
    private int idTipoAyuda;
    private String descripcion;

    public int getIdTipoAyuda() {
        return idTipoAyuda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIdTipoAyuda(int idTipoAyuda) {
        this.idTipoAyuda = idTipoAyuda;
    }
}