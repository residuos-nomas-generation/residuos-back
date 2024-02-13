package com.generation.backendproject.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="estado_residuo")
@Data
public class EstadoResiduo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estado_residuo")
    private Long idEstadoResiduo;

    @Column(name = "descripcion_estado_residuo", nullable = false, length = 100)
    private String descripcionEstadoResiduo;

}

