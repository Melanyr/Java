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
public class TestConversionObjetos {

    public static void main(String[] args) {
        Empleado empleado;
        //DownCasting

        //asignamos una referencia de tipo hijo hacia la clase padre
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        //System.out.println("empleado = " + empleado);

        //se lalaman los metodos que tengan en comun
       // System.out.println("" + empleado.obtenerDetalles()); //aqui el compilador no sabe que metodo se definio, hasta que se ejecuta. 

        //downcasting: tipo padre a tipo hija
        //convierte a un tipo de la clase padre a un tipo de la clase hija 
        //((Escritor) empleado).getTipoEscritura();
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();

        //upcasting: tipo hija a tipo padre
        Empleado empleado2 = escritor;
        empleado2.obtenerDetalles();
        System.out.println("" + empleado2.obtenerDetalles()); 

    }

}
