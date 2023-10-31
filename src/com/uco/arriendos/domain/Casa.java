package com.uco.arriendos.domain;

public class Casa extends Inmueble implements Arrendable, Hipotecable {
    @Override
    public void arrendar() {
        this.arrendado = true;
    }

    @Override
    public void devolver() {
        this.arrendado = false;
    }

    @Override
    public void hipotecar() {
        System.out.println("Se hipotecó");
    }

    @Override
    public String toString() {
        System.out.println("Casa");
        return super.toString();
    }
}
