package grupo_4.help.controllers;

import grupo_4.help.dtos.QuantityCampaniaByDistrito;
import grupo_4.help.dtos.QuantityPedirAyudaByDistrito;
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
    public List<QuantityPedirAyudaByDistrito> cantidadcontroller() {
        List<String[]> lista = dS.cantidadService();
        List<QuantityPedirAyudaByDistrito> listarDTO = new ArrayList<>();
        for (String[] columna : lista) {
            QuantityPedirAyudaByDistrito dto = new QuantityPedirAyudaByDistrito();
            dto.setNombreDistrito(columna[0]);
            dto.setIdPedirAyuda(Integer.parseInt(columna[1]));
            listarDTO.add(dto);
        }
        return listarDTO;
    }

    @GetMapping("/cantidacampanias")
    public List<QuantityCampaniaByDistrito> cantidadCcontroller() {
        List<String[]> lista = dS.cantidadService();
        List<QuantityCampaniaByDistrito> listarDTO = new ArrayList<>();
        for (String[] columna : lista) {
            QuantityCampaniaByDistrito dto = new QuantityCampaniaByDistrito();
            dto.setNombreDistrito(columna[0]);
            dto.setIdCampania(Integer.parseInt(columna[1]));
            listarDTO.add(dto);
        }
        return listarDTO;
    }



}
