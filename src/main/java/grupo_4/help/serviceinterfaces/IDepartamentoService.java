package grupo_4.help.serviceinterfaces;

import grupo_4.help.entities.Departamento;

import java.util.List;

public interface IDepartamentoService {
    public List<Departamento> list();
    public void insert(Departamento departamento);
    public void update(Departamento departamento);
    public void delete(int idDepartamento);
}
