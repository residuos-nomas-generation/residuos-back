package com.generation.backendproject.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioPublicacionDTO {
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String direccion;

    public UsuarioPublicacionDTO(Long idUsuario, String nombre, String apellido, String email,
            String telefono, String direccion) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }
}