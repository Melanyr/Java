
package test;

import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
       
        Persona persona1 = new Persona("Juan", 500.00, false);
        //System.out.println("nombre1: " + persona1.getNombre());
        persona1.setNombre("Juan Carlos");
      //  System.out.println("nombre: "+ persona1.getNombre());
        System.out.println("persona1: " + persona1.toString());
    }
}
