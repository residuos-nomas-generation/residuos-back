package com.generation.backendproject.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.backendproject.model.Comuna;
import com.generation.backendproject.repository.ComunaRepository;

@Service
public class ComunaServiceImpl implements ComunaService {

    @Autowired
    private ComunaRepository comuRepository;

    @Override
    public Comuna findComuna(Long id) {
        Comuna comu = comuRepository.findById(id).orElse(null);
        return comu;
    }
}


// ********************************************************************** */
// Codigo antiguo



// import com.generation.backendproject.model.Comuna;
// import com.generation.backendproject.repository.ComunaRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// @Service
// public class ComunaServiceImpl implements ComunaService {

//     @Autowired
//     private ComunaRepository comuRepository;

//     @Override
//     public Comuna findComuna(Long id) {
//         Comuna comu = comuRepository.findById(id).orElse(null);
//         return comu;
//     }
// }