package com.test_ntt_data.microserviceback.domain.model;

import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class Client {
    private  Long id;
    private  String documentType;
    private  String documentNumber;
    private  String  firtName;
    private  String  secondName;
    private  String  firtSurname;
    private  String   secondSurname;
    private  Integer phone;
    private  String  direction;
    private  String  cityResidence;

    public Client(Long id, String documentType, String documentNumber, String firtName, String secondName, String firtSurname, String secondSurname, Integer phone, String direction, String cityResidence) {
        this.id = id;
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.firtName = firtName;
        this.secondName = secondName;
        this.firtSurname = firtSurname;
        this.secondSurname = secondSurname;
        this.phone = phone;
        this.direction = direction;
        this.cityResidence = cityResidence;
    }

}
