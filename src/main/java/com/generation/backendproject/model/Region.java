package com.generation.backendproject.model;

import jakarta.persistence.*;

@Entity
@Table(name="region")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_region")
    private Long idRegion;

    @Column(name = "descripcion_region", nullable = false, length = 100)
    private String descripcionRegion;


}
