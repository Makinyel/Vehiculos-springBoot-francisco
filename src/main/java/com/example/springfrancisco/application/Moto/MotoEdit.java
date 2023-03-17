package com.example.springfrancisco.application.Moto;

import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.service.moto.MotoEditService;
import com.example.springfrancisco.domain.service.moto.MotoGetService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@AllArgsConstructor
@Slf4j


public class MotoEdit {
    private MotoEditService motoEditService;
    private final MotoGetService motoGetService;

    public void editMoto(Moto moto) {
        Moto moto1 = motoGetService.getMoto(moto.getPlaca());
        if (Objects.isNull(moto1)) {
            log.info("LA MOTO CON PLACA {} NO ESTA REGISTRADO", moto.getPlaca());
        }
        motoEditService.editMoto(moto);
    }
}
