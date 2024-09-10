package grupo_4.help.serviceimplements;

import grupo_4.help.entities.TipoUsuario;
import grupo_4.help.repositories.ITipoUsuarioRepository;
import grupo_4.help.serviceinterfaces.ITipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TipoUsuarioServiceImplement implements ITipoUsuarioService {
    @Autowired
    private ITipoUsuarioRepository tuR;

    @Override
    public List<TipoUsuario> list() {return tuR.findAll();}

    @Override
    public void insert(TipoUsuario tipoUsuario) {
        tuR.save(tipoUsuario);
    }

    @Override
    public void update(TipoUsuario tipoUsuario) {
        tuR.save(tipoUsuario);
    }

    @Override
    public void delete(int idTipoUsuario) {
        tuR.deleteById(idTipoUsuario);
    }

<<<<<<< HEAD
=======
    @Override
    public List<String[]> cantidadUsuariosTipoUsuario() {
        return tuR.cantidadUsuariosTipoUsuario();
    }

>>>>>>> 821d33a (Mis 2 consultas)
}
