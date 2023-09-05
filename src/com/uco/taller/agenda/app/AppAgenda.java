package com.uco.taller.agenda.app;

import com.uco.taller.agenda.dominio.Agenda;

public class AppAgenda {
    public static void main(String[] args) {
        Agenda miAgenda = new Agenda();

        miAgenda.crearContacto("Julian", "Osorio", 300);
        miAgenda.crearContacto("Jakeline", "Urrea", 310);
        miAgenda.crearContacto("Natalia", "Botero", 320);
        miAgenda.crearContacto("David", "Ocampo", 313);
        miAgenda.crearContacto("Alejandro", "Ramirez", 311);
        miAgenda.crearContacto("Daniela", "Botero", 314);
        miAgenda.crearContacto("Natalia", "Angarita", 312);

        miAgenda.ordenarAlfabeticamente().forEach(c -> System.out.println(c.getNombre() + " " + c.getApellido()));

        System.out.println("POR APELLIDO");

        miAgenda.buscarPorApellido("botEro").forEach(c -> System.out.println(c.getNombre()));
    }
}
