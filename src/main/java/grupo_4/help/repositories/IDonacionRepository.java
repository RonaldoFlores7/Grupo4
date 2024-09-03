package grupo_4.help.repositories;

import grupo_4.help.entities.Donacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDonacionRepository extends JpaRepository<Donacion, Integer> {

}
