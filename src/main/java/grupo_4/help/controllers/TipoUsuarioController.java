package grupo_4.help.controllers;

import grupo_4.help.dtos.TipoUsuarioDTO;
<<<<<<< HEAD
=======
import grupo_4.help.dtos.UserByUserTypeDTO;
>>>>>>> 821d33a (Mis 2 consultas)
import grupo_4.help.entities.TipoUsuario;
import grupo_4.help.serviceinterfaces.ITipoUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> 821d33a (Mis 2 consultas)
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipoUsuarios")
public class TipoUsuarioController {
    @Autowired
    private ITipoUsuarioService tuS;

    @GetMapping
    public List<TipoUsuarioDTO> listar() {
        return tuS.list().stream().map( x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TipoUsuarioDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void registrar(@RequestBody TipoUsuarioDTO tudto) {
        ModelMapper m=new ModelMapper();
        TipoUsuario tu=m.map(tudto,TipoUsuario.class);
        tuS.insert(tu);
    }
    @PutMapping
    public void modificar(@RequestBody TipoUsuarioDTO tudto) {
        ModelMapper m=new ModelMapper();
        TipoUsuario tu=m.map(tudto,TipoUsuario.class);
        tuS.update(tu);
    }
    @DeleteMapping("/{idTipoUsuario}")
    public void eliminar(@PathVariable("idTipoUsuario") Integer idTipoUsuario) {
        tuS.delete(idTipoUsuario);
    }
<<<<<<< HEAD
=======
    @GetMapping("/cantidades")
    public List<UserByUserTypeDTO> cantidadXTipo() {
        List<String[]> lista=tuS.cantidadUsuariosTipoUsuario();
        List<UserByUserTypeDTO> listaDTO=new ArrayList<>();
        for (String[] columna:lista) {
            UserByUserTypeDTO dto=new UserByUserTypeDTO();
            dto.setTipoUsuario(columna[0]);
            dto.setCantidadUsuarios(Integer.parseInt(columna[1]));
            listaDTO.add(dto);
        }

        return listaDTO;
    }
>>>>>>> 821d33a (Mis 2 consultas)
}
