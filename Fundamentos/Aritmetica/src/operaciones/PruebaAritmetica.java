/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author Mela
 */
public class PruebaAritmetica {

    public static void main(String[] args) {

       var a = 10;
       var b = 5;
        miMetodo();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("valor a = " + aritmetica1.a );
        System.out.println("valor b = " + aritmetica1.b);
//        aritmetica1.a = 3;
//        aritmetica1.b = 2;
//        aritmetica1.sumar();
//        
//        int resultado = aritmetica1.sumarConRetorno();
//        System.out.println("resultadoConRetorno = " + resultado);   
//    
//        int resultadoArgumento = aritmetica1.sumarConArgumentos(5, 3);   
//        System.out.println("resultadoArgumento = " + resultadoArgumento);
//constructor con argumentos
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("valor a = " + aritmetica2.a);
        System.out.println("valor b = " + aritmetica2.b);

    }

    public static void miMetodo() {
        System.out.println("Otro netodo");
    }

}
