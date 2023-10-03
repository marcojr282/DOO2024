package com.uco.transporte.dominio;

public class Carro extends Vehiculo {

    @Override
    public void acelerar(double cantidad) {
        this.velocidad += cantidad;
        System.out.println("Acelerando como Carro 🚙");
    }
}
