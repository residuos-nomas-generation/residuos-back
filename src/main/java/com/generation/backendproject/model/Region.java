package com.generation.backendproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Getter
@Setter
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idRegion")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRegion;

    private String nombreRegion;

    @OneToMany(mappedBy = "region") // mappedBy se refiere al atributo en la clase Comuna
    private List<Comuna> comunas;

    // Getters and setters
}

// ********************************************************************** */
// Codigo antiguo


// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.OneToMany;
// import lombok.Getter;
// import lombok.Setter;

// import java.util.List;

// import com.fasterxml.jackson.annotation.JsonIdentityInfo;
// import com.fasterxml.jackson.annotation.ObjectIdGenerators;

// @Getter
// @Setter
// @Entity
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idRegion")
// public class Region {

//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long idRegion;

//     private String nombreRegion;

//     @OneToMany(mappedBy = "region") // mappedBy se refiere al atributo en la clase Comuna
//     private List<Comuna> comunas;

//     // Getters and setters
// }