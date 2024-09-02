package grupo_4.help.repositories;

import grupo_4.help.entities.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipoUsuarioRepository extends JpaRepository<TipoUsuario, Integer> {
}
