package grupo_4.help.controllers;

import grupo_4.help.dtos.CampaniaDTO;
import grupo_4.help.dtos.QuantityVolunteerByCampaniaDTO;
import grupo_4.help.dtos.SumDonationsByCampaniaDTO;
import grupo_4.help.entities.Campania;
import grupo_4.help.serviceinterfaces.ICampaniaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/campania")
public class CampaniaController {
    @Autowired
    private ICampaniaService caS;

    @GetMapping("/listarCampanias")
    public List<CampaniaDTO> listar(){
        return caS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CampaniaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody CampaniaDTO dto){
        ModelMapper m=new ModelMapper();
        Campania campania=m.map(dto, Campania.class);
        caS.insert(campania);
    }

    @PutMapping
    public void modificar(@RequestBody CampaniaDTO dto) {
        ModelMapper m=new ModelMapper();
        Campania campania=m.map(dto, Campania.class);
        caS.update(campania);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        caS.delete(id);
    }

    @GetMapping("/montototaldonacionesxcampania")
    public List<SumDonationsByCampaniaDTO>montototalController() {
        List<String[]> lista = caS.MontoTotalDonacionesporCampania();
        List<SumDonationsByCampaniaDTO> listaDTO = new ArrayList<>();
        for (String[] columna : lista) {
            SumDonationsByCampaniaDTO dto = new SumDonationsByCampaniaDTO();
            dto.setDescripcionCampania(columna[0]);
            dto.setMontoTransferido(Double.parseDouble(columna[1]));
            listaDTO.add(dto);

        }
        return listaDTO;
    }

    @GetMapping("/cantidadtotalvoluntariosxcampania")
    public List<QuantityVolunteerByCampaniaDTO>cantidadtotalvController(){
        List<String[]> lista=caS.CantidadTotalVoluntariosporCampania();
        List<QuantityVolunteerByCampaniaDTO> listaDTO=new ArrayList<>();
        for(String[] columna:lista){
            QuantityVolunteerByCampaniaDTO dto=new QuantityVolunteerByCampaniaDTO();
            dto.setDescripcionCampania(columna [0]);
            dto.setQuantityVolunteer(Integer.parseInt(columna [1]));
            listaDTO.add(dto);

        }
        return listaDTO;
    }


}
