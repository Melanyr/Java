
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
public class EjercicioCinco {
    public static void main(String srgs[]){
        
        System.out.println("Proporciona un valor entre 0 y 10");
        var consola = new Scanner(System.in);
        var valor = Integer.parseInt(consola.nextLine());
               
        switch(valor){ 
        
            case 9: case 10:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
            default:
                if(valor == 0 || valor < 6){
                    System.out.println("F");
                }else{
                    System.out.println("Valor Desconocido");
                }
        }
    }
    
}
