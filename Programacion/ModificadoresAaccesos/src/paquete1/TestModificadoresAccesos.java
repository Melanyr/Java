/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete1.Clase1;
import paquete1.ClaseHija;

/**
 *
 * @author Mela
 */
public class TestModificadoresAccesos {

    public static void main(String[] args) {
//instanciar objeto con public, llamar metodo
//        Clase1 clase1 = new Clase1();
//        //System.out.println("clase1 = " + clase1);
//        System.out.println("Calse1  = " + clase1.atributoPublico);
//        clase1.metodoPublico();

//instanciar objeto con protected.
        //Clase1 clase1 = new Clase1("publico"); //no se puede usar xq esta marcado como protegido
//        ClaseHija claseHija = new ClaseHija();
//        System.out.println("claseHija = " + claseHija);
//    
// 
//instanciar objeto default
//   Clase1 clase1 = new Clase1();
//   clase1.atributoDefault = ("Cambio desde la prueba");
//        System.out.println("clase1 atributo default = " + clase1.atributoDefault );
//        clase1.metodoDefault();
//Instanciar objeto private
        Clase1 clase1 = new Clase1("publico");
        clase1.setAtributoPrivate("Cambio valor Atributo");
        System.out.println("clase1 = " + clase1.getAtributoPrivate());
    }

}
