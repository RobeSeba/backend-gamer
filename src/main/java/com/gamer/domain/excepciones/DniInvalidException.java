package com.gamer.domain.excepciones;

public class DniInvalidException extends  RuntimeException{
    public DniInvalidException() {
        super("Error al ingresar el numero de dni");
    }
}
