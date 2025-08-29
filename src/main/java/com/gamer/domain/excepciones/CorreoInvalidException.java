package com.gamer.domain.excepciones;

public class CorreoInvalidException extends RuntimeException {
    public CorreoInvalidException() {
        super("Corre electronico invalido");
    }
}
