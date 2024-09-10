package grupo_4.help.serviceinterfaces;

import grupo_4.help.entities.Donacion;

import java.time.LocalDate;
import java.util.List;

public interface IDonacionService {
    List<Donacion> list();
    void insert (Donacion donacion);
    void update (Donacion donacion);
    List<Donacion> findbyDate (LocalDate fechaSolicitada);
    List<String[]> cantidadDonacionesPorFecha();
}
