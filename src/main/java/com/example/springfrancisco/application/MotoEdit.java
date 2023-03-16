package com.example.springfrancisco.application;
import com.example.springfrancisco.domain.entities.Moto;
import com.example.springfrancisco.domain.service.MotoEditService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@Service
@AllArgsConstructor


public class MotoEdit {
    private MotoEditService motoEditService;
    public void editMoto(Moto moto) {
        motoEditService.editMoto(moto);
    }
}
