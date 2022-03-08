/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static aritmetica.AritmeticaRuntime.divisionRuntime;

/**
 *
 * @author Mela
 */
public class TextExcepcionesRuntime {

    public static void main(String[] args) {
        int resultado = 0;
        resultado = divisionRuntime(10, 0);
        System.out.println("resultado = " + resultado);

    }

}
