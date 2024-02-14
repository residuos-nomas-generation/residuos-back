package com.generation.backendproject.repository;

import com.generation.backendproject.model.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, Long> {
    Publicacion findByIdPublicacion(Long id);
}
