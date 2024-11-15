package grupo_4.help.serviceinterfaces;

import grupo_4.help.entities.Donacion;

import java.time.LocalDate;
import java.util.List;

public interface IDonacionService {
    List<Donacion> list();
    void insert (Donacion donacion);
    void update (Donacion donacion);
    public List<String[]> DonacionesMonetariasPorMes();
    public List<String[]> DonacionesMonetariasPorUsuario();
    List<String[]> cantidadDonacionesPorFecha();
    List<Donacion> findbyDate (LocalDate fechaSolicitada);
}
