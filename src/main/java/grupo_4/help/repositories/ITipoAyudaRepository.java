package grupo_4.help.repositories;

import grupo_4.help.entities.TipoAyuda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoAyudaRepository extends JpaRepository<TipoAyuda, Integer> {

}