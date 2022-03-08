
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
public class ConversionTipos {
    public static void main(String args[]){
    //Convertir tipo String a un tipoint
    
    String edad1 = "20";
    int variableInt = Integer.parseInt(edad1);
    System.out.println("Edad uno= " + variableInt);
    
    var edad2 = Integer.parseInt("10");
        System.out.println("Edad dos = " + (edad2 + 1 ));

         var valorPI = Double.parseDouble("3.1416");
        System.out.println("Edad dos = " + valorPI);

      /*  var consola = new Scanner(System.in);
        System.out.println("Ingrese tu edad");
        edad2 = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad2);
        */
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter);

    }
    
}
