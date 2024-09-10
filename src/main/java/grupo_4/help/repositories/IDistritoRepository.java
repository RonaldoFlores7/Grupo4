package grupo_4.help.repositories;

import grupo_4.help.entities.Distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDistritoRepository extends JpaRepository<Distrito, Integer> {
    @Query(value = "Select d.nombre_distrito, count(*) AS cantidadPedirAyudas\n" +
            " From distrito d INNER JOIN pedir_ayuda pa\n" +
            " ON d.id_distrito=pa.id_distrito\n" +
            " Group by d.nombre_distrito",nativeQuery = true)
    public List<String[]> cantidadPedirAyudaDistrito();

    @Query(value = "Select d.nombre_distrito, count(*) AS cantidadCampanias\n" +
            " From distrito d INNER JOIN campania c\n" +
            " ON d.id_distrito=c.id_distrito\n" +
            " Group by d.nombre_distrito",nativeQuery = true)
    public List<String[]> cantidadCampaniaDistrito();
}
