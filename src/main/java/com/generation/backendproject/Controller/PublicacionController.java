package com.generation.backendproject.Controller;

import com.generation.backendproject.model.Publicacion;
import com.generation.backendproject.service.PublicacionServiceImpl;
import com.generation.backendproject.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
//deshabilitamos cors
@CrossOrigin("*")

@RestController
@AllArgsConstructor

public class PublicacionController {

    //@Autowired
    //private UsuarioService usuaService;
    private final PublicacionServiceImpl publicacionService;

    

    @GetMapping("/publicacion/lista")
    public ResponseEntity<List<Publicacion>> listarPublicaciones() {
        List<Publicacion> listaDePublicaciones = publicacionService.listarPublicaciones();
        return new ResponseEntity<>(listaDePublicaciones, HttpStatus.OK);
    }

    @GetMapping("/publicacion/{idPublicacion}")
    public ResponseEntity<Publicacion> obtenerPublicacionPorId(@PathVariable Long idPublicacion) {
        Publicacion publicacionDetalle = publicacionService.obtenerPublicacionPorId(idPublicacion);
        if (publicacionDetalle != null) {
            return new ResponseEntity<>(publicacionDetalle, HttpStatus.OK);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
