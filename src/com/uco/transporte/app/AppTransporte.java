package com.uco.transporte.app;

import com.uco.taller.agenda.dominio.Contacto;
import com.uco.transporte.dominio.Bicicleta;
import com.uco.transporte.dominio.Carro;
import com.uco.transporte.dominio.Taxi;
import com.uco.transporte.dominio.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class AppTransporte {
    public static void main(String[] args) {
        Vehiculo carro = new Carro();
        Vehiculo taxi = new Taxi();
        Bicicleta bici = new Bicicleta();

        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(carro);
        vehiculos.add(taxi);
        vehiculos.add(bici);

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.acelerar(20);
        }
    }
}
