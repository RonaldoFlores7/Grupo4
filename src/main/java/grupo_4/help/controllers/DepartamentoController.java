package grupo_4.help.controllers;

import grupo_4.help.dtos.DepartamentoDTO;
import grupo_4.help.entities.Departamento;
import grupo_4.help.serviceinterfaces.IDepartamentoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/departamentos")
public class DepartamentoController {
    @Autowired
    private IDepartamentoService deS;

    @GetMapping("/listardepartamentos")
    public List<DepartamentoDTO> listar(){
        return deS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DepartamentoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody DepartamentoDTO dto){
        ModelMapper m=new ModelMapper();
        Departamento de=m.map(dto, Departamento.class);
        deS.insert(de);
    }

    @PutMapping
    public void modificar(@RequestBody DepartamentoDTO dto) {
        ModelMapper m=new ModelMapper();
        Departamento de=m.map(dto, Departamento.class);
        deS.update(de);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        deS.delete(id);
    }
}
