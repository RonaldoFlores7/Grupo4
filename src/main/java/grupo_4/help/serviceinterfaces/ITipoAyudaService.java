package grupo_4.help.serviceinterfaces;

import grupo_4.help.entities.TipoAyuda;

import java.util.List;

public interface ITipoAyudaService {
    public List<TipoAyuda> list();
    public void insert (TipoAyuda tipoAyuda);
    public void update (TipoAyuda tipoAyuda);
    public void delete (int idTipoAyuda);
}
