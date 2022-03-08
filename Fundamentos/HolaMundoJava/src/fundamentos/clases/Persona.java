package fundamentos.clases;

public class Persona {
    //atributos de la clase
    //no es buena practica colocar el public
    
    public String nombre;
    public String apellido;
    
    public void desplegarInformacion(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
    }
    
}
