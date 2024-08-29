package grupo_4.help.serviceimplements;

import grupo_4.help.entities.TipoCampania;
import grupo_4.help.repositories.ITipoCampaniaRepository;
import grupo_4.help.serviceinterfaces.ITipoCampaniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoCampaniaServiceImplement implements ITipoCampaniaService {
    @Autowired
    private ITipoCampaniaRepository cdR;

    @Override
    public List<TipoCampania> list() {
        return cdR.findAll();
    }

    @Override
    public void insert(TipoCampania tipoCampania) {
        cdR.save(tipoCampania);
    }

    @Override
    public void update(TipoCampania tipoCampania) {
        cdR.save(tipoCampania);
    }

    @Override
    public void delete(int idTipoCampania) {
        cdR.deleteById(idTipoCampania);
    }

}
