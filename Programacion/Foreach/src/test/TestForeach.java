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
public class TestForeach {
    public static void main(String[] args) {
       //int edades[] = new int[4];
       //sintaxis resumida
       
       //arreglos de tipo enteros con foreach
       int edades[] = {5, 6, 8, 9};
       //para definir un foreach se debe crear una variable del tipo del arreglo, esta vva contener los elementos del mismo
       //dos punto (:) seguido de en nombre del arreglo que queremos iterar
       
       //Desventajas: no se tiene un contador, por lo tanto si se quiere imprimir el indice en la que esta no se va poder
       //si se requiere el indice se debe usar el tradicional for\
       
       for(int edad: edades){
           System.out.println("edad = " + edad);
       }
       
       //Crear un arregllo de tipo persona
       //arreglos no se puede usar la palabra var
       Persona personas[] = {new Persona("Juan"), new Persona("Karla"), new Persona("Carlos")};
       for(Persona person: personas){
           System.out.println("person = " + person);
       }
       
    }
}
