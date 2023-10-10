package com.uco.facturacion.dominio;

public class FacturaIva extends Factura {
    private short iva;

    public FacturaIva(String cliente, long valor, short iva) {
        super(cliente, valor);
        this.iva = iva;
    }

    @Override
    public long calcularTotal() {
        return this.valor + this.calcularIva();
    }

    public long calcularIva() {
        return (this.valor * this.iva) / 100;
    }

    @Override
    public String toString() {
        return "FacturaIva{" +
                "iva=" + iva +
                ", numero=" + numero +
                ", cliente='" + cliente + '\'' +
                ", valor=" + valor +
                ", fecha=" + fecha +
                '}';
    }
}
