package com.test_ntt_data.microserviceback.domain.usecase;

import com.test_ntt_data.microserviceback.domain.model.Client;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CreateClientTest {
    Client client1;
    Client client2;
    Client client3;

    @BeforeEach
    void setUp() {
        client1 = new Client(1L,"C","23445322","Jhon","Heiler","Mosquera", "Cordoba",67189123,"victoria 2","Medellin");
    }

    @Test
    void createClients() {
        List<Client> actual = new ArrayList<>();
        actual.add(client1);
        List<Client> expected = CreateClient.createClients();
        assertEquals(actual.get(0).toString(), expected.get(0).toString());
    }
}