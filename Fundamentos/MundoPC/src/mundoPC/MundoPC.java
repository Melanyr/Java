/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundoPC;

import com.gm.mundiisc.Computadora;
import com.gm.mundiisc.Monitor;
import com.gm.mundiisc.Orden;
import com.gm.mundiisc.Raton;
import com.gm.mundiisc.Teclado;

/**
 *
 * @author Mela
 */
public class MundoPC {

    public static void main(String[] args) {
//        
//               Producto producto1 = new Producto("Camisa", 50.00);
//        Producto producto2 = new Producto("Pantalon", 100.00);

//        Orden orden1 = new Orden();
//        orden1.agregarProducto(producto1);
//        orden1.agregarProducto(producto2);
//        orden1.mostrarOrden();
        Monitor monitor1 = new Monitor("Samsung", 100);
        Teclado teclado1 = new Teclado("USB", "Razer");
        Raton raton1 = new Raton("USB", "Razer");
        Computadora computadora1 = new Computadora("Computadora1", monitor1, teclado1, raton1);

        Monitor monitor2 = new Monitor("Samsung", 100);
        Teclado teclado2 = new Teclado("USB", "Razer");
        Raton raton2 = new Raton("USB", "Corsair");
        Computadora computadora2 = new Computadora("Computadora2", monitor2, teclado2, raton2);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
    }
}
