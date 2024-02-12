package com.generation.backendproject.model;

import jakarta.persistence.*;

@Entity
@Table(name = "comunas")
public class Comuna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_comuna")
    private Long idComuna;

    @Column(name = "descripcion_comuna", nullable = false, length = 100)
    private String descripcionComuna;

    //Como comuna utiliza el Region_id_region, la relación que existe entre comuna y región es:
    //muchas regiones pueden tener solo una comuna, pero una comuna puede tener muchas regions
    //Por lo mismo se hace la conexión en la tabla o modelo Comuna (ya que es la tabla importante)
    @ManyToOne
    @JoinColumn(name = "Region_id_region")
    private Region region;


}
