package com.generation.backendproject.service;

import java.util.List;

import com.generation.backendproject.dto.CrearPublicacionDTO;
import com.generation.backendproject.dto.PublicacionDTO;
import com.generation.backendproject.model.Publicacion;

public interface PublicacionService {
    List<PublicacionDTO> getAllPublicaciones();
    List<PublicacionDTO> getPublicacionesByUsuario(Long idUsuario);
    List<Publicacion> findByUsuarioIdUsuario(Long idUsuario);
    PublicacionDTO getPublicacionByUsuarioAndId(Long idUsuario, Long idPublicacion);
    // Publicacion findByUsuarioIdUsuarioAndIdPublicacion(Long idUsuario, Long idPublicacion);
    // PublicacionDTO addPublicacion(Long idUsuario, PublicacionDTO publicacionDTO);


    //Crear publicación
    PublicacionDTO savePublicacion(CrearPublicacionDTO crearPublicacionDTO);
    PublicacionDTO convertEntityToDto(Publicacion publicacion);
}


// ********************************************************************** */
// Codigo antiguo


// import com.generation.backendproject.model.Publicacion;

// import java.util.List;

// public interface PublicacionService {
//     Publicacion obtenerPublicacionPorId(Long id);
//     List<Publicacion> listarPublicaciones();

//     //public Publicacion savePublicacion(Publicacion publicacion);

//     //public PublicacionCreacionDTO guardarPublicacion(PublicacionCreacionDTO publicacionDTO);
// }

