package com.generation.backendproject.Controller;

import com.generation.backendproject.model.Usuario;
import com.generation.backendproject.service.UsuarioService;
import com.generation.backendproject.service.UsuarioServiceImpl;

import lombok.AllArgsConstructor;

import com.generation.backendproject.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
@AllArgsConstructor
public class UsuarioController {

    // @Autowired
    private final UsuarioServiceImpl usuarioService;

    @GetMapping("/saludo")
    public ResponseEntity<String> saludar() {
        String mensaje = "¡Hola, mundo!";
        return new ResponseEntity<>(mensaje, HttpStatus.OK);
    }


    @GetMapping("/usuario")
    public ResponseEntity<Usuario> obtener(@RequestParam String email) {
        return new ResponseEntity<>(usuarioService.obtenerUsuarioPorCorreo(email), HttpStatus.OK);
    }





}
