package grupo_4.help.serviceimplements;

import grupo_4.help.entities.TipoAyuda;
import grupo_4.help.repositories.ITipoAyudaRepository;
import grupo_4.help.serviceinterfaces.ITipoAyudaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoAyudaServiceImplement implements ITipoAyudaService {
    @Autowired
    private ITipoAyudaRepository taR;

    @Override
    public List<TipoAyuda> list() {
        return taR.findAll();
    }

    @Override
    public void insert(TipoAyuda tipoAyuda) {
        taR.save(tipoAyuda);
    }

    @Override
    public void update(TipoAyuda tipoAyuda) {
        taR.save(tipoAyuda);
    }

    @Override
    public void delete(int idTipoAyuda) {
        taR.deleteById(idTipoAyuda);
    }
}
