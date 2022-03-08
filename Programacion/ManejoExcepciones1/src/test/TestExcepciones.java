/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

/**
 *
 * @author Mela
 */
public class TestExcepciones {

    public static void main(String[] args) {
//        int resultado = 0;
//        
//        try{
//        resultado = 10/0;
//        }catch(Exception e){
//            System.out.println("Ocurrió un error = ");
//          //imprime la pila de excepciones
//        e.printStackTrace(System.out);
//        
//        }
//        System.out.println("resultado = " + resultado);
//  

//usando nuestras propias excepciones
        int resultado = 0;

        try {
            resultado = division(10, 0);
        } catch (OperacionExcepcion e) {
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
        } catch (Exception e) {
            System.out.println("Ocurrió un error de tipo excepcion: ");
            //imprime la pila de excepciones
            //e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("resultado = " + resultado);

    }
}
