package com.generation.backendproject.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioId;

    @Column(name="usuario_nombre", length = 100)
    private String usuarioNombre;

    @Column(name="usuario_apellido", length = 100)
    private String usuarioApellido;

    private String email;
    private String contrasenha;
    private Date fechaCreación;

    private String nombreEmpresa;
    private String direccionEmpresa;
    private String telefonoEmpresa;

    @ManyToOne
    @JoinColumn(name = "rolUsuarioId")
    private RolUsuario rolUsuarioId;
}
