package grupo_4.help.serviceinterfaces;

import grupo_4.help.entities.Donacion;

import java.util.List;

public interface IDonacionService {
    List<Donacion> list();
    void insert (Donacion donacion);
    void delete (int idDonacion);
    void update (Donacion donacion);
}
