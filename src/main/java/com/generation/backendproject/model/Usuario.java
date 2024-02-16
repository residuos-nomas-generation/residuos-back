package com.generation.backendproject.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuarios")
@Data
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

    public Usuario(String usuarioNombre, String usuarioApellido, String email, String contrasenha, RolUsuario rolUsuario) {
        this.usuarioNombre = usuarioNombre;
        this.usuarioApellido = usuarioApellido;
        this.email = email;
        this.contrasenha = contrasenha;
        this.fechaCreación = new Date(); // Si necesitas establecer la fecha de creación automáticamente
        this.rolUsuarioId = rolUsuario;
    }
    public Usuario() {

    }

    public Usuario(String nombre, String apellido, String email, String contrasenha) {
    }
}