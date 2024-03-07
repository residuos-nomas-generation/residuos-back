package com.generation.backendproject.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "rol_usuarios")
public class RolUsuario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long rolUsuarioId;

  @Column(name = "descripcion_rol", length = 100)
  private String descripcionRol;
  @OneToMany(mappedBy = "rolUsuarioId")
  private List<Usuario> usuarios;

  public RolUsuario(String descripcionRol) {
    this.descripcionRol = descripcionRol;
  }

  public RolUsuario() {

  }
}


// ********************************************************************** */
// Codigo antiguo

// import jakarta.persistence.*;
// import lombok.Data;

// import java.util.List;

// @Data
// @Entity
// @Table(name = "rol_usuarios")
// public class RolUsuario {
// @Id
// @GeneratedValue(strategy = GenerationType.IDENTITY)
// private Long rolUsuarioId;

// @Column(name="descripcion_rol", length = 100)
// private String descripcionRol;
// @OneToMany(mappedBy = "rolUsuarioId")
// private List<Usuario> usuarios;

// public RolUsuario(String descripcionRol) {
// this.descripcionRol = descripcionRol;
// }

// public RolUsuario() {

// }

// //@PrePersist
// //public void prePersist() {
// // if (descripcionRol == null) {
// // descripcionRol = "administrador";
// // }
// //}
// }
