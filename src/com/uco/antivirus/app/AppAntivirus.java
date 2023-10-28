package com.uco.antivirus.app;

import com.uco.antivirus.dominio.Antivirus;
import com.uco.antivirus.dominio.Aplicacion;
import com.uco.antivirus.dominio.DocumentoExcel;
import com.uco.antivirus.dominio.DocumentoPdf;
import com.uco.antivirus.dominio.DocumentoWord;
import com.uco.antivirus.dominio.Video;

public class AppAntivirus {
    public static void main(String[] args) {
        Antivirus antivirus = new Antivirus();

        DocumentoExcel excel = new DocumentoExcel("hoja1.xlsx", 10);
        DocumentoPdf pdf = new DocumentoPdf("CV.pdf", 40);
        DocumentoWord word = new DocumentoWord("cuento.docx", 35, "Erase🦠una vez...");
        Aplicacion app = new Aplicacion("chrome.exe");
        Video video = new Video("concierto.mp4", 720);

        antivirus.agregar(excel);
        antivirus.agregar(pdf);
        antivirus.agregar(word);
        antivirus.agregar(app);
        antivirus.agregar(video);

        antivirus.escanear();
    }
}
