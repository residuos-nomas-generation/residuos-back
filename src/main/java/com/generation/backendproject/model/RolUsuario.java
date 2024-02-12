package com.generation.backendproject.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "rol_usuarios")
public class RolUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rolUsuarioId;

    @Column(name="descripcion_rol", length = 100)
    private String descripcionRol;
    @OneToMany(mappedBy = "rolUsuarioId")
    private List<Usuario> usuarios;
}
