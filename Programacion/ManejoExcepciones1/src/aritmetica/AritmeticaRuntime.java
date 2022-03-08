/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

import excepciones.OperacionExcepcionRuntime;

/**
 *
 * @author Mela
 */
public class AritmeticaRuntime {
    
    public static int divisionRuntime(int numerador, int denominador) {
        if(denominador == 0){
            
            //se reporta la excepcion
            throw new OperacionExcepcionRuntime("Division entre cero");
        }
        return numerador/denominador;
    }
}
