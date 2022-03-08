/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrathis;

/**
 *
 * @author Mela
 */
public class PalabraThis {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona.nombre = " + persona.nombre);
        System.out.println("persona.apellido = " + persona.apellido);
    }
}

class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {
        //llamada implicita al constructor de la clase Padre(object)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this = " + this); //imprime el objeto que se esta ejecutando en ese momento
        new Imprimir().imprimir(this);
    }
}

class Imprimir {
    
    public Imprimir(){
    super();//el constructor de la clase object (padre) para reservar en memoria(no es necesario este constructor)
    }

    public void imprimir(Persona persona) {
        System.out.println("PErsona desde imprimir " + persona);
        System.out.println("Impresion del objeto actual this " + this);

    }

}
