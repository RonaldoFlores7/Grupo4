package grupo_4.help.controllers;

import grupo_4.help.dtos.CampaniaDTO;
import grupo_4.help.dtos.DepartamentoDTO;
import grupo_4.help.entities.Campania;
import grupo_4.help.entities.Departamento;
import grupo_4.help.serviceinterfaces.ICampaniaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

}
