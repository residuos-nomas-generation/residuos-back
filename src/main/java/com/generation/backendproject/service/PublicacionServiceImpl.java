package com.generation.backendproject.service;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.backendproject.dto.CrearPublicacionDTO;
import com.generation.backendproject.dto.PublicacionDTO;
import com.generation.backendproject.dto.UsuarioPublicacionDTO;
import com.generation.backendproject.model.Publicacion;
import com.generation.backendproject.model.Usuario;
import com.generation.backendproject.repository.PublicacionRepository;
import com.generation.backendproject.repository.UsuarioRepository;

@Service
public class PublicacionServiceImpl implements PublicacionService {
    @Autowired
    private PublicacionRepository publicacionRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<PublicacionDTO> getAllPublicaciones() {
        List<Publicacion> publicaciones = publicacionRepository.findAll();
        List<PublicacionDTO> publicacionDTOs = new ArrayList<>();
        for (Publicacion publicacion : publicaciones) {
            UsuarioPublicacionDTO usuario = new UsuarioPublicacionDTO(
                    publicacion.getUsuario().getIdUsuario(),
                    publicacion.getUsuario().getNombre(),
                    publicacion.getUsuario().getApellido(),
                    publicacion.getUsuario().getEmail(),
                    publicacion.getUsuario().getTelefono(),
                    publicacion.getUsuario().getDireccion());
            PublicacionDTO publicacionDTO = new PublicacionDTO(
                    publicacion.getIdPublicacion(),
                    publicacion.getTitulo(),
                    publicacion.getCuerpo(),
                    publicacion.getImagen(),
                    publicacion.getResiduo(),
                    publicacion.getPrecio(),
                    publicacion.getUnidadMedida(),
                    usuario);
            publicacionDTOs.add(publicacionDTO);
        }
        return publicacionDTOs;
    }

    @Override
    public List<Publicacion> findByUsuarioIdUsuario(Long idUsuario) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<PublicacionDTO> getPublicacionesByUsuario(Long idUsuario) {
        List<Publicacion> publicaciones = publicacionRepository.findByUsuarioIdUsuario(idUsuario);
        List<PublicacionDTO> publicacionDTOs = new ArrayList<>();
        for (Publicacion publicacion : publicaciones) {
            UsuarioPublicacionDTO usuario = new UsuarioPublicacionDTO(
                    publicacion.getUsuario().getIdUsuario(),
                    publicacion.getUsuario().getNombre(),
                    publicacion.getUsuario().getApellido(),
                    publicacion.getUsuario().getEmail(),
                    publicacion.getUsuario().getTelefono(),
                    publicacion.getUsuario().getDireccion());
            PublicacionDTO publicacionDTO = new PublicacionDTO(
                    publicacion.getIdPublicacion(),
                    publicacion.getTitulo(),
                    publicacion.getCuerpo(),
                    publicacion.getImagen(),
                    publicacion.getResiduo(),
                    publicacion.getPrecio(),
                    publicacion.getUnidadMedida(),
                    usuario);
            publicacionDTOs.add(publicacionDTO);
        }
        return publicacionDTOs;
    }

    @Override
    public PublicacionDTO getPublicacionByUsuarioAndId(Long idUsuario, Long idPublicacion) {
        Publicacion publicacion = publicacionRepository.findByUsuarioIdUsuarioAndIdPublicacion(idUsuario,
                idPublicacion);
        UsuarioPublicacionDTO usuarioDTO = new UsuarioPublicacionDTO(
                publicacion.getUsuario().getIdUsuario(),
                publicacion.getUsuario().getNombre(),
                publicacion.getUsuario().getApellido(),
                publicacion.getUsuario().getEmail(),
                publicacion.getUsuario().getTelefono(),
                publicacion.getUsuario().getDireccion());
        PublicacionDTO publicacionDTO = new PublicacionDTO(
                publicacion.getIdPublicacion(),
                publicacion.getTitulo(),
                publicacion.getCuerpo(),
                publicacion.getImagen(),
                publicacion.getResiduo(),
                publicacion.getPrecio(),
                publicacion.getUnidadMedida(),
                usuarioDTO);
        return publicacionDTO;
    }

