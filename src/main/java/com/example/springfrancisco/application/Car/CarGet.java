package com.example.springfrancisco.application.Car;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.entities.Usuario;
import com.example.springfrancisco.domain.service.carro.CarGetService;
import com.example.springfrancisco.domain.service.usuario.UsuarioResponseGetService;
import com.example.springfrancisco.infrastructure.client.UsuarioClient;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j

public class
CarGet {
    private final CarGetService cargetservice;
    public Carro getCar(String placa) {
        return cargetservice.getCar(placa);
    }






}
