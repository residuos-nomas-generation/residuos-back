package com.generation.backendproject.Controller;

import com.generation.backendproject.model.Publicacion;
import com.generation.backendproject.service.PublicacionServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
@AllArgsConstructor

public class PublicacionController {

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
