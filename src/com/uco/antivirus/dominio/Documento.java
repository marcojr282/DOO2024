package com.uco.antivirus.dominio;

public abstract class Documento implements Viruseable {
    protected String nombre;
    protected double tamano;

    public Documento(String nombre, double tamano) {
        this.nombre = nombre;
        this.tamano = tamano;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
