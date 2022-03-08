/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import accesodatos.*;

/**
 *
 * @author Mela
 */
public class TestInterface {

    public static void main(String[] args) {

        //Se tiene comportamiento en comun en las interface
        //no tienen caracteristicas en comun
        //se crean objetos de las clases que implementan el comportamiento de las interfaces
        IAccesoDatos datos = new ImplementacionMYSQL();

        //imprimir(datos);
        //datos: con esta variable se aaplica el polimorfismo.
        //datos.listar();
        datos = new ImplementacionOracle();
        // datos.listar();
        imprimir(datos);

    }

    public static void imprimir(IAccesoDatos datos) {
        datos.listar();

    }

}
