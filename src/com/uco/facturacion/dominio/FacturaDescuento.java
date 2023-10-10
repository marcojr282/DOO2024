package com.uco.facturacion.dominio;

public class FacturaDescuento extends Factura {
    private short porcentajeDescuento;

    public FacturaDescuento(String cliente, long valor, short porcentajeDescuento) {
        super(cliente, valor);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public long calcularTotal() {
        return this.valor - this.calcularDescuento();
    }

    public long calcularDescuento() {
        return (this.valor * this.porcentajeDescuento) / 100;
    }

    @Override
    public String toString() {
        return "FacturaDescuento{" +
                "porcentajeDescuento=" + porcentajeDescuento +
                ", numero=" + numero +
                ", cliente='" + cliente + '\'' +
                ", valor=" + valor +
                ", fecha=" + fecha +
                '}';
    }
}
