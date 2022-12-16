package com.test_ntt_data.microserviceback.shared.error;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ErrorResponseTest {
private ErrorResponse errorResponse;
    @BeforeEach
    void setUp() {
        errorResponse = new ErrorResponse("1");
        errorResponse = new ErrorResponse();
        errorResponse.setMessage("1");
        errorResponse.setTimestamp(new Date());
        errorResponse.setStatus(200);
        errorResponse.setErrors(Arrays.asList("1", "2", "3"));
    }

    @Test
    void getStatus() {
        assertEquals(200, errorResponse.getStatus());
    }

    @Test
    void getMessage() {
        assertEquals("1", errorResponse.getMessage());
    }

    @Test
    void getTimestamp() {
        assertEquals(new Date().toString(), errorResponse.getTimestamp().toString());
    }

    @Test
    void getErrors() {
        assertEquals("1", errorResponse.getErrors().get(0));
    }

}