    @Override
    public PublicacionDTO savePublicacion(CrearPublicacionDTO crearPublicacionDTO) {
        Usuario user = usuarioRepository.findById(crearPublicacionDTO.getIdUsuario()).orElse(null);
        if (user == null) {
            System.out.println("Usuario es null");
            return null;
        }

        Publicacion publicacion = new Publicacion();
        publicacion.setTitulo(crearPublicacionDTO.getTitulo());
        publicacion.setCuerpo(crearPublicacionDTO.getCuerpo());
        publicacion.setImagen(crearPublicacionDTO.getImagen());
        publicacion.setResiduo(crearPublicacionDTO.getResiduo());
        publicacion.setPrecio(crearPublicacionDTO.getPrecio());
        publicacion.setUnidadMedida(crearPublicacionDTO.getUnidadMedida());
        publicacion.setUsuario(user);

        publicacion = publicacionRepository.save(publicacion);

        // Aquí es donde conviertes la entidad Publicacion a PublicacionDTO
        PublicacionDTO publicacionDTO = convertEntityToDto(publicacion);

        return publicacionDTO;
    }

    public PublicacionDTO convertEntityToDto(Publicacion publicacion) {
        PublicacionDTO publicacionDTO = new PublicacionDTO();
    publicacionDTO.setIdPublicacion(publicacion.getIdPublicacion());
    publicacionDTO.setTitulo(publicacion.getTitulo());
    publicacionDTO.setCuerpo(publicacion.getCuerpo());
    publicacionDTO.setImagen(publicacion.getImagen());
    publicacionDTO.setResiduo(publicacion.getResiduo());
    publicacionDTO.setPrecio(publicacion.getPrecio());
    publicacionDTO.setUnidadMedida(publicacion.getUnidadMedida());

    UsuarioPublicacionDTO usuarioDTO = new UsuarioPublicacionDTO();
    usuarioDTO.setIdUsuario(publicacion.getUsuario().getIdUsuario());
    usuarioDTO.setNombre(publicacion.getUsuario().getNombre());
    usuarioDTO.setApellido(publicacion.getUsuario().getApellido());
    usuarioDTO.setEmail(publicacion.getUsuario().getEmail());
    usuarioDTO.setTelefono(publicacion.getUsuario().getTelefono());
    usuarioDTO.setDireccion(publicacion.getUsuario().getDireccion());

    publicacionDTO.setUsuario(usuarioDTO);  // Aquí estableces el campo usuario de PublicacionDTO

    return publicacionDTO;

        // PublicacionDTO publicacionDTO = new PublicacionDTO();
        // publicacionDTO.setIdPublicacion(publicacion.getIdPublicacion());
        // publicacionDTO.setTitulo(publicacion.getTitulo());
        // publicacionDTO.setCuerpo(publicacion.getCuerpo());
        // publicacionDTO.setImagen(publicacion.getImagen());
        // publicacionDTO.setResiduo(publicacion.getResiduo());
        // publicacionDTO.setPrecio(publicacion.getPrecio());
        // publicacionDTO.setUnidadMedida(publicacion.getUnidadMedida());

        // UsuarioPublicacionDTO usuaPubliDTO = new UsuarioPublicacionDTO();
        // usuaPubliDTO.setIdUsuario(publicacion.getUsuario().getIdUsuario());
        // // Aquí también deberías llenar los campos del DTO relacionados con el
        // Usuario

        // return publicacionDTO;
    }

