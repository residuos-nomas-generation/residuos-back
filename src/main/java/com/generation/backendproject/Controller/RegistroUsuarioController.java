package com.generation.backendproject.Controller;

import com.generation.backendproject.dto.UsuarioRegistroDTO;
// import com.generation.backendproject.service.UsuarioService;
import com.generation.backendproject.service.UsuarioServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/registro")
public class RegistroUsuarioController {

    // @Autowired
    private final UsuarioServiceImpl usuarioService;

    @GetMapping("/saludo")
    public ResponseEntity<String> saludar() {
        String mensaje = "¡Hola, mundo!";
        return new ResponseEntity<>(mensaje, HttpStatus.OK);
    }

    @PostMapping("/nuevo")
    public ResponseEntity<UsuarioRegistroDTO> guardarNuevoUsuarioDTO(
            @RequestBody UsuarioRegistroDTO usuarioParaGuardar) {
        System.out.println("Se ha accedido a la ruta /registro/nuevo");
        UsuarioRegistroDTO usuarioNuevo = usuarioService.guardarUsuario(usuarioParaGuardar);
        return new ResponseEntity<>(usuarioNuevo, HttpStatus.CREATED);
    }

}
