package com.gamer.domain;

import com.gamer.domain.excepciones.DniInvalidException;

public class Cliente {
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private Integer dni;

    public Cliente(String nombres, String correo, String apellidos, String telefono, Integer dni) {

        String regexDni="^\\d{8}$";
        if (dni == null || !dni.toString().matches(regexDni) ){
            throw new DniInvalidException();
        }
        this.nombres = nombres;
        this.correo = correo;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public Integer getDni() {
        return dni;
    }
}
