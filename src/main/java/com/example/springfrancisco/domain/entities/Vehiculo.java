package com.example.springfrancisco.domain.entities;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public abstract class Vehiculo implements Acelerar,Frenar, IniciarMarcha,Comparable<Vehiculo>{
    private final String marca;
    private final String placa;
    private final String modelo;
    private final double precio;
}
