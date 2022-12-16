package com.test_ntt_data.microserviceback.infrastruture.entry.points.controllers;

import com.test_ntt_data.microserviceback.domain.model.Client;
import com.test_ntt_data.microserviceback.domain.usecase.ClientUseCase;
import com.test_ntt_data.microserviceback.infrastruture.driven.adapters.ClientDTO;
import com.test_ntt_data.microserviceback.infrastruture.entry.points.ClientInput;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ClientControllerTest {
    @Mock
    private  ClientUseCase clientUseCase;

    @InjectMocks
    private ClientController controller;
 

    @BeforeEach
    void setUp() {
    }

    @Test
    void getClient() {
       Client client = new Client(1L,"C","1077475328","Jhon","Heiler","Mosquera","Cordoba",323496,"Victoria","Quibdo");
        when(clientUseCase.getClient(any())).thenReturn(client);
        assertNotNull(controller.getClient("C","1077475328"));
    }

// ClientDTO  clientDTO = new ClientDTO("Jhon","Heiler","Mosquera","Cordoba",323496,"Victoria","Quibdo");
}