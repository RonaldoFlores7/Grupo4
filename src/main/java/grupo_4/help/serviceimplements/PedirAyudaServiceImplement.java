package grupo_4.help.serviceimplements;

import grupo_4.help.entities.PedirAyuda;
import grupo_4.help.repositories.IPedirAyudaRepository;
import grupo_4.help.serviceinterfaces.IPedirAyudaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedirAyudaServiceImplement implements IPedirAyudaService {
    @Autowired
    private IPedirAyudaRepository paR;

    @Override
    public List<PedirAyuda> list() {
        return paR.findAll();
    }

    @Override
    public void insert(PedirAyuda pedirAyuda) {
        paR.save(pedirAyuda);
    }

    @Override
    public void update(PedirAyuda pedirAyuda) {
        paR.save(pedirAyuda);
    }

    @Override
    public void delete(int idPedirAyuda) {
        paR.deleteById(idPedirAyuda);
    }
}
