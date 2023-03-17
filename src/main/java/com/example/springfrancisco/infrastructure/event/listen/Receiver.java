package com.example.springfrancisco.infrastructure.event.listen;

import com.example.springfrancisco.application.Car.CarGet;
import com.example.springfrancisco.domain.entities.Carro;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

@AllArgsConstructor
@Component
@Slf4j
public class Receiver {

    private final ObjectMapper objectMapper;
    private final CarGet carGet;

    public static String RECEIVE_METHOD_NAME = "receiveMessage";
    public void receiveMessage(byte[] message) throws JsonProcessingException {
            String mesajeconvertido = new String(message, StandardCharsets.UTF_8);
            Carro carro = objectMapper.readValue(mesajeconvertido, Carro.class);
            log.info("Receiving message: [{}]",
                    objectMapper.writeValueAsString(carGet.getCar(carro.getPlaca())));
    }
}
