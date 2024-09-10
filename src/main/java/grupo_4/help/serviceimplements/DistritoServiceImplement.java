package grupo_4.help.serviceimplements;

import grupo_4.help.entities.Distrito;
import grupo_4.help.repositories.IDistritoRepository;
import grupo_4.help.serviceinterfaces.IDistritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistritoServiceImplement implements IDistritoService {
   @Autowired
   private IDistritoRepository dR;

    @Override
    public List<Distrito> list() {
        return dR.findAll();
    }

    @Override
    public void insert(Distrito distrito) {
        dR.save(distrito);
    }

    @Override
    public void update(Distrito distrito) {
        dR.save(distrito);
    }

    @Override
    public void delete(int idDistrito) {
        dR.deleteById(idDistrito);
    }

    @Override
    public List<String[]> cantidadService() {
        return dR.cantidad();
    }

    @Override
    public List<String[]> cantidadCService() {
        return dR.cantidadC();
    }


}
