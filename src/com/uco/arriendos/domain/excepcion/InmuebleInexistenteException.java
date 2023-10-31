package com.uco.arriendos.domain.excepcion;

public class InmuebleInexistenteException extends RuntimeException {
    public InmuebleInexistenteException() {
        super("El inmueble buscado no existe");
    }
}
