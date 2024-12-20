package com.accutive.demo.database.nosql.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Object> handleRuntimeException(RuntimeException ex) {
        String language  = System.getProperty("language");
        // Aqui você pode personalizar a mensagem de retorno
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new ErrorResponse(ErrorMessages.getMessage("USER_NOT_FOUND", language), ex.getMessage())
        );
    }

    // Classe para estrutura de erro personalizada
    public static class ErrorResponse {
        private final String error;
        private final String message;

        public ErrorResponse(String error, String message) {
            this.error = error;
            this.message = message;
        }

        public String getError() {
            return error;
        }

        public String getMessage() {
            return message;
        }
    }
}
