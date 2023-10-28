package com.uco.antivirus.dominio;

public class DocumentoWord extends Documento {
    private String contenido;

    public DocumentoWord(String nombre, double tamano, String contenido) {
        super(nombre, tamano);
        this.contenido = contenido;
    }

    @Override
    public boolean tieneVirus() {
        return contenido.contains("🦠");
    }
}
