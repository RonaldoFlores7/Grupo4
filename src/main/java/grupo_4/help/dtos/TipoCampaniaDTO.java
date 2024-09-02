package grupo_4.help.dtos;

import java.time.LocalDate;

public class TipoCampaniaDTO {
    private int idTipoCampania;
    private String descripcionTipoC;

    public int getIdTipoCampania() {
        return idTipoCampania;
    }

    public void setIdTipoCampania(int idTipoCampania) {
        this.idTipoCampania = idTipoCampania;
    }

    public String getDescripcionTipoC() {
        return descripcionTipoC;
    }

    public void setDescripcionTipoC(String descripcionTipoC) {
        this.descripcionTipoC = descripcionTipoC;
    }
}
