package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.CarDeleteService;
import com.example.springfrancisco.domain.service.CarSaveService;
import com.example.springfrancisco.infrastructure.adapter.CarDeleteAdapter;
import com.example.springfrancisco.infrastructure.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class CarDelete {

    private final CarDeleteService cardeleteservice;

    public void deleteCar(String placa){
        cardeleteservice.deleteCar(placa);
    }

}
