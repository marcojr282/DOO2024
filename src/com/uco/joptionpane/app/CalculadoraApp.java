package com.uco.joptionpane.app;

import com.uco.joptionpane.dominio.Calculadora;

import javax.swing.*;
import java.util.Arrays;

public class CalculadoraApp {
    private static ImageIcon icono = new ImageIcon(CalculadoraApp.class.getResource("logo_uco.jpg"));
    private static final Object[] OPCIONES = Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir").toArray();
    private static final int SUMAR = 0;
    private static final int RESTAR = 1;
    private static final int MULTIPLICAR = 2;
    private static final int DIVIDIR = 3;

    public static void main(String[] args) {
        while (true) {
            int opcionElegida = mostrarMenu();

            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número"));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número"));

            switch (opcionElegida) {
                case SUMAR -> mostrarMensaje("La suma es " + Calculadora.sumar(n1, n2));
                case RESTAR -> {
                    mostrarMensaje("RESTAR");
                }
                case MULTIPLICAR -> {
                    mostrarMensaje("MULTIPLICAR");
                }
                case DIVIDIR -> {
                    mostrarMensaje("DIVIDIR");
                }
            }
        }

    }

//    public static void main(String[] args) {
//        String nombre = pedirDato("Ingresa tu nombre");
//
//        int opcion = JOptionPane.showConfirmDialog(null, "Elige un botón", "POO", JOptionPane.OK_CANCEL_OPTION);
//
//        switch (opcion) {
//            case JOptionPane.YES_OPTION -> mostrarMensaje("SELECCIONÓ SI");
//            case JOptionPane.NO_OPTION -> mostrarMensaje("SELECCIONÓ NO");
//            case JOptionPane.CANCEL_OPTION -> {
//                mostrarMensaje("SELECCIONÓ CANCELAR");
//            }
//            case JOptionPane.CLOSED_OPTION -> mostrarMensaje("SELECCIONÓ CERRAR");
//            default -> mostrarMensaje("QUE PUTAS SELECCIONÓ?");
//        }
//    }

    public static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "POO 2023-02", JOptionPane.ERROR_MESSAGE);
    }

    public static String pedirDato(String mensaje) {
        return (String) JOptionPane.showInputDialog(null, mensaje, "POO",
                JOptionPane.QUESTION_MESSAGE, null, Arrays.asList("Alejandro", "Sofia", "Carlos").toArray(),
                null);
    }

    public static int mostrarMenu() {
        int opcion =  JOptionPane.showOptionDialog(null,
                "¿Qué operación quieres realizar?", "POO",0,
                JOptionPane.QUESTION_MESSAGE, null, OPCIONES, null);

        if (opcion == JOptionPane.CLOSED_OPTION) {
            System.exit(opcion);
        }

        return opcion;
    }
}
