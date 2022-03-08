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
public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    //sobreescritura
    @Override //SE RECOMIENDA USAR PARA QUE EL COMPILADOR SEPA WUE ESTTAMOS SOBREESCRIBIENDO UN METODO DE LA CLSSE PADRE
    public String obtenerDetalles() {
        //super para volver acceder a los metodos de la clase padre
        return super.obtenerDetalles() + ", departamento: " + this.departamento;
    }

}
