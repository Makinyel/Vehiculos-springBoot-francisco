package com.example.springfrancisco.infrastructure.api.controller;

import com.example.springfrancisco.application.Car.CarDelete;
import com.example.springfrancisco.application.Car.CarEdit;
import com.example.springfrancisco.application.Car.CarGet;
import com.example.springfrancisco.application.Car.CarSave;
import com.example.springfrancisco.domain.entities.Carro;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@Slf4j
@RequestMapping(path = "/car")
public class CarController {

    private final CarSave carSave;
    private final CarGet carGet;
    private final CarEdit carEdit;
    private final CarDelete carDelete;

    @GetMapping()
    public ResponseEntity<Carro> getCar(@RequestParam String placa) {
            return ResponseEntity.ok(carGet.getCar(placa));
        }

    @PostMapping
    public ResponseEntity<Carro> addCar(@RequestBody Carro car,@RequestHeader("id") String id) {
        log.info("ID---"+id);
        log.info(car.getPlaca());
        return new ResponseEntity<>(carSave.saveCar(car,id), HttpStatus.CREATED);

    }

    @PutMapping
    public void editcar(@RequestBody Carro car) {
        carEdit.editCar(car);
    }

    @DeleteMapping
    public void deleteCar(@RequestParam String placa) {
        carDelete.deleteCar(placa);
    }


}
