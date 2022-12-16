package com.test_ntt_data.microserviceback.infrastruture.entry.points;

import lombok.*;

import javax.validation.constraints.NotNull;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Builder(toBuilder = true)
@AllArgsConstructor
public class ClientInput {
    @NotNull(message = "El tipo de documento puede ser Nulo")
    private  String documentType;
    @NotNull(message = "El numero de documento no puede ser Nulo")
    private  String documentNumber;


}
