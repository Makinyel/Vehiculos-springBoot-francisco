package com.example.springfrancisco.infrastructure.client;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class UsuarioResponse {
    private String nombre;
    private String apellido;
    private String numDocumento;
    private String tipoDocumento;
    public UsuarioResponse(String nombre, String apellido, String numDocumento, String tipoDocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numDocumento = numDocumento;
        this.tipoDocumento = tipoDocumento;
    }
}
