package com.generation.backendproject.service;

import com.generation.backendproject.model.Publicacion;
import com.generation.backendproject.repository.PublicacionRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Transactional
@AllArgsConstructor
@Service
public class PublicacionServiceImpl implements PublicacionService{

    @Autowired
    private PublicacionRepository publicacionRepository;

    public Publicacion obtenerPublicacionPorId(Long id){
        return publicacionRepository.findByIdPublicacion(id);
    }

    @Override
    public List<Publicacion> listarPublicaciones(){
        return publicacionRepository.findAll();
    }
}
