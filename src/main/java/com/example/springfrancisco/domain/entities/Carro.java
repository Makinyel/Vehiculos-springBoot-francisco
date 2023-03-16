package com.example.springfrancisco.domain.entities;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class Carro extends Vehiculo{
    private String color;

    public Carro(String marca, String placa, String modelo, Double precio, String color) {
        super(marca, placa, modelo, precio);
        this.color = color;
    }

}
