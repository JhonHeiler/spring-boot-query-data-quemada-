package com.test_ntt_data.microserviceback.domain.usecase;

import com.test_ntt_data.microserviceback.domain.model.Client;
import com.test_ntt_data.microserviceback.infrastruture.entry.points.ClientInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SearchClent {

    private static final String IDENTIFICADO = "23445322";


    public static Client ListClients(List<Client> listClients, String document) {
        List<Client> newClient = new ArrayList<>();
        if (!Objects.equals(document, IDENTIFICADO)) {
            return null;
        } else {
            for (Client client : listClients) {
                if (Objects.equals(client.getDocumentNumber(), IDENTIFICADO)) {
                    newClient.add(client);
                }
            }
        }
        return newClient.get(0);
    }


}
