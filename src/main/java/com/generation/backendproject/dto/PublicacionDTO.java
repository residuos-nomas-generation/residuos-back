package com.generation.backendproject.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PublicacionDTO {
    private Long idPublicacion;
    private String titulo;
    private String cuerpo;
    private String imagen;
    private String residuo;
    private Double precio;
    private String unidadMedida;

    // Objeto UsuarioPublicacionDTO (con datos de Usuario)
    private UsuarioPublicacionDTO usuario;


    public PublicacionDTO(Long idPublicacion, String titulo, String cuerpo, String imagen, String residuo,
            Double precio, String unidadMedida, UsuarioPublicacionDTO usuario) {
        this.idPublicacion = idPublicacion;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.imagen = imagen;
        this.residuo = residuo;
        this.precio = precio;
        this.unidadMedida = unidadMedida;
        this.usuario = usuario;

    }

}
