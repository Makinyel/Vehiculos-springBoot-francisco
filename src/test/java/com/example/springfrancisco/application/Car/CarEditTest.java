package com.example.springfrancisco.application.Car;


import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.carro.CarEditService;
import com.example.springfrancisco.domain.service.carro.CarGetService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CarEditTest {

    @InjectMocks
    private CarEdit carEdit;

    @Mock
    private CarEditService carEditService;


    @Mock
    private CarGetService  carGetService;

    @Test
    void editCar(){
        var car = buiderCarro();
        carEdit.editCar(car);
        Mockito.verify(carEditService, Mockito.times(1)).editCar(car);
    }
    public Carro buiderCarro() {
        Carro car = Carro.builder().color("#000000").build();
        return car;
    }
}
