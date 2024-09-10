package grupo_4.help.repositories;

import grupo_4.help.entities.Donacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDonacionRepository extends JpaRepository<Donacion, Integer> {
    @Query(value = "SELECT \n" +
            "    TO_CHAR(fecha_Donacion, 'Month') AS mes, \n" +
            "    SUM(monto_transferido) AS total_donaciones\n" +
            "FROM Donacion\n" +
            "WHERE id_Tipo_donacion = (SELECT id_Tipo_donacion FROM Tipo_donacion WHERE descripcion = 'Efectivo')\n" +
            "GROUP BY mes\n" +
            "ORDER BY mes;", nativeQuery = true)
    public List<String[]> DonacionesMonetariasPorMes();

    @Query(value = "SELECT \n" +
            "    u.nombre || ' ' || u.apellidos AS nombre_completo,\n" +
            "    SUM(d.monto_transferido) AS total_donaciones \n" +
            "FROM Donacion d \n" +
            "JOIN Usuario u ON d.id_Usuario = u.id_Usuario \n" +
            "WHERE d.id_Tipo_donacion = (SELECT id_Tipo_donacion FROM Tipo_donacion WHERE descripcion = 'Efectivo') \n" +
            "GROUP BY nombre_completo \n" +
            "ORDER BY total_donaciones DESC;", nativeQuery = true)
    public List<String[]> DonacionesMonetariasPorUsuario();

    @Query(value = "SELECT d.fecha_donacion, COUNT(*) AS CantidadDonacionesPorFecha " +
            "FROM Donacion d GROUP BY d.fecha_donacion",
            nativeQuery = true)
    public List<String[]> cantidadDonacionesPorFecha();

}
