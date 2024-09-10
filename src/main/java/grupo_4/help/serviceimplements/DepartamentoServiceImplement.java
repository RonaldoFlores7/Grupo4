package grupo_4.help.serviceimplements;

import grupo_4.help.entities.Departamento;
import grupo_4.help.repositories.IDepartamentoRepository;
import grupo_4.help.serviceinterfaces.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoServiceImplement implements IDepartamentoService {

    @Autowired
    private IDepartamentoRepository deR;
    @Override
    public List<Departamento> list() {
        return deR.findAll();
    }

    @Override
    public void insert(Departamento departamento) {
        deR.save(departamento);
    }

    @Override
    public void update(Departamento departamento) {
        deR.save(departamento);
    }

    @Override
    public void delete(int idDepartamento) {
        deR.deleteById(idDepartamento);
    }
}
