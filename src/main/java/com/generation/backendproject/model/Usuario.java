package com.generation.backendproject.model;


import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String contrasenha;

    @Column(unique = true)
    private String email;

    private String nombre;

    private String apellido;

    private Date fechaCreacion;

    private String telefono;

    private String nombreEmpresa;

    private String telefonoEmpresa;

    private String direccion;

    @ManyToOne
    @JoinColumn(name = "rolUsuarioId")
    private RolUsuario rolUsuarioId;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Publicacion> publicaciones;
}


// ********************************************************************** */
// Codigo antiguo

// import jakarta.persistence.*;
// import lombok.Data;
// import lombok.Getter;
// import lombok.Setter;

// import java.util.Date;
// // import java.util.List;


// @Entity
// @Table(name = "usuarios")
// @Getter
// @Setter
// @Data
// public class Usuario {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     private Long usuarioId;

//     @Column(name="usuario_nombre", length = 100)
//     private String usuarioNombre;

//     @Column(name="usuario_apellido", length = 100)
//     private String usuarioApellido;

//     @Column(name = "email", nullable = false, unique = true)
//     private String email;

//     @Column(name = "contrasenha", nullable = false)
//     private String contrasenha;
//     private Date fechaCreacion;

//     private String nombreEmpresa;
//     private String direccionEmpresa;
//     private String telefonoEmpresa;

//     @ManyToOne
//     @JoinColumn(name = "rolUsuarioId")
//     private RolUsuario rolUsuarioId;

//     public Usuario(String usuarioNombre, String usuarioApellido, String email, String contrasenha, RolUsuario rolUsuario) {
//         this.usuarioNombre = usuarioNombre;
//         this.usuarioApellido = usuarioApellido;
//         this.email = email;
//         this.contrasenha = contrasenha;
//         this.fechaCreacion = new Date(); // Si necesitas establecer la fecha de creación automáticamente
//         this.rolUsuarioId = rolUsuario;
//     }
//     public Usuario() {

//     }

//     public Usuario(String nombre, String apellido, String email, String contrasenha) {
//     }

// }