package grupo_4.help.serviceinterfaces;

import grupo_4.help.entities.Distrito;

import java.util.List;

public interface IDistritoService {
    public List<Distrito> list();
    public void insert(Distrito distrito);
    public void update(Distrito distrito);
    public void delete(int idDistrito);
    public List<String[]> cantidadService();
    public List<String[]> cantidadCService();
}
