package com.generation.backendproject.service;

import com.generation.backendproject.dto.UsuarioRegistroDTO;
import com.generation.backendproject.model.Usuario;
// import jakarta.transaction.Transactional;
// import lombok.AllArgsConstructor;
// import org.springframework.stereotype.Service;


public interface UsuarioService {
    Usuario obtenerUsuarioPorCorreo(String email);

    public UsuarioRegistroDTO guardarUsuario(UsuarioRegistroDTO registroDTO);
}
