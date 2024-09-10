package grupo_4.help.repositories;

import grupo_4.help.entities.Campania;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface ICampaniaRepository extends JpaRepository<Campania, Integer> {
    @Query(value = "SELECT ca.descripcion_campania, SUM(d.monto_transferido) As MONTO \n" +
            " FROM campania ca\n" +
            " INNER JOIN donacion d\n" +
            " ON ca.id_campania = d.id_campania\n" +
            " GROUP BY ca.descripcion_campania" ,nativeQuery = true)
    public List<String[]> MontoTotalDonacionesporCampania();

    @Query(value = "SELECT ca.descripcion_campania, COUNT(td.id_tipo_donacion) as CANTIDADTOTAL\n \n" +
            " FROM campania ca\n" +
            " INNER JOIN tipo_donacion td\n" +
            " ON ca.id_tipo_donacion = td.id_tipo_donacion\n" +
            " GROUP BY ca.descripcion_campania" ,nativeQuery = true)
    public List<String[]> CantidadTotalVoluntariosporCampania();

}
