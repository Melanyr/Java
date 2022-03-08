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
public class Aritmetica {

    int a;
    int b;
    
    //El constructor vacio, si no lo crear el compilador lo hara por ti. PAra poder instanciar el objeto.
    public Aritmetica(){
        System.out.println("Ejecutando construvtor");
    }
    
    //Sobrecarga de constructores cuando tiene mas de un constructor la clase

    public Aritmetica(int a, int b){
    
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    
    public void sumar(){
        int resultado = a + b;
        System.out.println("Resultado "+ resultado);
    }
    
    public int sumarConRetorno(){
        int resultado = a + b;
        return resultado;
    }
    
//    public int sumarConArgumentos(int arg1, int arg2){
//        a = arg1;
//        b = arg2;
//        
//        return sumarConRetorno();
 //}
    
    //this indica que es un atributo de la clase
    
    public int sumarConArgumentos(int a, int b){
    
        this.a = a;
        this.b = b;
        return this.sumarConRetorno();
    }
}
