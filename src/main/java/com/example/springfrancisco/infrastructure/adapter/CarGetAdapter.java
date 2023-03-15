package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.CarGetService;
import com.example.springfrancisco.infrastructure.dto.CarroDto;
import com.example.springfrancisco.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service

public class CarGetAdapter implements CarGetService {

    private final CarRepository carRepository;

    @Override
    public Carro getCar(String placa) {
        Optional<CarroDto> carrodto = carRepository.findById(placa);
        if (carrodto.isEmpty()) {
            return null;
        }
        return buildCarro(carrodto.get());
    }
    private Carro buildCarro(CarroDto carro) {
        return new Carro(carro.getMarca(),carro.getPlaca(), carro.getModelo(), carro.getPrecio(), carro.getColor());
    }

}

