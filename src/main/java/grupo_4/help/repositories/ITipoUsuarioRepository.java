package grupo_4.help.repositories;

import grupo_4.help.entities.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITipoUsuarioRepository extends JpaRepository<TipoUsuario, Integer> {
    @Query(value ="select tu.nombre, count(*) as cantidad_usuarios\n" +
            "from tipo_usuario tu inner join usuario u on tu.id_tipo_usuario = u.id_tipo_usuario\n" +
            "group by tu.nombre" ,nativeQuery = true)
    public List<String[]> cantidadUsuariosTipoUsuario();
}
