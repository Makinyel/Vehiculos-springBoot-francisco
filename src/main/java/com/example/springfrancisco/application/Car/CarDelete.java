package com.example.springfrancisco.application.Car;

import com.example.springfrancisco.domain.service.carro.CarDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarDelete {

    private final CarDeleteService cardeleteservice;

    public void deleteCar(String placa) {
        cardeleteservice.deleteCar(placa);
    }

}
