package com.example.springfrancisco.infrastructure.api.controller;

import com.example.springfrancisco.application.Car.CarDelete;
import com.example.springfrancisco.application.Car.CarEdit;
import com.example.springfrancisco.application.Car.CarGet;
import com.example.springfrancisco.application.Car.CarSave;
import com.example.springfrancisco.domain.entities.Carro;
import com.example.springfrancisco.domain.service.carro.CarSaveService;
import com.example.springfrancisco.infrastructure.mapper.CarroMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.http.client.MockClientHttpResponse;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.lang.runtime.ObjectMethods;

import static org.hibernate.boot.model.process.spi.MetadataBuildingProcess.build;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(value = CarController.class)
class CarControllerTest {
    @Autowired
    private MockMvc mockMvc;
    private ObjectMapper objectMapper = new ObjectMapper();
    @MockBean
    private  CarSave carSave;

    @Mock
    private CarSaveService carSaveService;

    @MockBean
    private  CarGet carGet;
    @MockBean
    private  CarEdit carEdit;
    @MockBean
    private  CarDelete carDelete;

    @Test
    void getCar() throws Exception {
        Carro car = new Carro();
        car.setColor("blue");
        car.setPrecio(2000d);
        car.setModelo("2021");
        car.setPlaca("123");
        car.setMarca("BMW");
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/car/obtener")
                .param("PLaca","123")
                .accept(MediaType.APPLICATION_JSON);
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        MockHttpServletResponse response = result.getResponse();
        Carro carro = objectMapper.readValue(response.getContentAsString(),Carro.class);

        assertEquals(HttpStatus.OK.value(),response.getStatus());
        assertEquals(car,carro);
    }

    @Test
    void addCar() {
    }

    @Test
    void editcar() {
    }

    @Test
    void deleteCar() {
    }


    public Carro builderCar() {
        Carro car = new Carro();
        car.setColor("blue");
        car.setPrecio(2000d);
        car.setModelo("2021");
        car.setPlaca("123");
        car.setMarca("BMW");
        return car;

    }
}
