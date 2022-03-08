/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mela
 */
public class CicloFor {
    
    public static void main(String srgs[]){
        
        for(int contador = 0; contador < 3; contador++){
        
        if(contador % 2 != 0){
            continue;// ir a la siguiente iteracion
            }
            System.out.println("contador = " + contador);
        }
    
//        for(int contador = 0; contador < 3; contador++){
//        
//        if(contador % 2 == 0){
//                System.out.println("contador " + contador);
//               // break; //romper el ciclo cuando encontremos lo que queramos 
//            }
//        }
    }
    
}
