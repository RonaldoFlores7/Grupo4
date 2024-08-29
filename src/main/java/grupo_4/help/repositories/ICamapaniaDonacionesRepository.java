package grupo_4.help.repositories;

import grupo_4.help.entities.CampaniaDonaciones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICamapaniaDonacionesRepository extends JpaRepository<CampaniaDonaciones, Integer> {
}