    // @Override
    // public Publicacion findByUsuarioIdUsuarioAndIdPublicacion(Long idUsuario,
    // Long idPublicacion) {
    // Publicacion publicacion =
    // publicacionRepository.findByUsuarioIdUsuarioAndIdPublicacion(idUsuario,
    // idPublicacion);
    // UsuarioPublicacionDTO usuarioDTO = new UsuarioPublicacionDTO(
    // publicacion.getUsuario().getIdUsuario(),
    // publicacion.getUsuario().getNombre(),
    // publicacion.getUsuario().getApellido(),
    // publicacion.getUsuario().getEmail(),
    // publicacion.getUsuario().getTelefono(),
    // publicacion.getUsuario().getDireccion()
    // );
    // PublicacionDTO publicacionDTO = new PublicacionDTO(
    // publicacion.getIdPublicacion(),
    // publicacion.getTitulo(),
    // publicacion.getCuerpo(),
    // publicacion.getImagen(),
    // publicacion.getResiduo(),
    // publicacion.getPrecio(),
    // publicacion.getUnidadMedida(),
    // usuarioDTO
    // );
    // //PENDIENTE
    // return publicacionDTO;
    // }

    // @Override
    // public PublicacionDTO addPublicacion(Long idUsuario, PublicacionDTO
    // publicacionDTO) {
    // Usuario usuario = usuarioRepository.findById(idUsuario).orElseThrow(() -> new
    // UsuarioNotFoundException("Usuario no encontrado"));
    // Publicacion nuevaPublicacion = new Publicacion();
    // nuevaPublicacion.setTitulo(publicacionDTO.getTitulo());
    // nuevaPublicacion.setCuerpo(publicacionDTO.getCuerpo());
    // // ... establece los demás campos ...
    // nuevaPublicacion.setUsuario(usuario);
    // nuevaPublicacion = publicacionRepository.save(nuevaPublicacion);
    // PublicacionDTO nuevaPublicacionDTO =
    // convertirAPublicacionDTO(nuevaPublicacion);
    // return nuevaPublicacionDTO;
    // }

    // private PublicacionDTO convertirAPublicacionDTO(Publicacion publicacion) {
    // UsuarioPublicacionDTO usuarioDTO = new UsuarioPublicacionDTO(
    // publicacion.getUsuario().getIdUsuario(),
    // publicacion.getUsuario().getNombre(),
    // publicacion.getUsuario().getApellido(),
    // publicacion.getUsuario().getEmail(),
    // publicacion.getUsuario().getTelefono(),
    // publicacion.getUsuario().getDireccion()
    // );
    // PublicacionDTO publicacionDTO = new PublicacionDTO(
    // publicacion.getIdPublicacion(),
    // publicacion.getTitulo(),
    // publicacion.getCuerpo(),
    // publicacion.getImagen(),
    // publicacion.getResiduo(),
    // publicacion.getPrecio(),
    // publicacion.getUnidadMedida(),
    // usuarioDTO
    // );
    // return publicacionDTO;
    // }

}

// ********************************************************************** */
// Codigo antiguo

// import com.generation.backendproject.model.Publicacion;
// import com.generation.backendproject.model.Usuario;
// import com.generation.backendproject.repository.PublicacionRepository;
// import com.generation.backendproject.repository.UsuarioRepository;
// import jakarta.transaction.Transactional;
// import lombok.AllArgsConstructor;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Transactional
// @AllArgsConstructor
// @Service
// public class PublicacionServiceImpl implements PublicacionService{

// @Autowired
// private PublicacionRepository publicacionRepository;

// @Autowired
// UsuarioRepository usuarioRepository;

// @Override
// public Publicacion obtenerPublicacionPorId(Long id){
// return publicacionRepository.findByIdPublicacion(id);
// }

// @Override
// public List<Publicacion> listarPublicaciones(){
// return publicacionRepository.findAll();
// }

// //@Override
// //public Publicacion savePublicacion(Publicacion publicacion) {
// // return publicacionRepository.save(publicacion);
// //}
// }
