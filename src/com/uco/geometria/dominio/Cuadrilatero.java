package com.uco.geometria.dominio;

public class Cuadrilatero extends FiguraGeometrica {
    private int lado1;
    private int lado2;

    public Cuadrilatero(int lado1, int lado2) {
        if (lado1 <= 0 || lado2 <= 0) {
            throw new ValorInvalidoException();
        }

        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return this.lado1 * (double) this.lado2;
    }

    @Override
    public double calcularPerimetro() {
        return (2 * this.lado1) + (2 * this.lado2);
    }
}
