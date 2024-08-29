package grupo_4.help.controllers;

import grupo_4.help.dtos.CampaniaDonacionesDTO;
import grupo_4.help.entities.CampaniaDonaciones;
import grupo_4.help.serviceinterfaces.ICampaniaDonacionesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/CampaniaDonaciones")
public class CampaniaDonacionesController {
    @Autowired
    private ICampaniaDonacionesService cdS;

    @GetMapping
    public List<CampaniaDonacionesDTO> listar() {
        return cdS.list().stream().map( x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CampaniaDonacionesDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody CampaniaDonacionesDTO cdDTO) {
        ModelMapper m=new ModelMapper();
        CampaniaDonaciones cd=m.map(cdDTO,CampaniaDonaciones.class);
        cdS.insert(cd);
    }
    @PutMapping
    public void modificar(@RequestBody CampaniaDonacionesDTO cdDTO) {
        ModelMapper m=new ModelMapper();
        CampaniaDonaciones cd=m.map(cdDTO,CampaniaDonaciones.class);
        cdS.update(cd);
    }
    @DeleteMapping("/{idCampaniaD}")
    public void eliminar(@PathVariable("idCampaniaD") Integer idCampaniaD) {
        cdS.delete(idCampaniaD);
    }
}
