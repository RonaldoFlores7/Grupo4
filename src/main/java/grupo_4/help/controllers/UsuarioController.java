package grupo_4.help.controllers;

import grupo_4.help.dtos.UsuarioDTO;
import grupo_4.help.entities.Usuario;
import grupo_4.help.serviceinterfaces.IUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService uS;

    @GetMapping
    public List<UsuarioDTO> listar() {
        return uS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody UsuarioDTO dto) {
        ModelMapper m=new ModelMapper();
        Usuario u=m.map(dto, Usuario.class);
        uS.insert(u);
    }

    @PutMapping
    public void modificar(@RequestBody UsuarioDTO dto) {
        ModelMapper m=new ModelMapper();
        Usuario u=m.map(dto, Usuario.class);
        uS.update(u);
    }

    @DeleteMapping("/{idUsuario}")
    public void eliminar(@PathVariable("idUsuario") Integer idUsuario) {
        uS.delete(idUsuario);
    }

}
