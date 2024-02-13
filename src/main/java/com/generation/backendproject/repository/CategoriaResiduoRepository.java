package com.generation.backendproject.repository;

import com.generation.backendproject.model.CategoriaResiduo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaResiduoRepository extends JpaRepository<CategoriaResiduo, Long> {
}
