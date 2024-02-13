package com.generation.backendproject.service;

import com.generation.backendproject.model.Usuario;
import com.generation.backendproject.repository.RolUsuarioRepository;
import com.generation.backendproject.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@AllArgsConstructor
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario obtenerUsuarioPorCorreo(String email) {
        return usuarioRepository.findByEmail(email);
    }
}
