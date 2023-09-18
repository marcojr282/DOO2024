package com.uco.parcial.dominio;

import java.util.List;

public class Terapeuta {
    private String nombre;
    private int tarifa;
    private List<Especialidad> especialidades;

    public Terapeuta(String nombre, int tarifa) {
        this.nombre = nombre;
        this.tarifa = tarifa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }
}
