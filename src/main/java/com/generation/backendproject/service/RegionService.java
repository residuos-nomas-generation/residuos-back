package com.generation.backendproject.service;

import java.util.List;

import com.generation.backendproject.model.Region;

public interface RegionService {

    // Traer todas las Región
    public List<Region> getRegions();

    // Encontrar Región (Ojito el parametro👀si no es id es idRegion)
    public Region findRegion(Long id);
}

// ********************************************************************** */
// Codigo antiguo

// import com.generation.backendproject.model.Region;

// import java.util.List;

// public interface RegionService {

// // Traer todas las Región
// public List<Region> getRegions();

// // Encontrar Región (Ojito el parametro👀si no es id es idRegion)
// public Region findRegion(Long id);
// }