package fundamentos.clases;

public class PruebaPersonas {

    public static void main(String[] args) {

        Persona persona1 = new Persona(); //se manda a llamar el constructor
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();//llamar al metodo
       
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);//fundamentos.clases.Persona@15aeb7ab paquete, clase @ memoria del objeto(direccion de memoria segun la posicion)
    }

}
