/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.ventas;

/**
 *
 * @author Mela
 */
public class Orden {

    private int idOrden; //correcto
    private Producto productos[]; //Incorrecto se tenia que colocar un arreglo de tipo object
    private static int contadorOrdenes; //correcto
    public static final int MAX_PRODUCTOS = 10; //correcto
    private int contadorProductos; //se creo nueva

    public Orden() {
        //this.idOrden = 1; lo hice mal
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];//correcto
        //this.contadorOrdenes = this.idOrden++; incorrecto esto no iba se hacia como la primera linea
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            //this.productos = new Producto(); malo, se usa la variable d arrehlo
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de productos:  = " + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0; //bien
        for (int i = 0; i < this.contadorProductos; i++) {
            //total = productos[i] + productos[i - 1]; // definir una variable local llamada producto
            Producto producto = this.productos[i];
            total += producto.getPrecio();// total = total + producto.getPrecio()
            //total += this,productos[i].getPrecio(); agregar en una linea se obtoiene el precio de los productos y en una suma , tiene el total de todos los precios 
           // return total; incorrecto

        }
        return total; //correcto

    }

    public void mostrarOrden() { //correcto lo demas fallo
            System.out.println("Id orden = " + this.idOrden);
            double totalOrden = this.calcularTotal();
            System.out.println("Total de la Orden = $" + totalOrden);
            System.out.println("Productos de la orden: ");
            for (int i = 0; i < this.contadorProductos; i++) {
                System.out.println(this.productos[i]);
        }
    }
}
