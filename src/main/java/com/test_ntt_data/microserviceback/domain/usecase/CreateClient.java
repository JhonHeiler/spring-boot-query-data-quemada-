package com.test_ntt_data.microserviceback.domain.usecase;

import com.test_ntt_data.microserviceback.domain.model.Client;

import java.util.ArrayList;
import java.util.List;

public class CreateClient {
    public static List<Client> createClients(){
        List<Client> listClients = new ArrayList<>();
        Client client1 = new Client(1L,"C","23445322","Jhon","Heiler","Mosquera", "Cordoba",67189123,"victoria 2","Medellin");
        Client client2 = new Client(2L,"T","23445377","Felipe","limt","Ortiz", "Cordoba",67189123,"victoria 2","Bogota");
        Client client3 = new Client(3L,"P","23445388","Andres","renet","Balderrama", "Cordoba",67189123,"victoria 2","Quibdo");
        listClients.add(client1);
        listClients.add(client2);
        listClients.add(client3);
        return listClients;
/*
        if (usuarioRepository.exists(Example.of(usuarioExample))) {
            throw new DuplicateKeyException("Ya existe usuario con nombre: " + usuario.getNombre());
        }
        */

    }


}
