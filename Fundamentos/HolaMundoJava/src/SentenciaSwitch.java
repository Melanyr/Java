/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mela
 */
public class SentenciaSwitch {

    public static void main(String args[]) {

     /*   var numero = 1;
        var numeroTexto = "Numero desconocido";

        switch (numero) {

            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;

            default:
                numeroTexto = "Caso no encontrado";

        }

        System.out.println("numeroTexto = " + numeroTexto);

       var tipoMotor = 3;

        switch (tipoMotor) {
            case 0:
                System.out.println("No hay establecido un valor definido para el tipo de bomba");
                break;

            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;

            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;

            case 3:
                System.out.println("La bomba es una bomba de hormigón");
                break;

            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;

            default:
                System.out.println("No existe un valor válido para tipo de bomba");

        }
*/
     
     var mes = 1;
     var estacion = "Estacion desconocida";
     
     switch(mes){
         case 1: case 2: case 12:
             estacion = "Invierno";
             break;
             
         case 3: case 4: case 5:
             estacion = "Primavera";
             break;
             
         case 6: case 7: case 8:
             estacion = "Verano";
             break;
        
         case 9: case 10: case 11:
             estacion = "Otono";
             break;
         default:
             estacion = "No existe estacion";
     }
     
        System.out.println("respuesta " + estacion);
    }

}
