package grupo_4.help.repositories;

import grupo_4.help.entities.PedirAyuda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPedirAyudaRepository extends JpaRepository<PedirAyuda, Integer> {
}
