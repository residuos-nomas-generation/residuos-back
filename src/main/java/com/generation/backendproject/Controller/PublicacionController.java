package com.generation.backendproject.Controller;

import com.generation.backendproject.model.Publicacion;
import com.generation.backendproject.service.PublicacionServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping
@RestController
@AllArgsConstructor
public class PublicacionController {

    private  final PublicacionServiceImpl publicacionService;

    @GetMapping("/publicacion")
    public ResponseEntity<Publicacion> obtenerPublicacionPorId(@RequestParam Long id){
        return new ResponseEntity<>(publicacionService.obtenerPublicacionPorId(id), HttpStatus.OK);
    }

    @GetMapping("/publicacion/lista")
    public ResponseEntity<List<Publicacion>> listarPublicaciones(){
        List<Publicacion> listaDePublicaciones = publicacionService.listarPublicaciones();
        return new ResponseEntity<>(listaDePublicaciones, HttpStatus.OK);
    }

}
