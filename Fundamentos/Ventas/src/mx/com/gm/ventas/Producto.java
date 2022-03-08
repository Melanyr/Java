/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.ventas; //correcto

/**
 *
 * @author Mela
 */
public class Producto {

    private final int idProducto; //correcto
    private String nombre;  //correcto
    private double precio;  //correcto
    private static int contadorProductos; //correcto

    private Producto() {
        this.idProducto = this.contadorProductos++; //correcto o ++Producto,contadorPRoductos
    }

    public Producto(String nombre, double precio) {
        //para llamar a un constuctor interno debe ser en la primera linea
        this();
        this.nombre = nombre;
        this.precio = precio;
        //new Producto(); esto no se hace se hace lo de this y se pone al inicio
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{idProducto=").append(idProducto);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }

}
