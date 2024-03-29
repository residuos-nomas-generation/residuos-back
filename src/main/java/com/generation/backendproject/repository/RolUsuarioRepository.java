package com.generation.backendproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.backendproject.model.RolUsuario;
import org.springframework.stereotype.Repository;

@Repository
public interface RolUsuarioRepository extends JpaRepository<RolUsuario, Long> {
    RolUsuario findByDescripcionRol(String rolUsuario);

    boolean existsByDescripcionRol(String usuario);

}


// ********************************************************************** */
// Codigo antiguo

// import com.generation.backendproject.model.RolUsuario;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

// @Repository
// public interface RolUsuarioRepository extends JpaRepository<RolUsuario, Long>
// {

// RolUsuario findByDescripcionRol(String rolUsuario);

// boolean existsByDescripcionRol(String usuario);
// }
