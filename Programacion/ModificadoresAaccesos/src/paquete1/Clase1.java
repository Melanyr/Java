/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Mela
 */
class Clase1 {

    //public puede aplicar para todos
    //nos permite acceder a los elementos desde cualquier otra clase
    //Modificador de acceso public    
//    public String atributoPublico = "Valor atributo publico";
//
//    public Clase1() {
//        System.out.println("Constructor publico");
//    }
//
//    public void metodoPublico() {
//        System.out.println("Metodo Publico");
//    }
    //Modificador de acceso protected    
    //se puede acceder tanto de la clase padre como de la clase hija, y si estamos dentro del mismo paquete
//    protected String atributoProtected = "Valor atributo protected";
//
//    protected Clase1() {
//        System.out.println("Constructor protected");
//    }
//    
//    public Clase1(String args) {
//        System.out.println("Constructor protected");
//    }
//    
//    
//    protected void metodoProtected() {
//        System.out.println("Metodo protected");
//    }
    //Modificador default
    //si se le agrega a la clase PADRE, LAS CLASES HIJAS NO Podran heredar nada si no se encuentran en el mismo paquete
    //o package es exactamente lo mismo 
//    String atributoDefault = "Valor atributo default";
//    Clase1() {
//        System.out.println("Constructor Default");
    //   }
//    void metodoDefault() {
//        System.out.println("Metodo protected");
//    }
    //modifiador private
    private String atributoPrivate = "Valor atributo private";

    private Clase1() {
        System.out.println("Constructor Private");
    }

    public Clase1(String argumento) {
        this();
        System.out.println("Constructor Publico");
    }

    private void metodoPrivate() {
        System.out.println("Metodo private");
    }

    public String getAtributoPrivate() {
        return this.atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }

}
