package com.generation.backendproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.backendproject.model.Region;
import com.generation.backendproject.repository.RegionRepository;

@Service
public class RegionServiceImpl implements RegionService {

    @Autowired
    private RegionRepository regiRepository;

    @Override
    public Region findRegion(Long id) {
        Region regi = regiRepository.findById(id).orElse(null);
        return regi;
    }

    @Override
    public List<Region> getRegions() {
        List<Region> listaRegiones = regiRepository.findAll();
        return listaRegiones;
    }

}

// ********************************************************************** */
// Codigo antiguo


// import com.generation.backendproject.model.Region;
// import com.generation.backendproject.repository.RegionRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import java.util.List;

// @Service
// public class RegionServiceImpl implements RegionService {

// @Autowired
// private RegionRepository regiRepository;

// @Override
// public Region findRegion(Long id) {
// Region regi = regiRepository.findById(id).orElse(null);
// return regi;
// }

// @Override
// public List<Region> getRegions() {
// List<Region> listaRegiones = regiRepository.findAll();
// return listaRegiones;
// }

// }