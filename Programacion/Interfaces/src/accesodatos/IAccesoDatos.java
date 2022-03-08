
package accesodatos;

public interface IAccesoDatos {
    
    //los atributos deben tener valor 
    //xq no tienen constructor y los metodos son abstractos
    int MAX_REGISTRO = 10;
    
    //todos los metodos son abstractos
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
}
