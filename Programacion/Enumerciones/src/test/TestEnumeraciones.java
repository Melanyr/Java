/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import enumeracion.Continentes;
import enumeracion.Dias;

/**
 *
 * @author Mela
 */
public class TestEnumeraciones {

    public static void main(String[] args) {
//        System.out.println("Dias 1 = " + Dias.LUNES);
//        indicarDiaSemana(Dias.DOMINGO);
        System.out.println("Continente no. 4 " + Continentes.AMERICA);
        System.out.println("No. Paises en el 4to continente: " + Continentes.AMERICA.getPaises());

    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {

            case LUNES:
                System.out.println("Primer dia de la semana");
                break;

            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
                
            case MIERCOLES:
                System.out.println("Tercer dia d ela semana");
                break;
                
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;

            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
                
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;

            default:
                System.out.println("Ultimo dia de la semana");

        }

    }
}
