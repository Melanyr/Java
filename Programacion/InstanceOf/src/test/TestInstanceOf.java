/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.*;

/**
 *
 * @author Mela
 */
public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado);
        empleado = new Gerente("Karla", 10000, "Contabiliadad");
        //determinarTipo(empleado);
    
    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) { //si el tipo que esta apuntando en memoria es de tipo gerente 
            System.out.println("Es de tipo Gerente");
            // no tenemos acceso al metodo de depertamento directamente, xq no se encuentra dentro de la clase Empleado.
            //convertimos empleado a una variable de tipo hijo
            //primera forma
            Gerente gerente = (Gerente) empleado;//se crea una varibale y se convierte.
            gerente.getDepartamento(); //ya podemos acceder al departamento sin problma.
            
            //segunda formaa
            ((Gerente) empleado).getDepartamento();
        }
        
        
        else if(empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
            // si es una clase pare no podemos acceder a los metodos de clase hijas.
            System.out.println("empleado = " + empleado.getNombre());
            
        }else if(empleado instanceof Object){
            System.out.println("Es de tipo Object");
            empleado.toString();
        }
        
        //si usamosif en todos es necesario usarlo de menor a generico
        //nos responde que si al mismo tipo o si estamos usando tipos mas genericos
    }

}
