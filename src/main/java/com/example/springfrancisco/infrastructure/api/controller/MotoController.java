package com.example.springfrancisco.infrastructure.api.controller;


import com.example.springfrancisco.application.Moto.MotoDelete;
import com.example.springfrancisco.application.Moto.MotoEdit;
import com.example.springfrancisco.application.Moto.MotoGet;
import com.example.springfrancisco.application.Moto.MotoSave;
import com.example.springfrancisco.domain.entities.Moto;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor



public class MotoController {
    private final MotoSave motoSave;
    private final MotoGet motoGet;
    private final MotoEdit motoEdit;
    private final MotoDelete motoDelete;

    @PostMapping
    public ResponseEntity<Moto> savemoto(@RequestBody Moto moto) {
        return new ResponseEntity<>(motoSave.saveMoto(moto), HttpStatus.CREATED);

    }

    @GetMapping
    public ResponseEntity<Moto> getmoto(@RequestParam String placa) {
        return ResponseEntity.ok(motoGet.getMoto(placa));
    }

    @PutMapping
    public void editMoto(@RequestBody Moto moto) {
        motoEdit.editMoto(moto);
    }

    @DeleteMapping
    public void deleteMoto(@RequestParam String placa) {
        motoDelete.deleteMoto(placa);
    }
}