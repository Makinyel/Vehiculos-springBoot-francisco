package com.example.springfrancisco.infrastructure.mapper;


import com.example.springfrancisco.domain.entities.Usuario;
import com.example.springfrancisco.infrastructure.client.UsuarioResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "Spring")
public interface UsuarioMapper {

    @Mappings({
            @Mapping(target = "nombre",source = "nombre"),
            @Mapping(target = "apellido",source = "apellido"),
            @Mapping(target = "numDocumento",source = "numDocumento"),
            @Mapping(target = "tipoDocumento",source = "tipoDocumento")
    })
            UsuarioResponse usuarioResponse(Usuario usuario);
            Usuario usuario(UsuarioResponse usuarioResponse);
}
