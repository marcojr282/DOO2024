package com.uco.transporte.app;

import com.uco.transporte.dominio.Bicicleta;
import com.uco.transporte.dominio.BicicletaMontana;
import com.uco.transporte.dominio.Carro;
import com.uco.transporte.dominio.Taxi;
import com.uco.transporte.dominio.Vehiculo;

import java.util.ArrayList;
import java.util.List;

public class AppTransporte {
    public static void main(String[] args) {
        Vehiculo carro = new Carro("Renault", "Sandero");
        Vehiculo taxi = new Taxi("Hyundai", "Tucson", "SotraRetiro");
        Bicicleta bici = new BicicletaMontana("Trek", "Marlin 7");

        List<Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(carro);
        vehiculos.add(taxi);
        vehiculos.add(bici);

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.toString());
        }
    }
}
