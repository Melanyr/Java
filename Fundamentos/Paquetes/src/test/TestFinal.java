/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Persona;

/**
 *
 * @author Mela
 */
public class TestFinal {
    
    public static void main(String[] args) {
        
        //palabra fibal indica que no se puede modificar su valor
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
    
       // Persona.MI_CONNSTANTE = 5;
       
        System.out.println("mi constante "+ Persona.MI_CONNSTANTE);
    
        final Persona persona1  = new Persona();
        
        //no se modifica la referencia
        //no se puede hcer crear una nueva referencia al objeto con la palabra final
       // persona1= new Persona();
       
       //modificar los valores del atributo que estamos apuntando por la variable
       
       //se mofica el contenido
       persona1.setNombre("Juan");
        System.out.println("persona1 nombre= " + persona1.getNombre());
    persona1.setNombre("Carlos");
        System.out.println("persona1 nombre= " + persona1.getNombre());
    }
}
