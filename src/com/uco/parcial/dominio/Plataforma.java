package com.uco.parcial.dominio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Plataforma {
    public static final byte CAPACIDAD = 80;
    private String nombre;
    private List<Terapeuta> terapeutas;

    public Plataforma(String nombre) {
        this.nombre = nombre;
        this.terapeutas = new ArrayList<>();
    }

    public boolean registrarTerapeuta(String nombre, int tarifa) {
        if (this.terapeutas.size() < CAPACIDAD && this.buscar(nombre) == null) {
            Terapeuta terapeutaAAgregar = new Terapeuta(nombre, tarifa);
            this.terapeutas.add(terapeutaAAgregar);
            return true;
        }

        return false;
    }

    public void eliminarTerapeuta(String nombre) {
        this.terapeutas.removeIf(ter -> ter.getNombre().equalsIgnoreCase(nombre));
    }

    public Terapeuta buscar(String nombre) {
        return this.terapeutas.stream()
                .filter(ter -> ter.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElse(null);
    }

    public List<Terapeuta> buscar(int tarifa) {
        return this.terapeutas.stream().filter(ter -> ter.getTarifa() <= tarifa)
                .toList();
    }

    public List<Terapeuta> buscarPorEspecialidad(String especialidad) {
        List<Terapeuta> terapeutasEspecialidad = new ArrayList<>();

        for (Terapeuta terapeuta : this.terapeutas) {
            for (Especialidad esp : terapeuta.getEspecialidades()) {
                if (esp.getNombre().equalsIgnoreCase(especialidad)) {
                    terapeutasEspecialidad.add(terapeuta);
                }
            }
        }

        return terapeutasEspecialidad;
    }

    public List<Terapeuta> getTerapeutasConMasDeDosEspecialidades() {
        return this.terapeutas.stream().filter(ter -> ter.getEspecialidades().size() >= 2).toList();
    }

    public void ordenarTerapeutasPorTarifa() {
        this.terapeutas.sort(Comparator.comparing(Terapeuta::getTarifa).reversed());
    }
}
