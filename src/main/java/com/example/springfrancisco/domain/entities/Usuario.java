package com.example.springfrancisco.domain.entities;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Builder
public class Usuario {

    private String nombre;
    private String apellido;
    private String numDocumento;
    private String tipoDocumento;

    public Usuario(String nombre, String apellido, String numDocumento, String tipoDocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numDocumento = numDocumento;
        this.tipoDocumento = tipoDocumento;
    }
}
