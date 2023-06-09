package com.bosonit.formacion.block0702crudvalidation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
public class UnprocessableEntityException extends RuntimeException {
    public UnprocessableEntityException(String message) {
        super("Los campos no cumplen con los requisitos establecidos. \n" + message);
    }
}
