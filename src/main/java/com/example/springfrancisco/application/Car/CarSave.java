package com.example.springfrancisco.application.Car;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.entities.Usuario;
import com.example.springfrancisco.domain.service.carro.CarGetService;
import com.example.springfrancisco.domain.service.carro.CarSaveService;
import com.example.springfrancisco.infrastructure.adapter.usuario.UsuarioGetAdapter;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@AllArgsConstructor
@Service
@Slf4j
public class CarSave {
    private final CarSaveService carSaveService;
    private final CarGetService carGetService;

    private final UsuarioGetAdapter usuarioResponseGetService;

    public Carro saveCar(Carro carro, String id) {
        Usuario user = usuarioResponseGetService.getUsuario(id);
        log.info("PERSONA [{}]", user);
        if (!Objects.isNull(user)) {
            Carro carro1 = carGetService.getCar(carro.getPlaca());
                log.info("CARRO REGISTRADO");
                return carSaveService.save(carro);
        }else {
            log.info("PERSONA NO REGISTRADA");
            return null;

        }
    }
}
