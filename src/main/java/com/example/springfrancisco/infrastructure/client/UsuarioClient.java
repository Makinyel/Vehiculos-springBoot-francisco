package com.example.springfrancisco.infrastructure.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Configuration
@Component
@FeignClient(name = "client-1", url = "localhost:8084/user")
public interface UsuarioClient {
    @RequestMapping(method = RequestMethod.GET)
    UsuarioResponse getUsuario(@RequestParam String numdocumento);
}
