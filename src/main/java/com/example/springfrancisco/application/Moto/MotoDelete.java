package com.example.springfrancisco.application.Moto;

import com.example.springfrancisco.domain.service.moto.MotoDeleteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class MotoDelete {
    private final MotoDeleteService motoDeleteService;

    public void deleteMoto(String placa) {
        motoDeleteService.deleteMoto(placa);
    }
}
