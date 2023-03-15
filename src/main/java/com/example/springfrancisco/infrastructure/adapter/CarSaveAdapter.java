package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.CarSaveService;
import com.example.springfrancisco.infrastructure.dto.CarroDto;
import com.example.springfrancisco.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarSaveAdapter implements CarSaveService {

  private final CarRepository carRepository;

  @Override
  public Carro save(Carro carro) {
    return buildCarro(carRepository.save(buildCarroDto(carro)));
  }

  private CarroDto buildCarroDto(Carro carro){
    return new CarroDto(carro.getMarca(), carro.getPlaca(), carro.getModelo(), carro.getPrecio(), carro.getColor());
  }

  private Carro buildCarro(CarroDto carro){
    return new Carro(carro.getMarca(), carro.getPlaca(), carro.getModelo(), carro.getPrecio(), carro.getColor());
  }
}
