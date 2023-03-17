package com.example.springfrancisco.application.Car;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.carro.CarEditService;
import com.example.springfrancisco.domain.service.carro.CarGetService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@AllArgsConstructor
@Slf4j
public class CarEdit {
    private CarEditService careditservice;
    private final CarGetService carGetService;

    public void editCar(Carro carro) {
        Carro carro1 = carGetService.getCar(carro.getPlaca());
        if (Objects.isNull(carro1)) {
            log.info("EL CARRO CON PLACA {} NO ESTA REGISTRADO", carro.getPlaca());
        }
        careditservice.editCar(carro);
    }
}
