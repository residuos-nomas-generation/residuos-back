package com.generation.backendproject.service;

import com.generation.backendproject.model.Publicacion;

import java.util.List;

public interface PublicacionService {
    Publicacion obtenerPublicacionPorId(Long id);
    List<Publicacion> listarPublicaciones();
}
