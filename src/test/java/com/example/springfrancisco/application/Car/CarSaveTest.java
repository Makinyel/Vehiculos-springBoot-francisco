package com.example.springfrancisco.application.Car;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.entities.Usuario;
import com.example.springfrancisco.domain.entities.Vehiculo;
import com.example.springfrancisco.domain.service.carro.CarGetService;
import com.example.springfrancisco.domain.service.carro.CarSaveService;
import com.example.springfrancisco.domain.service.usuario.UsuarioResponseGetService;
import com.example.springfrancisco.infrastructure.client.UsuarioResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CarSaveTest {
    @InjectMocks
    private CarSave carSave;
    @Mock
    private CarSaveService carSaveService;
    @Mock
    private CarGetService cargetService;
    @Mock
    private UsuarioResponseGetService usuarioResponseGetService;

    @Test
    void saveCar() {
        Usuario user = Usuario.builder().nombre("Angel").apellido("Espinosa").
                tipoDocumento("CC").numDocumento("1041971977").build();
        var car = buiderCarro();
        //Mockito.when(usuarioResponseGetService.getUsuario(user.getNumDocumento())).thenReturn(user);
        Mockito.when(cargetService.getCar(car.getPlaca())).thenReturn(car);
        Mockito.when(carSaveService.save(car)).thenReturn(car);

        var response = carSave.saveCar(car, "1041971977");
        Assertions.assertEquals(car, response);


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


