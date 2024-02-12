package com.generation.backendproject.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data

public class VigenciaPublicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vigencia_publicacion")
    private Long vigenciaPublicacion;

    @Column(name = "descripcion_vigencia", nullable = false, length = 100)
    private String descripcionVigencia;
}
