package com.generation.backendproject.Controller;


import java.util.List;

// import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.backendproject.dto.PublicacionDTO;
import com.generation.backendproject.service.PublicacionService;


@RestController
@RequestMapping("/api/v1")
public class PublicacionController {
    @Autowired
    private PublicacionService publicacionService;

    @GetMapping("/publicaciones")
    public ResponseEntity<List<PublicacionDTO>> getAllPublicaciones() {
        List<PublicacionDTO> publicacionDTOs = publicacionService.getAllPublicaciones();
        return new ResponseEntity<>(publicacionDTOs, HttpStatus.OK);
    }

    @GetMapping("/usuario/{idUsuario}")
    public ResponseEntity<List<PublicacionDTO>> getPublicacionesByUsuario(@PathVariable Long idUsuario) {
        List<PublicacionDTO> publicacionDTOs = publicacionService.getPublicacionesByUsuario(idUsuario);
        return new ResponseEntity<>(publicacionDTOs, HttpStatus.OK);
    }

    @GetMapping("/usuario/{idUsuario}/{idPublicacion}")
    public ResponseEntity<PublicacionDTO> getPublicacionByUsuarioAndId(@PathVariable Long idUsuario,
            @PathVariable Long idPublicacion) {
        PublicacionDTO publicacionDTO = publicacionService.getPublicacionByUsuarioAndId(idUsuario, idPublicacion);
        return new ResponseEntity<>(publicacionDTO, HttpStatus.OK);
    }
}



// import com.generation.backendproject.model.Publicacion;
// import com.generation.backendproject.service.PublicacionServiceImpl;
// import com.generation.backendproject.service.UsuarioService;
// import lombok.AllArgsConstructor;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.*;


// import java.util.List;
// //deshabilitamos cors
// @CrossOrigin("*")

// @RestController
// @AllArgsConstructor

// public class PublicacionController {

//     //@Autowired
//     //private UsuarioService usuaService;
//     private final PublicacionServiceImpl publicacionService;

    

//     @GetMapping("/publicacion/lista")
//     public ResponseEntity<List<Publicacion>> listarPublicaciones() {
//         List<Publicacion> listaDePublicaciones = publicacionService.listarPublicaciones();
//         return new ResponseEntity<>(listaDePublicaciones, HttpStatus.OK);
//     }

//     @GetMapping("/publicacion/{idPublicacion}")
//     public ResponseEntity<Publicacion> obtenerPublicacionPorId(@PathVariable Long idPublicacion) {
//         Publicacion publicacionDetalle = publicacionService.obtenerPublicacionPorId(idPublicacion);
//         if (publicacionDetalle != null) {
//             return new ResponseEntity<>(publicacionDetalle, HttpStatus.OK);
//         } else {
//             return ResponseEntity.notFound().build();
//         }
//     }




