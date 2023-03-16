package com.example.springfrancisco.infrastructure.event.listen;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;

@Component
@Slf4j
public class Receiver {

    public static String RECEIVE_METHOD_NAME = "receiveMessage";
    public void receiveMessage(byte[] message) {
        log.info("Receiving message: [{}]", new String(message, StandardCharsets.UTF_8));
    }

}
