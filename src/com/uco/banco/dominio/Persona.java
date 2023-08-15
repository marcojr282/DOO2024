package com.uco.banco.dominio;

public class Persona {
    public String nombre;
    public String identificacion;

    public Persona(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
