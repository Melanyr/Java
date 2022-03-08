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
public class TestColeccionesGenericas {

    public static void main(String[] args) {

        //Listas generics
        //indicar el tipo con el cual vamos a trabajar lado izquierdo.
        //Indicar el tipo con el cual vamos a crea el cual vamos a crear nuestro objeto de tipo arrayList (derecho) no es necesario indicar el tipo, basta con decir que sera generico <> con esos simbolos 
        //notacion de diamante
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        String elemento = miLista.get(0);
        //System.out.println("elemento = " + elemento);
        //imprimir(miLista);

        //Set generics
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        //imprimir(miSet);

        //Map Generics 
        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");

        String elementoMapa = miMapa.get("valor1");
        //System.out.println("elemento = " + elementoMapa);
        
         // recuoperar todas las llaves
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection<String> coleccion) {
//        for (String elemento : coleccion) {
//            System.out.println("elemento = " + elemento);
//        }

        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

    }
}
