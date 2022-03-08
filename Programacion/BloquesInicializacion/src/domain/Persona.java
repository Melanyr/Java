/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Mela
 */
public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    //bloque de inicializacion estatico, se ecuta antes del construtor
    //se ejecuta la primera vez que se carga en memoria la clase
    static {
        System.out.println("Ejecucuion loque estatico");
        ++Persona.contadorPersonas;
    }

    //bloque de inicializacion no estatco, se ejecuta antes del constructor de la clse, y despues de metodos estaticos.
    //abre y cierras {}
    //Se ejecuta cada vez que se crea un uevo objeto.
    {
        System.out.println("Ejecucion bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++;
    }

    public Persona() {
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }

}
