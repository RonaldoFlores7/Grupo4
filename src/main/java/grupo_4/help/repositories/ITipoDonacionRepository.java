package grupo_4.help.repositories;

import grupo_4.help.entities.TipoDonacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoDonacionRepository extends JpaRepository<TipoDonacion, Integer> {

}