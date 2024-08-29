package grupo_4.help.serviceinterfaces;

import grupo_4.help.entities.CampaniaDonaciones;
import grupo_4.help.entities.TipoUsuario;

import java.util.List;

public interface ICampaniaDonacionesService {
    public List<CampaniaDonaciones> list();
    public void insert(CampaniaDonaciones campaniaD);
    public void update(CampaniaDonaciones campaniaD);
    public void delete(int idCampaniaD);
}
