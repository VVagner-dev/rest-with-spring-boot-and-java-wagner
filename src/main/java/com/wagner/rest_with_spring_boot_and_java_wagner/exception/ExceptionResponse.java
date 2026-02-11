package com.wagner.rest_with_spring_boot_and_java_wagner.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String menssage, String details) {
}
