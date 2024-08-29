package grupo_4.help.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="TipoCampania")
public class TipoCampania {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoCampania;
    @Column(name = "descripcionTipoC", length = 30, nullable = false)
    private String descripcionTipoC;

    public TipoCampania() {
    }

    public TipoCampania(int idTipoCampania, String descripcionTipoC) {
        this.idTipoCampania = idTipoCampania;
        this.descripcionTipoC = descripcionTipoC;
    }

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
