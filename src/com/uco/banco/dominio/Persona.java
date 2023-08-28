package com.uco.banco.dominio;

import java.util.List;

public class Persona {
    public String nombre;
    public String identificacion;
    public List<Credito> creditos;
    public List<CuentaBancaria> cuentas;

    public Persona(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }
}
