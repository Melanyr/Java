/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporreferencia;

import fundamentos.clases.Persona;

/**
 *
 * @author Mela
 */
public class PaasoPorReferencia {

    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        System.out.println("persona1 nombre = " + persona1.nombre);
        // cambiarValor(persona1);
        persona1 = cambiarValor(persona1);
        System.out.println("PErsona cambio nombre " + persona1.nombre);
    }

    //podemos acceder a objetos en otros metodos por medio de paso por valor por referencia(en memoria)
//    public static void cambiarValor(Persona persona){
//    persona.nombre = "Karla";
//    
//    }
//    public static Persona cambiarValor(Persona persona) {
//        persona.nombre = "Karla";
    //       return persona;
//    }
    public static Persona cambiarValor(Persona persona) {
        if (persona == null) {
            return null;
        }

        persona.nombre = "Karla";
        return persona;

    }
}
