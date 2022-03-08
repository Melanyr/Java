/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.mundiisc;

/**
 *
 * @author Mela
 */
public class Orden {

    private final int idOrden;
    private Computadora computadora[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10; //pendiente de inicializar

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {

            this.computadora[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha superado el maximo de computadoras:  = " + this.MAX_COMPUTADORAS);
        }

    }

    public void mostrarOrden() { //correcto lo demas fallo
        System.out.println("Id orden = " + this.idOrden);
        System.out.println("Computadoras de la orden: " + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadora[i]);
        }
    }
}
