package com.uco.banco.app;

import com.uco.banco.dominio.CuentaBancaria;
import com.uco.banco.dominio.Persona;

public class AppBanco {
    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria(123);
        CuentaBancaria miCuenta2 = miCuenta;

        miCuenta.numero = 345;

        System.out.println(miCuenta);
        System.out.println(miCuenta.numero);
        System.out.println(miCuenta2.numero);
    }
}
