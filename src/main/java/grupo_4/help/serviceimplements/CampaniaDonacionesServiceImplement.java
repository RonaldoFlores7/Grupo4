package grupo_4.help.serviceimplements;

import grupo_4.help.entities.CampaniaDonaciones;
import grupo_4.help.repositories.ICamapaniaDonacionesRepository;
import grupo_4.help.serviceinterfaces.ICampaniaDonacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampaniaDonacionesServiceImplement implements ICampaniaDonacionesService {
    @Autowired
    private ICamapaniaDonacionesRepository cdR;

    @Override
    public List<CampaniaDonaciones> list() {
        return cdR.findAll();
    }

    @Override
    public void insert(CampaniaDonaciones campaniaD) {
        cdR.save(campaniaD);
    }

    @Override
    public void update(CampaniaDonaciones campaniaD) {
        cdR.save(campaniaD);
    }

    @Override
    public void delete(int idCampaniaD) {
        cdR.deleteById(idCampaniaD);
    }
}
