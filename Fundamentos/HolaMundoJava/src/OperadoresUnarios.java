/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mela
 */
public class OperadoresUnarios {
    
    public static void main(String args[]){
       
        int a = 3;
        int b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        boolean c = true;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //incremento
        //1. preincremento(simbolo antes de la variable)
        var e = 3;
        var f = ++e;//primero se incrementa la variable despues se usa el valor
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    
        //2. postincremento       
        var g = 5;
        var h = g++;//primero se utiliza el valor y despues se incrementa
        System.out.println("g = " + g);//teniamos pendiente un incremento
        System.out.println("h = " + h);
        
       //decremento
        //1. predecremento
        var i = 2;
        var j = --i;//primero se incrementa la variable despues se usa el valor
        System.out.println("i = " + i);//ya esta decrementada
        System.out.println("j = " + j);
    
        //2. postincremento       
        var k = 4;
        var l = k--;//primero se utiliza el valor y queda pendiente un incremento
        System.out.println("k = " + k);//teniamos pendiente un incremento
        System.out.println("l = " + l);
    
    
    }
    
}
