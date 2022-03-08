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
public class Escritor extends Empleado {

    final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    //metodo para sobreescribir el metodo de la clase padre
    @Override
    public String obtenerDetalles() { //como el metodo de la clase padre se oculta, debemos usar super
        return super.obtenerDetalles() + ", tipoEscritura " + tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + '}' + " " + super.toString();
    }

    public TipoEscritura getTipoEscritura() {
        return this.tipoEscritura;
    }
}
