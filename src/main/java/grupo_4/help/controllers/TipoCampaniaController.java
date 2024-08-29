package grupo_4.help.controllers;

import grupo_4.help.dtos.TipoCampaniaDTO;
import grupo_4.help.entities.TipoCampania;
import grupo_4.help.serviceinterfaces.ITipoCampaniaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/TipoDeCampañas")
public class TipoCampaniaController {
    @Autowired
    private ITipoCampaniaService cdS;

    @GetMapping
    public List<TipoCampaniaDTO> listar() {
        return cdS.list().stream().map( x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, TipoCampaniaDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody TipoCampaniaDTO cdDTO) {
        ModelMapper m=new ModelMapper();
        TipoCampania cd=m.map(cdDTO, TipoCampania.class);
        cdS.insert(cd);
    }
    @PutMapping
    public void modificar(@RequestBody TipoCampaniaDTO cdDTO) {
        ModelMapper m=new ModelMapper();
        TipoCampania cd=m.map(cdDTO, TipoCampania.class);
        cdS.update(cd);
    }
    @DeleteMapping("/{idTipoCampania}")
    public void eliminar(@PathVariable("idTipoCampania") Integer idTipoCampania) {
        cdS.delete(idTipoCampania);
    }
}
