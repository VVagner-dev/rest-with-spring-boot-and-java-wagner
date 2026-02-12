package com.wagner.rest_with_spring_boot_and_java_wagner.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperetionException extends RuntimeException {

    public UnsupportedMathOperetionException(String menssage) {
        super(menssage);
    }

}
