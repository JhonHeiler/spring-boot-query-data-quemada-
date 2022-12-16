package com.test_ntt_data.microserviceback.infrastruture.entry.points.controllers;


import com.test_ntt_data.microserviceback.domain.usecase.ClientUseCase;
import com.test_ntt_data.microserviceback.infrastruture.driven.adapters.ClientDTO;
import com.test_ntt_data.microserviceback.infrastruture.entry.points.ClientInput;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;



@RestController
@RequestMapping("api/cliente")
public class ClientController {
    private final ClientUseCase clientUseCase;

    public ClientController(ClientUseCase clientUseCase) {
        this.clientUseCase = clientUseCase;
    }


    @GetMapping
    public ClientDTO getClient(@Valid @RequestParam String documentType, @RequestParam String documentNumber/*, BindingResult result*/) {
        ClientInput validClient = new ClientInput();
        validClient.setDocumentType(documentType);
        validClient.setDocumentNumber(documentNumber);
        return ClientDTO.fromDomain(clientUseCase.getClient(validClient));

    }

}
