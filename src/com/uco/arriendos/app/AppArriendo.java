package com.uco.arriendos.app;

import com.uco.arriendos.domain.Agencia;
import com.uco.arriendos.domain.Apartamento;
import com.uco.arriendos.domain.Casa;
import com.uco.arriendos.domain.Lote;

public class AppArriendo {
    public static void main(String[] args) {
        Casa casa = new Casa();
        Apartamento apartamento = new Apartamento();
        Lote lote = new Lote();

        Agencia agencia = new Agencia("BEMSA");

        agencia.agregar(casa);
        agencia.agregar(apartamento);
        agencia.agregar(lote);

        agencia.arrendar(casa);
        agencia.arrendar(lote);

        System.out.println(agencia.getArrendablesDisponibles());
    }
}
