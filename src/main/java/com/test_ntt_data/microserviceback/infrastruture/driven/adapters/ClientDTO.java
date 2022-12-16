package com.test_ntt_data.microserviceback.infrastruture.driven.adapters;

import com.test_ntt_data.microserviceback.domain.model.Client;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class ClientDTO {
    private  String  firtName;
    private  String  secondName;
    private  String  firtSurname;
    private String   secondSurname;
    private  Integer phone;
    private  String  direction;
    private  String  cityResidence;

    public ClientDTO(String firtName, String secondName, String firtSurname, String secondSurname, Integer phone, String direction, String cityResidence) {
        this.firtName = firtName;
        this.secondName = secondName;
        this.firtSurname = firtSurname;
        this.secondSurname = secondSurname;
        this.phone = phone;
        this.direction = direction;
        this.cityResidence = cityResidence;
    }

    public static ClientDTO fromDomain(Client client){
        return new ClientDTO(
                client.getFirtName(),
                client.getSecondName(),
                client.getFirtSurname(),
                client.getSecondSurname(),
                client.getPhone(),
                client.getDirection(),
                client.getCityResidence()
        );
    }

}
