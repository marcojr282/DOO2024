package com.uco.antivirus.dominio;

public class DocumentoPdf extends Documento {

    public DocumentoPdf(String nombre, double tamano) {
        super(nombre, tamano);
    }

    @Override
    public boolean tieneVirus() {
        return !nombre.endsWith(".pdf");
    }
}
