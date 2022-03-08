
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
public class EjercicioRectangulo {

    public static void main(String args[]) {

        int alto;
        int ancho;
        
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el alto: ");
        alto = Integer.parseInt(consola.nextLine());

        System.out.println("Proporciona el ancho: ");
        ancho = Integer.parseInt(consola.nextLine());
        
        var area = alto * ancho;
        var perimetro = (alto + ancho)*2;
         
        System.out.println("Area: <" + area + ">");
        System.out.println("Perimetro: <" + perimetro + ">");


    }

}
