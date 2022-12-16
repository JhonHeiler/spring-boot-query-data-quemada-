package com.test_ntt_data.microserviceback.domain.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
   private Client client;

    @BeforeEach
    void setUp() {
     client = new Client(2L,"C","1077475328",
         "Jhon","Heiler","Mosquera","Cordoba",
         323496,"Victoria","Quibdo");

    client = new Client();
    client.setId(1L);
    client.setDocumentType("C");
    client.setDocumentNumber("1077475328");
    client.setFirtName("Jhon");
    client.setSecondName("Heiler");
    client.setFirtSurname("Mosquera");
    client.setSecondSurname("Cordoba");
    client.setPhone(323496);
    client.setDirection("Victoria");
    client.setCityResidence("Quibdo");
    }

    @Test
    void getId() {
        assertEquals(1L, client.getId());
    }

    @Test
    void getDocumentType() {
     assertEquals("C", client.getDocumentType());
    }

    @Test
    void getDocumentNumber() {
     assertEquals("1077475328", client.getDocumentNumber());
    }

    @Test
    void getFirtName() {
     assertEquals("Jhon", client.getFirtName());
    }

    @Test
    void getSecondName() {
     assertEquals("Heiler", client.getSecondName());
    }

    @Test
    void getFirtSurname() {
     assertEquals("Mosquera", client.getFirtSurname());
    }

    @Test
    void getSecondSurname() {
     assertEquals("Cordoba", client.getSecondSurname());
    }

    @Test
    void getPhone() {
     assertEquals(323496, client.getPhone());
    }

    @Test
    void getDirection() {
     assertEquals("Victoria", client.getDirection());
    }

    @Test
    void getCityResidence() {
     assertEquals("Quibdo", client.getCityResidence());
    }

}