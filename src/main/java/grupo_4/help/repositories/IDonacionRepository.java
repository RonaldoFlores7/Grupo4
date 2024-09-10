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

}
