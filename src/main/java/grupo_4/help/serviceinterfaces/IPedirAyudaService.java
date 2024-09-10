package grupo_4.help.serviceinterfaces;

import grupo_4.help.entities.PedirAyuda;

import java.util.List;

public interface IPedirAyudaService {
    public List<PedirAyuda> list();
    public void insert(PedirAyuda pedirAyuda);
    public void update(PedirAyuda pedirAyuda);
    public void delete(int idPedirAyuda);
    public List<String[]> pedirAyudaPendientes();
}
