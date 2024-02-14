package com.generation.backendproject.repository;

import com.generation.backendproject.model.VigenciaPublicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VigenciaPublicacionRepository extends JpaRepository<VigenciaPublicacion,Long>{
}
