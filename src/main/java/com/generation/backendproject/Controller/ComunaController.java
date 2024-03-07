package com.generation.backendproject.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.generation.backendproject.model.Comuna;
import com.generation.backendproject.service.ComunaService;


@RestController
public class ComunaController {

    @Autowired
    private ComunaService comunServ;

    @GetMapping("/comuna/{id}")
    public Comuna encuentraComuna(@PathVariable Long id) {
        return comunServ.findComuna(id);
    }
}


// ********************************************************************** */
	// Codigo antiguo

// import com.generation.backendproject.model.Comuna;
// import com.generation.backendproject.service.ComunaService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class ComunaController {

//     @Autowired
//     private ComunaService comunServ;

//     @GetMapping("/comuna/{id}")
//     public Comuna encuentraComuna(@PathVariable Long id) {
//         return comunServ.findComuna(id);
//     }
// }

