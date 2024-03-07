package com.generation.backendproject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.backendproject.model.Usuario;

import org.springframework.stereotype.Repository;

 @Repository
 public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
 Usuario findByEmail(String correo);

 Usuario findByIdUsuario(Long id);
 //Usuario obtenerUsuarioPorId(Long id);
     Optional<Usuario> findById(Long idUsuario);
 }
