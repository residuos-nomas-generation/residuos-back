package com.generation.backendproject.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "rol_usuarios")
public class RolUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rolUsuarioId;

    @OneToMany(mappedBy = "rolUsuarioId")
    private List<Usuario> usuarios;
}
