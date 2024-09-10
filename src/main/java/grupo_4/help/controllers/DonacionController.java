package grupo_4.help.controllers;

import grupo_4.help.dtos.DonacionDTO;
import grupo_4.help.entities.Donacion;
import grupo_4.help.serviceinterfaces.IDonacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

}
