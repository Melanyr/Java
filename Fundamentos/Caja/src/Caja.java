/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mela
 */
public class Caja {

    int ancho;
    int alto;
    int profundo;

    public Caja() {

    }
    
    public Caja(int ancho, int alto, int profundo){
    
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public int volumen(int alto, int profundo, int ancho){
    
       int volumen = alto * profundo * ancho;
       return volumen;
    }

    
    
}
