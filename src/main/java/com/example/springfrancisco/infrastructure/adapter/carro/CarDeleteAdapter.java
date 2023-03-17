package com.example.springfrancisco.infrastructure.adapter.carro;

import com.example.springfrancisco.domain.service.carro.CarDeleteService;
import com.example.springfrancisco.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarDeleteAdapter implements CarDeleteService {
    private final CarRepository carrepository;

    @Override
    public void deleteCar(String placa) {
        carrepository.deleteById(placa);
    }
}
