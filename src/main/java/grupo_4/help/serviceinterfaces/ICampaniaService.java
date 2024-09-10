package grupo_4.help.serviceinterfaces;

import grupo_4.help.entities.Campania;
import java.util.List;

public interface ICampaniaService {
    public List<Campania> list();
    public void insert(Campania campania);
    public void update(Campania campania);
    public void delete(int idCampania);
    public List<String[]> MontoTotalDonacionesporCampania();
    public List<String[]> CantidadTotalVoluntariosporCampania();

}
