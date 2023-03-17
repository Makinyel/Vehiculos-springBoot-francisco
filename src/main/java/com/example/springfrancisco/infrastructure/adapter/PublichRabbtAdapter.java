package com.example.springfrancisco.infrastructure.adapter;

import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.PublishRabbitService;
import com.example.springfrancisco.infrastructure.event.publish.Publisher;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PublichRabbtAdapter implements PublishRabbitService {

    private final Publisher pser;
    private final ObjectMapper objectMapper;

    @Override
    public void publishRabbit(Carro publisher) throws JsonProcessingException {
        pser.sendMessage(objectMapper.writeValueAsString(publisher));
    }
}
