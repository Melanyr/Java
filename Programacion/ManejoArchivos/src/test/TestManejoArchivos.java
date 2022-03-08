/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static manejoArchivos.ManejoArchivos.*;

/**
 *
 * @author Mela
 */
public class TestManejoArchivos {

    public static void main(String[] args) {
        var nombreArchivo = "Prueba.txt";

        //CrearArchivo
        //crearArchivo(nombreArchivo);
        
        //Modificar archivo
        //escribirArchivo(nombreArchivo, "Hola desde Java");
        //Se agrega lo ultimo, es decir se sobreescribe informacion
        
        // escribirArchivo(nombreArchivo, "Hola");
        anexarArchivo(nombreArchivo, "Hola desde Java");
        anexarArchivo(nombreArchivo, "adios");
        
        //Leer Archivo
        leerArchivo(nombreArchivo);

        //Eliminar Archivo
    }
}
