package com.generation.backendproject.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Publicacion")
@Data

public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_publicacion")
    private Long idPublicacion;

    @ManyToOne
    @JoinColumn(name = "Usuario_id_usuario")
    private Usuario usuario;

    @Column(name = "titulo_publicacion", length = 45)
    private String tituloPublicacion;

    @Column(name = "image_publicacion", length = 45)
    private String imagePublicacion;

    @Column(name = "cuerpo_publicacion", length = 200)
    private String cuerpoPublicacion;

    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "precio")
    private Integer precio;

    @Column(name = "unidad_medida")
    private String unidadMedida;

    @ManyToOne
    @JoinColumn(name = "Comuna_id_comuna")
    private Comuna comuna;

    @ManyToOne
    @JoinColumn(name = "Vigencia_publicacion_id_vigencia_publicacion")
    private VigenciaPublicacion vigenciaPublicacion;

    @ManyToOne
    @JoinColumn(name = "Residuo_id_residuo")
    private Residuo residuo;

}