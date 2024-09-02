package grupo_4.help.serviceinterfaces;

import grupo_4.help.entities.TipoUsuario;

import java.util.List;
public interface ITipoUsuarioService {
    public List<TipoUsuario> list();
    public void insert(TipoUsuario tipoUsuario);
    public void update(TipoUsuario tipoUsuario);
    public void delete(int idTipoUsuario);
}
