/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.*;

/**
 *
 * @author Mela
 */
public class TestSobreEscritura {

    public static void main(String[] args) {
//        Gerente gerente1 = new Gerente("Juan", 5000, "Sistemas");
//        System.out.println("gerente1 = " + gerente1.obtenerDetalles());

        //polimorfismo
        Empleado empleado = new Empleado("Juan", 5000);
        //System.out.println("empleado = " + empleado.obtenerDetalles());;
        imprimir(empleado);
        
        Gerente gerente = new Gerente("Karla", 10000, "Contabiliadad");
       // System.out.println("gerente = " + gerente.obtenerDetalles());
       imprimir(gerente);
    }
    
    //polimorfismo: el metodo que se ejecuta es del tipo de la referencia que recibe en la variable.
    //la variable de tipo empleado puede apuntar referencia de la clase hija 
    // tienen relacion entre padre e hijo
    // en memoria y en tiempo de ejecucion esta apuntando a la clase hija
   //multiples comportamientos, dependiendo del tipo al cual esta apuntando en memria 
    public static void imprimir(Empleado empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
    
    
}
