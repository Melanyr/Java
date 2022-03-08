
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
public class Ejercicio4 {

    public static void main(String args[]) {

        int numero1;
        int numero2;

        var consola = new Scanner(System.in);
        System.out.println("Proporciona el numero1: ");
        numero1 = Integer.parseInt(consola.nextLine());

        System.out.println("Proporciona el numero2: ");
        numero2 = Integer.parseInt(consola.nextLine());

        if (numero1 >= numero2) {
            System.out.println("El numero mayor es: " + "</br>" + numero1);

        } else {
            System.out.println("El numero mayor es: " + numero2);

        }

    }

}
