package com.uco.transporte.dominio;

public class Taxi extends Carro {
    private String empresa;
    private int capacidad;
    private int pasajerosActuales;

    @Override
    public void acelerar(double cantidad) {
        super.acelerar(cantidad);
        System.out.println("Acelerando como Taxi 🚕");
    }

    public void subirPasajero() {
        if (this.pasajerosActuales < capacidad) {
            this.pasajerosActuales++;
        }
    }

    public void bajarPasajero() {
        if (this.pasajerosActuales > 0) {
            this.pasajerosActuales--;
        }
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }
}
