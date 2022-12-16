package com.test_ntt_data.microserviceback.shared.error;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ErrorHandler;
import org.springframework.validation.FieldError;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.yaml.snakeyaml.constructor.DuplicateKeyException;

import java.util.Arrays;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class RestExceptionHandlerTest {
    @InjectMocks
    private RestExceptionHandler restExceptionHandler;
    @InjectMocks
    private NoSuchElementException noSuchElementException;
    @InjectMocks
    private DuplicateKeyException duplicateKeyException;
    @InjectMocks
    private IllegalArgumentException illegalArgumentException;
    @InjectMocks
    private MethodArgumentTypeMismatchException methodArgumentTypeMismatchException;

    private Exception exception;
    @BeforeEach
    void setUp() {
        restExceptionHandler = new RestExceptionHandler();

    }

    @Test
    void handleException() {
        assertNotNull(restExceptionHandler.handleException(noSuchElementException));
    }

    @Test
    void testHandleException() {
        assertNotNull(restExceptionHandler.handleException(duplicateKeyException));
    }

    @Test
    void testHandleException1() {
        assertNotNull(restExceptionHandler.handleException(illegalArgumentException));
    }

    @Test
    void testHandleException2() {
        assertNotNull(restExceptionHandler.handleException(methodArgumentTypeMismatchException));
    }

    @Test
    void testHandleException3() {
        assertNotNull(restExceptionHandler.handleException(exception));
    }

}