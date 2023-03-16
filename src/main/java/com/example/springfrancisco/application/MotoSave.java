package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.service.MotoGetService;
import com.example.springfrancisco.domain.service.MotoSaveService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@AllArgsConstructor
@Service
@Slf4j

public class MotoSave {

    private final MotoSaveService motoSaveService;
    private final MotoGetService motoGetService;

    public Moto saveMoto(Moto moto) {
        Moto moto1 = motoGetService.getMoto(moto.getPlaca());
        if (!Objects.isNull(moto1)) {
            log.info("LA MOTO CON PLACA {} YA ESTA REGISTRADO", moto.getPlaca());
            return null;
        }
        return motoSaveService.saveMoto(moto);
    }

}
