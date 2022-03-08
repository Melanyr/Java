/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.PersonaDAO;
import domain.*;
import java.util.*;

/**
 *
 * @author Mela
 */
public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        
        //Insertando un nuevo objeto de tipo Persona
      //  Persona personaNueva = new Persona("Carlos", "Exparza", "cesparza@mail.com", "55446677");
      //  personaDao.insert(personaNueva);
        
//        Persona personaActualizar = new Persona(1, "Melany", "Rodriguez", "mrodriguezmail.com", "04242504235" );
//        personaDao.update(personaActualizar);
        
        Persona personaDelete = new Persona(6);
        personaDao.delete(personaDelete);
        
        List<Persona> personas = personaDao.select();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
        
    
    }
}
