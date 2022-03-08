/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Mela
 */
public class Rectangulo extends FiguraGeometrica{
    
    public Rectangulo(String tipoFigura){
    super(tipoFigura);
    }
    
    //implementar el metodo de la clase padre
    //no se sobreescribe
    //se implementa
    @Override //muestra una i xq estamos implementando por primera vez la clase padre
    //obtenemos dinamicamente el nombre de la clase sin tener que escribirlo manualmente
    public void dibujar(){
        System.out.println("Se imprime un " + this.getClass().getSimpleName());
    }
}
