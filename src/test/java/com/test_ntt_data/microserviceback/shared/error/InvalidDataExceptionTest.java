package com.test_ntt_data.microserviceback.shared.error;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.validation.BindingResult;

import static org.junit.jupiter.api.Assertions.*;

class InvalidDataExceptionTest {
    private InvalidDataException invalidDataException;
    private BindingResult result;

    @BeforeEach
    void setUp() {
        invalidDataException = new InvalidDataException(result);
        invalidDataException = new InvalidDataException("2",result);
    }

    @Test
    void getResult() {
        assertEquals(result, invalidDataException.getResult());
    }
}