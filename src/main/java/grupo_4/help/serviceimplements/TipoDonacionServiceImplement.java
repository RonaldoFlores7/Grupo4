package grupo_4.help.serviceimplements;

import grupo_4.help.entities.Donacion;
import grupo_4.help.entities.TipoDonacion;
import grupo_4.help.repositories.ITipoDonacionRepository;
import grupo_4.help.serviceinterfaces.ITipoDonacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class TipoDonacionServiceImplement implements ITipoDonacionService {
    @Autowired
    private ITipoDonacionRepository taR;

    @Override
    public List<TipoDonacion> list() {
        return taR.findAll();
    }

    @Override
    public void insert(TipoDonacion tipoDonacion) {
        taR.save(tipoDonacion);
    }

    @Override
    public void update(TipoDonacion tipoDonacion) {
        taR.save(tipoDonacion);
    }

    @Override
    public void delete(int idTipoDonacion) {
        taR.deleteById(idTipoDonacion);
    }

}