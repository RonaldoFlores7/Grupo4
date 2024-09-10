package grupo_4.help.controllers;

import grupo_4.help.dtos.DonacionDTO;
import grupo_4.help.dtos.QuantityDonationsPerDayDTO;
import grupo_4.help.entities.Donacion;
import grupo_4.help.serviceinterfaces.IDonacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/donaciones")
public class DonacionController {
    @Autowired
    private IDonacionService donS;
    public DonacionController() {}
    @GetMapping
    public List<DonacionDTO> listar(){
        return donS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, DonacionDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar (@RequestBody DonacionDTO dto){
        ModelMapper m = new ModelMapper();
        Donacion d = m.map(dto, Donacion.class);
        donS.insert(d);
    }
    @PutMapping
    public void modificar (@RequestBody DonacionDTO dto){
        ModelMapper m = new ModelMapper();
        Donacion d = m.map(dto, Donacion.class);
        donS.update(d);
    }
    @GetMapping("/buscarPorFecha")
    public List<DonacionDTO> buscarPorFecha(@RequestParam LocalDate fechaSolicitada){
        return donS.findbyDate(fechaSolicitada).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,DonacionDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/cantidadPorFecha")
    public List<QuantityDonationsPerDayDTO> cantidadPorFecha(){
        List<String[]> lista = donS.cantidadDonacionesPorFecha();
        List<QuantityDonationsPerDayDTO> listaDTO = new ArrayList<>();
        for (String[] columna:lista){
            QuantityDonationsPerDayDTO dto = new QuantityDonationsPerDayDTO();
            dto.setIdDonacion(Integer.parseInt(columna[0]));
            dto.setCantidadDonacionesPorFecha(Integer.parseInt(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
