package com.generation.backendproject.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
// import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
// import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "publicacion")
// @JsonIgnoreProperties("comuna")
public class Publicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPublicacion;

    private String titulo;

    private String cuerpo;

    private String imagen;

    private String residuo;

    private Double precio;

    private String unidadMedida;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    @JsonBackReference
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idComuna")
    private Comuna comuna;

}


// ********************************************************************** */
// Codigo antiguo

// import jakarta.persistence.*;
// import lombok.AllArgsConstructor;
// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Entity
// @Table(name = "Publicacion")
// @Data
// //@NoArgsConstructor
// @AllArgsConstructor
// public class Publicacion {
// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// @Column(name = "id_publicacion")
// private Long idPublicacion;

// @ManyToOne(fetch = FetchType.LAZY, optional = false)
// @JoinColumn(name = "Usuario_id_usuario")
// private Usuario usuario;

// @Column(name = "titulo_publicacion", length = 45)
// private String tituloPublicacion;

// @Column(name = "image_publicacion", length = 45)
// private String imagePublicacion;

// @Column(name = "cuerpo_publicacion", length = 200)
// private String cuerpoPublicacion;

// @Column(name = "cantidad")
// private Integer cantidad;

// @Column(name = "residuo")
// private Integer residuo;

// @Column(name = "precio")
// private Integer precio;

// @Column(name = "unidad_medida")
// private String unidadMedida;

// @ManyToOne
// @JoinColumn(name = "Vigencia_publicacion_id_vigencia_publicacion")
// private VigenciaPublicacion vigenciaPublicacion;

// public Publicacion() {
// }
// }