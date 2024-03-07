package com.generation.backendproject.dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
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

    public PublicacionDTO() {

    }

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

    public void setIdPublicacion(Long idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setResiduo(String residuo) {
        this.residuo = residuo;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

}
