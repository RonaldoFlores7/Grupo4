package grupo_4.help.controllers;

import grupo_4.help.dtos.TipoDonacionDTO;
import grupo_4.help.entities.TipoDonacion;
import grupo_4.help.serviceinterfaces.ITipoDonacionService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipoDonacion")
public class TipoDonacionController {
    @Autowired
    private ITipoDonacionService taS;
    @GetMapping
    public List<TipoDonacionDTO> listar(){
        return taS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, TipoDonacionDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar (@RequestBody TipoDonacionDTO dto){
        ModelMapper m = new ModelMapper();
        TipoDonacion ta = m.map(dto, TipoDonacion.class);
        taS.insert(ta);
    }
    @PutMapping
    public void modificar (@RequestBody TipoDonacionDTO dto){
        ModelMapper m = new ModelMapper();
        TipoDonacion ta = m.map(dto, TipoDonacion.class);
        taS.update(ta);
    }
    @DeleteMapping("/{idTipoDonacion}")
    public void eliminar(@PathVariable ("idTipoDonacion") Integer idTipoDonacion){taS.delete(idTipoDonacion);}

}