package grupo_4.help.controllers;

import grupo_4.help.dtos.CantidadCampaniaByDistrito;
import grupo_4.help.dtos.CantidadPedirAyudaByDistrito;
import grupo_4.help.dtos.DistritoDTO;
import grupo_4.help.entities.Distrito;
import grupo_4.help.serviceinterfaces.IDistritoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/distritos")
public class DistritoController {
    @Autowired
    private IDistritoService dS;

    @GetMapping("/listardistritos")
    public List<DistritoDTO> listar(){
        return dS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, DistritoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody DistritoDTO dto){
        ModelMapper m=new ModelMapper();
        Distrito d=m.map(dto, Distrito.class);
        dS.insert(d);
    }

    @PutMapping
    public void modificar(@RequestBody DistritoDTO dto) {
        ModelMapper m=new ModelMapper();
        Distrito d=m.map(dto, Distrito.class);
        dS.update(d);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        dS.delete(id);
    }

    @GetMapping("/cantidadayuda")
    public List<CantidadPedirAyudaByDistrito> cantidadcontroller() {
        List<String[]> lista = dS.cantidadService();
        List<CantidadPedirAyudaByDistrito> listarDTO = new ArrayList<>();
        for (String[] columna : lista) {
            CantidadPedirAyudaByDistrito dto = new CantidadPedirAyudaByDistrito();
            dto.setNombreDistrito(columna[0]);
            dto.setIdPedirAyuda(Integer.parseInt(columna[1]));
            listarDTO.add(dto);
        }
        return listarDTO;
    }

    @GetMapping("/cantidacampanias")
    public List<CantidadCampaniaByDistrito> cantidadCcontroller() {
        List<String[]> lista = dS.cantidadService();
        List<CantidadCampaniaByDistrito> listarDTO = new ArrayList<>();
        for (String[] columna : lista) {
            CantidadCampaniaByDistrito dto = new CantidadCampaniaByDistrito();
            dto.setNombreDistrito(columna[0]);
            dto.setIdCampania(Integer.parseInt(columna[1]));
            listarDTO.add(dto);
        }
        return listarDTO;
    }



}
