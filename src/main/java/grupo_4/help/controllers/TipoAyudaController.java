package grupo_4.help.controllers;

import grupo_4.help.dtos.TipoAyudaDTO;
import grupo_4.help.entities.TipoAyuda;
import grupo_4.help.serviceinterfaces.ITipoAyudaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipoAyuda")
public class TipoAyudaController {
    @Autowired
    private ITipoAyudaService taS;
    @GetMapping
    public List<TipoAyudaDTO> listar(){
        return taS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, TipoAyudaDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar (@RequestBody TipoAyudaDTO dto){
        ModelMapper m = new ModelMapper();
        TipoAyuda ta = m.map(dto, TipoAyuda.class);
        taS.insert(ta);
    }
    @PutMapping
    public void modificar (@RequestBody TipoAyudaDTO dto){
        ModelMapper m = new ModelMapper();
        TipoAyuda ta = m.map(dto, TipoAyuda.class);
        taS.update(ta);
    }
    @DeleteMapping("/{idTipoAyuda}")
    public void eliminar(@PathVariable ("idTipoAyuda") Integer idTipoAyuda){taS.delete(idTipoAyuda);}

}