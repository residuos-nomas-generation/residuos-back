package com.generation.backendproject.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CrearPublicacionDTO {

    private String titulo;
    private String cuerpo;
    private String imagen;
    private String residuo;
    private Double precio;
    private String unidadMedida;
    private Long idUsuario;

}
