package com.generation.backendproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.backendproject.model.Publicacion;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, Long> {
    List<Publicacion> findByUsuarioIdUsuario(Long idUsuario);

    Publicacion findByUsuarioIdUsuarioAndIdPublicacion(Long idUsuario, Long idPublicacion);

}

// ********************************************************************** */
// Codigo antiguo


// import com.generation.backendproject.model.Publicacion;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

// @Repository
// public interface PublicacionRepository extends JpaRepository<Publicacion,
// Long> {
// Publicacion findByIdPublicacion(Long id);
// }
