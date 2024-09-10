package grupo_4.help.repositories;

import grupo_4.help.entities.Distrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDistritoRepository extends JpaRepository<Distrito, Integer> {
}
