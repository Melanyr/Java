/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

/**
 *
 * @author Mela
 */
public class TestColecciones {

    public static void main(String[] args) {
        //implementamos la interface List
        // creamos objeto que implemente la interface list ArrayList
        //puede crecer dinamicamente
        //guarda un orden duplica elementos
        //las listas
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        //imprimir(miLista);

//es vez de usar esto creamos un metodo mas generico aplicamos el polimorfismo
//        for (Object elemento : miLista) {
//            System.out.println("elemento = " + elemento);
//        }
//
//        miLista.forEach(elemento -> {
//            System.out.println("elemento = " + elemento);
//        });
        //Interface Set 
        // no guarda un orden
        //no se puede repetir elementos
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        //imprimir(miSet);

        //Interface Map  
        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");

        String elemento = (String) miMapa.get("valor1");
        //System.out.println("elemento = " + elemento);
        
         // recuoperar todas las llaves
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection coleccion) {
//        for (Object elemento : coleccion) {
//            System.out.println("elemento = " + elemento);
//        }

        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

    }
}
