/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Mela
 */
public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
       //Clases Envolventes de tipos primitivos
       /*
       int - Integer
       long - Long
       float - Float
       double - Double
       boolean - Boolean
       char - Character
       short - Short
       */
     
       //int entero = 10; //tipo primitivo

        //Tipo Boxing
        Integer enteroEnvolvente = 10; //es un object, se obtiene mas informacion
        System.out.println("enteroEnvolvente Entero= " + enteroEnvolvente);
        System.out.println("enteroEnvolvente String= " + enteroEnvolvente.toString());
       
        //tipo Unboxing : extraes el valor primitivo al objeto        
        int entero2 = enteroEnvolvente;
        System.out.println("entero2 = " + entero2); //ya no es un object es de tipo primitivo
    }
}
