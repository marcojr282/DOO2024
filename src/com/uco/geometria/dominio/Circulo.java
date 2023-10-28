package com.uco.geometria.dominio;

public class Circulo extends FiguraGeometrica {
    private int radio;

    public Circulo(int radio) {
        if (radio <= 0) {
            throw new ValorInvalidoException();
        }

        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * this.radio;
    }
}
