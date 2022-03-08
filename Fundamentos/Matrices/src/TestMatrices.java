
import domain.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mela
 */
public class TestMatrices {

    public static void main(String[] args) {
        // re col
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);

        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
////
//        System.out.println("edades 0-0 = " + edades[0][0]);
//        System.out.println("edades 0-1 = " + edades[0][1]);
//        System.out.println("edades 1-0 = " + edades[1][0]);
//        System.out.println("edades 1-1 = " + edades[1][1]);

        //ciclo for aninado uno itera el arreglo de reglon 
        //ciclo for anidado para iterar a columnas.
        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("edades = " + ren + "-" + col + ": " + edades[ren][col]);
            }
        }

        //matrices sintaxis simplificada 
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Frambuesa"}};
        imprimir(frutas);
        //matriz de tipo object
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");
        personas[0][2] = new Persona("Petra");
        personas[1][0] = new Persona("Kamila");
        personas[1][1] = new Persona("Luis");
        personas[1][2] = new Persona("Maria");
        imprimir(personas);
    }

    public static void imprimir(Object matriz[][]) {

        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("matriz = " + ren + "-" + col + ": " + matriz[ren][col]);
            }
        }
    }
}
