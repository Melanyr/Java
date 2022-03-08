/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.ventas.tesst;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;

/**
 *
 * @author Mela
 */
public class VentasTest {

    public static void main(String[] args) {

        Producto producto1 = new Producto("Camisa", 50.00);
        Producto producto2 = new Producto("Pantalon", 100.00);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
    }
}
