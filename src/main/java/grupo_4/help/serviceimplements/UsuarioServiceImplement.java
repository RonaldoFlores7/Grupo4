package grupo_4.help.serviceimplements;

import grupo_4.help.entities.Usuario;
import grupo_4.help.repositories.IUsuarioRepository;
import grupo_4.help.serviceinterfaces.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImplement implements IUsuarioService {
    @Autowired
    private IUsuarioRepository uR;

    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public void update(Usuario usuario) {
        uR.save(usuario);
    }

    @Override
    public void delete(int idUsuario) {
        uR.deleteById(idUsuario);
    }
}
