package com.uco.antivirus.dominio;

public class DocumentoExcel extends Documento {
    private static final int TAMANO_MINIMO = 20;

    public DocumentoExcel(String nombre, double tamano) {
        super(nombre, tamano);
    }

    @Override
    public boolean tieneVirus() {
        return tamano < TAMANO_MINIMO;
    }
}
