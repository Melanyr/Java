
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
public class EjemploTresScanner {

    public static void main(String args[]) {
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);        
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe la carrera");
        var titulo = consola.nextLine();
        System.out.println("Resultado = " + titulo + " "+ usuario);
    }

}
