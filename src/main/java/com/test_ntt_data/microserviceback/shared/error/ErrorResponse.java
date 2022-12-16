package com.test_ntt_data.microserviceback.shared.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
    public class ErrorResponse {

        private int status;

        private String message;

        private Date timestamp;

        List<String> errors;

        ErrorResponse(String message) {
            this.message = message;
        }

    }