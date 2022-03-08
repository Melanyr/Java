
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mela
 */
public class Ejercicio2 {

    public static void main(String args[]) {

        var console = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        var nombre = console.nextLine();

        System.out.println("Proporciona el id: ");
        var id = Integer.parseInt(console.nextLine());

        System.out.println("Proporciona el precio: ");
        var precio = Double.parseDouble(console.nextLine());

        System.out.println("Proporciona el envio Gratuito: ");
        var envioGratuito = Boolean.getBoolean(console.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);

    }
}
