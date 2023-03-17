package com.example.springfrancisco.application;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.PublishRabbitService;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RabbitPublish {

    public final PublishRabbitService publishRabbitService;
    public void  publishRabbit(Carro messege) throws JsonProcessingException {
        publishRabbitService.publishRabbit(messege);
    }
}
