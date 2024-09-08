package grupo_4.help.controllers;

import grupo_4.help.dtos.PedirAyudaDTO;
import grupo_4.help.dtos.PendingSendHelpDTO;
import grupo_4.help.dtos.UserByUserTypeDTO;
import grupo_4.help.entities.PedirAyuda;
import grupo_4.help.serviceinterfaces.IPedirAyudaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pedirAyuda")
public class PedirAyudaController {
    @Autowired
    private IPedirAyudaService paS;

    @GetMapping
    public List<PedirAyudaDTO> listar(){
        return paS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,PedirAyudaDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void registrar(@RequestBody PedirAyudaDTO dto){
        ModelMapper m = new ModelMapper();
        PedirAyuda pa = m.map(dto, PedirAyuda.class);
        paS.insert(pa);
    }

    @PutMapping
    public void modificar(@RequestBody PedirAyudaDTO dto){
        ModelMapper m = new ModelMapper();
        PedirAyuda pa = m.map(dto, PedirAyuda.class);
        paS.update(pa);
    }

    @DeleteMapping("/{idPedirAyuda}")
    public void eliminar(@PathVariable("idPedirAyuda") Integer idPedirAyuda){
        paS.delete(idPedirAyuda);
    }

    @GetMapping("/pendientes")
    public List<PendingSendHelpDTO> listarAyudasPendientes() {
        List<String[]> lista=paS.pedirAyudaPendientes();
        List<PendingSendHelpDTO> listaDTO=new ArrayList<>();
        for (String[] columna:lista) {
            PendingSendHelpDTO dto=new PendingSendHelpDTO();
            dto.setIdPedirAyuda(Integer.parseInt(columna[0]));
            dto.setDescripcion(columna[1]);
            dto.setFechaPedidoAyuda(LocalDate.parse(columna[2]));
            dto.setNombreDepartamento(columna[3]);
            dto.setNombreDistrito(columna[4]);
            listaDTO.add(dto);
        }

        return listaDTO;
    }
}