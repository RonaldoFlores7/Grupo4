package grupo_4.help.repositories;

import grupo_4.help.entities.Donacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IDonacionRepository extends JpaRepository<Donacion, Integer> {
@Query("select d from  Donacion d where d.fechaDonacion = :fechaSolicitada ")
public List<Donacion> buscarPorFecha(@Param("fechaSolicitada") LocalDate fechaSolicitada);
    @Query(value = "SELECT d.fecha_donacion, COUNT(*) AS CantidadDonacionesPorFecha " +
            "FROM Donacion d GROUP BY d.fecha_donacion",
            nativeQuery = true)
public List<String[]> cantidadDonacionesPorFecha();
}
