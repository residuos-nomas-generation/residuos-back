package com.generation.backendproject.service;

public class UsuarioServiceImpl {
    
}

// ********************************************************************** */
// Codigo antiguo


// import com.generation.backendproject.dto.UsuarioRegistroDTO;
// import com.generation.backendproject.model.RolUsuario;
// import com.generation.backendproject.model.Usuario;
// //import com.generation.backendproject.repository.RolUsuarioRepository;
// import com.generation.backendproject.repository.RolUsuarioRepository;
// import com.generation.backendproject.repository.UsuarioRepository;
// import jakarta.transaction.Transactional;
// import lombok.AllArgsConstructor;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.Arrays;

// @Transactional
// @AllArgsConstructor
// @Service
// public class UsuarioServiceImpl implements UsuarioService {

//     @Autowired
//     private UsuarioRepository usuarioRepository;
//     @Autowired
//     private RolUsuarioRepository rolUsuarioRepository;

//    // @Override
//     //public Usuario obtenerUsuarioPorId(Long id) {
//     //    return usuarioRepository.findById(id).orElse(null);
//     //}

//     @Override
//     public Usuario obtenerUsuarioPorCorreo(String email) {
//         return usuarioRepository.findByEmail(email);
//     }

//     @Override
//     public UsuarioRegistroDTO guardarUsuario(UsuarioRegistroDTO registroDTO) {
//         // Obtener el rol por defecto (asumiendo que ya está guardado en la base de datos)
//         RolUsuario rolUsuario = rolUsuarioRepository.findByDescripcionRol("usuario");

//         // Crear un nuevo usuario con el rol predeterminado
//         Usuario usuario = new Usuario(
//                 registroDTO.getNombre(),
//                 registroDTO.getApellido(),
//                 registroDTO.getEmail(),
//                 registroDTO.getContrasenha(),
//                 rolUsuario
//         );
//         // Guardar el usuario en la base de datos
//         usuarioRepository.save(usuario);
//         // Devolver el DTO original
//         return registroDTO;
//     }


// }
