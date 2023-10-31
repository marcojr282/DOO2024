package com.uco.arriendos.domain;

public abstract class Inmueble {
    protected String codigo;
    protected String direccion;
    protected long valorVenta;
    protected long valorArriendo;
    protected boolean arrendado;

    @Override
    public String toString() {
        return "{" +
                "direccion='" + direccion + '\'' +
                ", valorVenta=" + valorVenta +
                ", valorArriendo=" + valorArriendo +
                ", arrendado=" + arrendado +
                '}';
    }
}
