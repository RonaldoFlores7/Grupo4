package grupo_4.help.serviceimplements;

import grupo_4.help.entities.Donacion;
import grupo_4.help.repositories.IDonacionRepository;
import grupo_4.help.serviceinterfaces.IDonacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DonationServiceImplement implements IDonacionService {
    @Autowired
    private IDonacionRepository donR;
    @Override
    public List<Donacion> list() {
        return donR.findAll();
    }

    @Override
    public void insert(Donacion donacion) {
        donR.save(donacion);
    }

    @Override
    public void update(Donacion donacion) {
        donR.save(donacion);
    }

    @Override
    public List<Donacion> findbyDate(LocalDate fechaSolicitada) {
        return donR.buscarPorFecha(fechaSolicitada);
    }

    @Override
    public List<String[]> cantidadDonacionesPorFecha() {
        return donR.cantidadDonacionesPorFecha();
    }

}
