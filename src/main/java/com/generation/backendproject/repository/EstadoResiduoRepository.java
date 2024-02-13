package com.generation.backendproject.repository;

import com.generation.backendproject.model.EstadoResiduo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoResiduoRepository extends JpaRepository<EstadoResiduo, Long> {
}
