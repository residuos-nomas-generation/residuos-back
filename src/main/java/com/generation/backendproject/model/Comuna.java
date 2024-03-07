package com.generation.backendproject.model;
//package com.regioncomuna.artefactgod.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "idComuna")
public class Comuna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idComuna;

    private String nombreComuna;

    @ManyToOne
    @JoinColumn(name = "idRegion") // Nombre de la columna en la tabla region
    @JsonIgnore
    private Region region;

    // Getters and setters
}


// ********************************************************************** */
// Codigo antiguo

// import com.fasterxml.jackson.annotation.JsonIdentityInfo;
// import com.fasterxml.jackson.annotation.ObjectIdGenerators;

// import jakarta.persistence.Entity;
// import jakarta.persistence.GeneratedValue;
// import jakarta.persistence.GenerationType;
// import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import lombok.Getter;
// import lombok.Setter;

// @Getter
// @Setter
// @Entity
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
// property = "idComuna")
// public class Comuna {

// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// private Long idComuna;

// private String nombreComuna;

// @ManyToOne
// @JoinColumn(name = "idRegion") // Nombre de la columna en la tabla region
// private Region region;

// // Getters and setters
// }