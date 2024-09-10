package grupo_4.help.repositories;

import grupo_4.help.entities.Distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IDistritoRepository extends JpaRepository<Distrito, Integer> {
    @Query(value = "Select d.nombre_distrito, sum (pa.id_pedir_ayuda) AS cantidad\n" +
            " From distrito d INNER JOIN pedir_ayuda pa\n" +
            " ON d.id_distrito=pa.id_distrito\n" +
            " Group by d.nombre_distrito",nativeQuery = true)
    public List<String[]> cantidad();

    @Query(value = "Select d.nombre_distrito, sum (pa.id_campania) AS cantidadC\n" +
            " From distrito d INNER JOIN campania campania\n" +
            " ON d.id_distrito=campania.id_distrito\n" +
            " Group by d.nombre_distrito",nativeQuery = true)
    public List<String[]> cantidadC();


}
