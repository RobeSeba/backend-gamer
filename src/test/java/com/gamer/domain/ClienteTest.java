package com.gamer.domain;

import com.gamer.domain.excepciones.CorreoInvalidException;
import com.gamer.domain.excepciones.DniInvalidException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    public void validarNumeroDeDni(){
        DniInvalidException ex = assertThrows(DniInvalidException.class, () ->{
            Cliente cliente = new Cliente("nombre","correo","apellido","797987",888);
        });
        System.out.println(ex.getMessage());
    }

    @Test
    public void validarCorreo(){
        CorreoInvalidException ex = assertThrows(CorreoInvalidException.class, () ->{
            Cliente cliente = new Cliente("nombre","correo","apellido","797987",74087457);
        });

    }
}