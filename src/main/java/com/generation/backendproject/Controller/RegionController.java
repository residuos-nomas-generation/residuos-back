package com.generation.backendproject.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.generation.backendproject.model.Region;
import com.generation.backendproject.service.RegionService;



@RestController
public class RegionController {
    @Autowired
    private RegionService regioServ;

    @GetMapping("/regiones")
    public ResponseEntity<List<Region>> getRegions() {
        List<Region> regiones = regioServ.getRegions();
        return new ResponseEntity<>(regiones, HttpStatus.OK);
    }

    @GetMapping("/region/{id}")
    public Region encuentraRegion(@PathVariable Long id) {
        return regioServ.findRegion(id);
    }
}

// ********************************************************************** */
	// Codigo antiguo

// import com.generation.backendproject.model.Region;
// import com.generation.backendproject.service.RegionService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RestController;

// import java.util.List;

// @RestController
// public class RegionController {
//     @Autowired
//     private RegionService regioServ;

//     @GetMapping("/regiones")
//     public ResponseEntity<List<Region>> getRegions() {
//         List<Region> regiones = regioServ.getRegions();
//         return new ResponseEntity<>(regiones, HttpStatus.OK);
//     }

//     @GetMapping("/region/{id}")
//     public Region encuentraRegion(@PathVariable Long id) {
//         return regioServ.findRegion(id);
//     }
// }
