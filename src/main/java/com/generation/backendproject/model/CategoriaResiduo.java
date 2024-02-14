package com.generation.backendproject.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "categoria_residuos")
@Data
public class CategoriaResiduo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoriaResiduoId;

    @Column(name = "descripcion_categoria_residuo", nullable = false, length = 100)
    private String descripcionCategoriaResiduo;
}