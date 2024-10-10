package grupo_4.help.repositories;

import grupo_4.help.entities.Campania;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICampaniaRepository extends JpaRepository<Campania, Integer> {
    @Query(value = "SELECT ca.descripcion_campania, SUM(d.monto_transferido) As MONTO \n" +
            " FROM campania ca\n" +
            " INNER JOIN donacion d\n" +
            " ON ca.id_campania = d.id_campania\n" +
            " GROUP BY ca.descripcion_campania" ,nativeQuery = true)
    public List<String[]> MontoTotalDonacionesporCampania();

    @Query(value = "SELECT c.descripcion_campania, COUNT(d.id_donacion) AS CANTIDAD_VOLUNTARIOS\n" +
            " FROM campania c\n" +
            " INNER JOIN donacion d ON c.id_campania = d.id_campania\n" +
            " INNER JOIN tipo_donacion td ON d.id_tipo_donacion = td.id_tipo_donacion\n" +
            " WHERE td.id_tipo_donacion = 2\n" +
            " GROUP BY c.descripcion_campania;\n" ,nativeQuery = true)
    public List<String[]> CantidadTotalVoluntariosporCampania();

}
