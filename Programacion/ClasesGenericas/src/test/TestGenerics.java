
package test;

import genericos.ClaseGenerica;

/**
 *
 * @author Mela
 */
public class TestGenerics {
    public static void main(String[] args) {
        //para usar la clase generica debemos indicar el tipo que vamos a usar internamente
    
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Juan");
        objetoString.obtenerTipo();
    }
}
