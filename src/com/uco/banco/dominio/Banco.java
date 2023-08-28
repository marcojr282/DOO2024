package com.uco.banco.dominio;

import java.util.List;

public class Banco {
    private String nombre;
    private List<Persona> clientes;

    public String getNombre() {
        return nombre;
    }

    public List<Persona> getClientes() {
        return clientes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
