package com.example.springfrancisco.infrastructure.adapter.usuario;

import com.example.springfrancisco.domain.entities.Usuario;
import com.example.springfrancisco.domain.service.usuario.UsuarioResponseGetService;
import com.example.springfrancisco.infrastructure.client.UsuarioClient;
import com.example.springfrancisco.infrastructure.client.UsuarioResponse;
import com.example.springfrancisco.infrastructure.mapper.UsuarioMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UsuarioGetAdapter implements UsuarioResponseGetService {
    private final UsuarioClient usuarioClient;
    private final UsuarioMapper usuarioMapper;
    @Override
    public Usuario getUsuario(String id) {
        return usuarioMapper.usuario(usuarioClient.getUsuario(id));
    }
}
