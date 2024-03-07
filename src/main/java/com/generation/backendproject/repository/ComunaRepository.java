package com.generation.backendproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.backendproject.model.Comuna;

public interface ComunaRepository extends JpaRepository<Comuna, Long> {

}

// ********************************************************************** */
// Codigo antiguo


// import com.generation.backendproject.model.Comuna;
// import org.springframework.data.jpa.repository.JpaRepository;

// import org.springframework.stereotype.Repository;

// @Repository
// public interface ComunaRepository extends JpaRepository<Comuna, Long> {

// }
