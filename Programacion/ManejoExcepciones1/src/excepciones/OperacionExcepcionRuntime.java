/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Mela
 */
public class OperacionExcepcionRuntime  extends RuntimeException{
    public OperacionExcepcionRuntime(String mensaje){
    super(mensaje);
    }
}
