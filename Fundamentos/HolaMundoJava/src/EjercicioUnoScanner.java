
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
public class EjercicioUnoScanner {

    public static void main(String args[]) {

        System.out.println("Proporciona el título");
        Scanner consola = new Scanner(System.in);
        String titulo = consola.nextLine();

        System.out.println("Proporciona el autor");
        String autor = consola.nextLine();

        System.out.println(titulo + " fue escrito por " + autor);
    }
}
