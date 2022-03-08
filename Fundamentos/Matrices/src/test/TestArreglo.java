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
public class TestArreglo {
    
    public static void main(String[] args) {
        //Afrreglos de tipo primitivo
        // los corchetes indican que la variable es un arrehlo
        //arreglo ya no puede crecer cuando se crea un arreglo, se le indica la cantidad de parametros, no puede crecer dinamicamente.
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        //acceder a cada elemento del arreglo, uno o varios.
        // acceder un elemnto       
        edades[0] = 10;
        System.out.println("edades 0 = " + edades[0]);
        
        edades[1] = 20;
        System.out.println("edades 1 = " + edades[1]);
        
        edades[2] = 30;
        System.out.println("edades 2 = " + edades[2]);
                
        for(int i = 0; i < edades.length; i++){
            System.out.println("edades elemento = " + i + ": "+ edades[i]);
        }
        //crear arreglos con valores directos sintaxis resumida   
        
        String frutas[] = {"Pera", "Mango", "Uva"};
        
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = " + frutas[i]);
        }
       
    }
    
}
