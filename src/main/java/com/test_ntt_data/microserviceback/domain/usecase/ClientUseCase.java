package com.test_ntt_data.microserviceback.domain.usecase;

import com.test_ntt_data.microserviceback.domain.model.Client;
import com.test_ntt_data.microserviceback.domain.model.gateway.ClientRepository;
import com.test_ntt_data.microserviceback.infrastruture.entry.points.ClientInput;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;


@Service
public class ClientUseCase implements ClientRepository{

    public Client getClient(ClientInput clientInput) {
        if (!(Objects.equals(clientInput.getDocumentType(), "P") || Objects.equals(clientInput.getDocumentType(), "C"))){
            throw new IllegalArgumentException("Tipo de identificacion no permitido: " + clientInput.getDocumentType());
        }
        if (!Objects.equals(clientInput.getDocumentNumber(), "23445322")) {
            throw new NoSuchElementException("No existe usuario con este numero de cedula: " +  clientInput.getDocumentNumber());
        }
        List<Client> listClients = CreateClient.createClients();
        return  SearchClent.ListClients(listClients,clientInput.getDocumentNumber());
    }



}
