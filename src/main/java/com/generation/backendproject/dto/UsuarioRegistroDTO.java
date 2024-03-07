package com.generation.backendproject.dto;

// import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsuarioRegistroDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String contrasenha;
}
