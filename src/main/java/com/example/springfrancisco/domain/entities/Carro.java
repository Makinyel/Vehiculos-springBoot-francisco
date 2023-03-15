package com.example.springfrancisco.domain.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Carro extends Vehiculo{
    private final String color;

    public Carro(String marca,String placa,String modelo, Double precio, String color) {
        super(marca,placa, modelo, precio);
        this.color = color;
    }

    @Override
    public int compareTo(Vehiculo o) {
        return 0;
    }
}
