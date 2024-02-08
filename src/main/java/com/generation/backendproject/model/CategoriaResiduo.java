package com.generation.backendproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria_residuos")
public class CategoriaResiduo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoriaResiduoId;
}
