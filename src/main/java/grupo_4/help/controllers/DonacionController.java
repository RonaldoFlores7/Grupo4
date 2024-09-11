package grupo_4.help.controllers;

import grupo_4.help.dtos.*;
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

    @GetMapping("/donacionesPorMes")
    public List<DonationsByMonthDTO> DonacionesMonetariasPorMes() {
        List<String[]> lista=donS.DonacionesMonetariasPorMes().reversed();
        List<DonationsByMonthDTO> listaDTO=new ArrayList<>();
        for (String[] columna:lista) {
            DonationsByMonthDTO dto=new DonationsByMonthDTO();
            dto.setMes((columna[0]).toString());
            dto.setTotalDonaciones(Double.parseDouble(columna[1].toString()));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

    @GetMapping("/donacionesPorUsuario")
    public List<DonationsByUserDTO> DonacionesMonetariasPorUsuario() {
        List<String[]> lista=donS.DonacionesMonetariasPorUsuario().reversed();
        List<DonationsByUserDTO> listaDTO=new ArrayList<>();
        for (String[] columna:lista) {
            DonationsByUserDTO dto=new DonationsByUserDTO();
            dto.setNombreCompleto((columna[0]).toString());
            dto.setTotalDonaciones(Double.parseDouble(columna[1].toString()));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
    @GetMapping("/cantidadPorFecha")
    public List<QuantityDonationsPerDateDTO> cantidadPorFecha(){
        List<String[]> lista = donS.cantidadDonacionesPorFecha();
        List<QuantityDonationsPerDateDTO> listaDTO = new ArrayList<>();
        for (String[] columna:lista){
            QuantityDonationsPerDateDTO dto = new QuantityDonationsPerDateDTO();
            dto.setFecha(LocalDate.parse(columna[0]));
            dto.setCantidadDonacionesPorFecha(Integer.parseInt(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

}
