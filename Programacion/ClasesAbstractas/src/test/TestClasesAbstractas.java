/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

/**
 *
 * @author Mela
 */
public class TestClasesAbstractas {

    public static void main(String[] args) {

        //Polimorfismo
        FiguraGeometrica figura = new Rectangulo("Rectangulo");//upCasting
        //Polimorfismo en tiempo de ejecucion se define si se toma el metodo del padre en este caso no se puede xq es abstracto o del hijo       
        figura.dibujar(); //implementando un metodo a partir de uno abstracto

    }
}
