package com.example.springfrancisco.application.Car;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.carro.CarGetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service

public class CarGet {
    private final CarGetService cargetservice;

    public Carro getCar(String placa) {
        return cargetservice.getCar(placa);
    }






}
