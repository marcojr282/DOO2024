package com.uco.arriendos.domain;

import com.uco.arriendos.domain.excepcion.InmuebleArrendadoException;
import com.uco.arriendos.domain.excepcion.InmuebleInexistenteException;
import com.uco.arriendos.domain.excepcion.InmuebleNoArrendableException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Agencia {
    private String nombre;
    private List<Inmueble> inmuebles;

    public Agencia(String nombre) {
        this.nombre = nombre;
        this.inmuebles = new ArrayList<>();
    }

    public void agregar(Inmueble inmueble) {
        this.inmuebles.add(inmueble);
    }

    public boolean arrendar(Inmueble inmueble) {
        if (!inmueble.arrendado && inmueble instanceof Arrendable) {
            ((Arrendable) inmueble).arrendar();
            return true;
        } else {
            if (inmueble instanceof Arrendable) {
                throw new InmuebleArrendadoException();
            }

           throw new InmuebleNoArrendableException();
        }
    }

    public boolean devolver(Inmueble inmueble) {
        if (inmueble.arrendado && inmueble instanceof Arrendable) {
            ((Arrendable) inmueble).devolver();
            return true;
        } else {
            System.out.println("El inmueble a devolver no está arrendado");
        }

        return false;
    }

    public boolean vender(Inmueble inmueble) {
        if (!inmueble.arrendado) {
            this.inmuebles.remove(inmueble);
            return true;
        } else {
            System.out.println("No se puede vender porque está arrendado");
        }

        return false;
    }

    public List<Inmueble> getArrendablesDisponibles() {
        return this.inmuebles.stream().filter
                (inmueble -> !inmueble.arrendado && inmueble instanceof Arrendable)
                .collect(Collectors.toList());
    }

    public List<Inmueble> getArrendados() {
        List<Inmueble> arrendados = new ArrayList<>();

        for (Inmueble inmueble : this.inmuebles) {
            if (inmueble.arrendado) {
                arrendados.add(inmueble);
            }
        }

        return arrendados;
    }
}
