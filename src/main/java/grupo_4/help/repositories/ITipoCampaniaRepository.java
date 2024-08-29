package grupo_4.help.repositories;

import grupo_4.help.entities.TipoCampania;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoCampaniaRepository extends JpaRepository<TipoCampania, Integer> {

}
