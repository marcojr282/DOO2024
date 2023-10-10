package com.uco.facturacion.dominio;

import java.time.LocalDateTime;

public abstract class Factura {
    private static int facturasCreadas;
    protected int numero;
    protected String cliente;
    protected long valor;
    protected LocalDateTime fecha;

    public Factura(String cliente, long valor) {
        facturasCreadas++;

        this.numero = facturasCreadas;
        this.cliente = cliente;
        this.valor = valor;
        this.fecha = LocalDateTime.now();
    }

    public abstract long calcularTotal();
}
