package com.test_ntt_data.microserviceback.domain.usecase;

import com.test_ntt_data.microserviceback.infrastruture.entry.points.ClientInput;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ClientUseCaseTest {
    ClientUseCase clientUseCase;
    ClientInput clientInput;

    @BeforeEach
    void setUp() {
        clientUseCase = new ClientUseCase();
        clientInput = ClientInput.builder().documentType("C").documentNumber("1077475328").build();
    }

    @Test
    void getClientDocumentTypeFalse() {
        try {
            clientInput = ClientInput.builder().documentType("A").documentNumber("1077").build();
            clientUseCase.getClient(clientInput);
        }catch (IllegalArgumentException e) {
            assertEquals("Tipo de identificacion no permitido: "+ clientInput.getDocumentType(),e.getMessage());
        }

    }

    @Test
    void getClientDocumentFalse() {
        try {
            clientUseCase.getClient(clientInput);
        }catch (NoSuchElementException e) {
            assertEquals("No existe usuario con este numero de cedula: "+ clientInput.getDocumentNumber(),e.getMessage());
        }

    }

    @Test
    void getClient() {
        clientInput = ClientInput.builder().documentType("C").documentNumber("23445322").build();
        assertNotNull(clientUseCase.getClient(clientInput));
    }
}