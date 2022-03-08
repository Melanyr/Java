/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mela
 */
public class OperadoresAritmeticos {

    public static void main(String args[]) {

        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("Resultado suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);

        resultado = a / b;
        System.out.println("resultado modulo = " + resultado);

        var resultado2 = 3.0 / b;
        System.out.println("resultado multiplicacion = " + resultado2);

        resultado = a % b;
        System.out.println("resultado residuo division = " + resultado);

        if (b % 2 == 0) {
            System.out.println("Es un numero par");
        } else {
            System.out.println("Es numero impar");
        }

    }

}
