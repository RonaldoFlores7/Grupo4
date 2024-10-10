package grupo_4.help.repositories;

import grupo_4.help.entities.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITipoUsuarioRepository extends JpaRepository<TipoUsuario, Integer> {
    @Query(value ="select tu.rol, count(*) as cantidad_usuarios\n" +
            "from tipo_usuario tu inner join usuario u on tu.user_id = u.id_usuario\n" +
            "group by tu.rol" ,nativeQuery = true)
    public List<String[]> cantidadUsuariosTipoUsuario();
}
