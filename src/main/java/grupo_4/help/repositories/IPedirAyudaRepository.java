package grupo_4.help.repositories;

import grupo_4.help.entities.PedirAyuda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPedirAyudaRepository extends JpaRepository<PedirAyuda, Integer> {
    @Query(value = "SELECT pa.id_pedir_ayuda, pa.descripcion, pa.fecha_pedido_ayuda, de.nombre_departamento, di.nombre_distrito\n " +
            "FROM pedir_ayuda pa JOIN distrito di ON pa.id_distrito = di.id_distrito\n " +
            "JOIN departamento de ON di.id_departamento = de.id_departamento\n " +
            "WHERE pa.estado = 'Pendiente' \n " +
            "ORDER BY pa.fecha_pedido_ayuda DESC",nativeQuery = true)
    public List<String[]> pedirAyudaPendientes();
}
