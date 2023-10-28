package com.uco.geometria.dominio;

public class ValorInvalidoException extends RuntimeException {
    public ValorInvalidoException() {
        super("No se puede poner un número menor que cero");
    }
}
