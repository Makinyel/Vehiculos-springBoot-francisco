package com.example.springfrancisco.application.Car;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.carro.CarGetService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CarGetTest {
    @Mock
    private CarGet carGet;
    @Mock
    private CarGetService carGetService;

    @Test
    void getCar() {

        Carro car1 = new Carro();
        car1.setColor("blue");
        car1.setMarca("BMW");
        car1.setModelo("2020");
        car1.setPrecio(1203d);
        car1.setPlaca("1041");

        Carro car = buiderCarro();
        Mockito.when(carGetService.getCar(car.getPlaca())).thenReturn(car);
        var carro = carGetService.getCar(car.getPlaca());

        assertEquals(carro,car1);
    }
    public Carro buiderCarro() {
        Carro car = new Carro();
        car.setColor("blue");
        car.setMarca("BMW");
        car.setModelo("2020");
        car.setPrecio(1203d);
        car.setPlaca("1041");
        return car;
    }

}
