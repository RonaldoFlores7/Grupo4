package grupo_4.help.serviceimplements;

import grupo_4.help.entities.Campania;
import grupo_4.help.repositories.ICampaniaRepository;
import grupo_4.help.serviceinterfaces.ICampaniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampaniaServiceImplement implements ICampaniaService {
    @Autowired
    private ICampaniaRepository cR;

    @Override
    public List<Campania> list() {
        return cR.findAll();
    }

    @Override
    public void insert(Campania campania) {
        cR.save(campania);
    }

    @Override
    public void update(Campania campania) {
        cR.save(campania);
    }

    @Override
    public void delete(int idCampania) {
        cR.deleteById(idCampania);
    }
}
