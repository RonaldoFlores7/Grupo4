package grupo_4.help.serviceinterfaces;
import grupo_4.help.entities.Usuario;

import java.util.List;
public interface IUsuarioService {
    public List<Usuario> list();
    public void insert(Usuario usuario);
    public void update(Usuario usuario);
    public void delete(int idUsuario);
}
