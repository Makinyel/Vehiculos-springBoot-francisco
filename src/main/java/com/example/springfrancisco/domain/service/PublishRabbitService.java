package com.example.springfrancisco.domain.service;

import com.example.springfrancisco.domain.entities.Carro;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface PublishRabbitService {

    void publishRabbit(Carro publisher) throws JsonProcessingException;
}
