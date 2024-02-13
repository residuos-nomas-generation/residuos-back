package com.generation.backendproject.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "residuo")
@Data
public class Residuo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_residuo")
    private Long idResiduo;

    @ManyToOne
    @JoinColumn(name="Categoria_residuo_id_categoria_residuo")
    private CategoriaResiduo categoriaResiduo;

    @ManyToOne
    @JoinColumn(name="Estado_residuos_id_estado_residuos")
    private EstadoResiduo estadoResiduo;

}
