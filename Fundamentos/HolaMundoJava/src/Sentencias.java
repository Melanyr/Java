/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mela
 */
public class Sentencias {

    public static void main(String args[]) {
        var condition = true;

       /* if (condition) {
            System.out.println("Condicion verdadera");

        } else {
            System.out.println("Condicion falsa");
        }*/

        var numero = 2;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "Numero uno";

        } else if (numero == 2) {
            numeroTexto = "Numero dos";
        } else if (numero == 3) {
            System.out.println("Numero tres");
        } else if (numero == 4) {
            numeroTexto = "Numero cuatro";
        } else {
            numeroTexto = "Numero no encontrado";
          

        }
        System.out.println("numeroTexto: " + numeroTexto);
      
        
    }

}
