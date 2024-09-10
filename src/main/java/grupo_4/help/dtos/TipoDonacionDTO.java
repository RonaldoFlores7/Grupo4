package grupo_4.help.dtos;

public class TipoDonacionDTO {
    private int idTipoDonacion;
    private String descripcion;

    public int getIdTipoDonacion() {
        return idTipoDonacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIdTipoDonacion(int idTipoDonacion) {
        this.idTipoDonacion = idTipoDonacion;
    }
}