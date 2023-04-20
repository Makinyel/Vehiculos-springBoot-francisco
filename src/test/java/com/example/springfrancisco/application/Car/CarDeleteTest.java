package com.example.springfrancisco.application.Car;

import com.example.springfrancisco.domain.service.carro.CarDeleteService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CarDeleteTest {


    @InjectMocks
    private CarDelete carDelete;

    @Mock
    private CarDeleteService carDeleteService;


    @Test
    void eliminarCar(){
        carDelete.deleteCar("1");
        Mockito.verify(carDeleteService, Mockito.times(1)).deleteCar("1");
    }
}
