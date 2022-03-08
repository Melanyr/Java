/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.IPersonaDAO;
import personas.jdbc.Conexion;
import datos.PersonaDaoJDBC;
import domain.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mela
 */
public class TestManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();

            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
          
            IPersonaDAO personaDao = new PersonaDaoJDBC(conexion);
            
            List<PersonaDTO> personas = personaDao.select();
            for (PersonaDTO persona : personas){
            
                System.out.println("PErsona DTO: " + persona);
            }
           
           conexion.commit();
            
            
            
            

            // Ejemplo 1
//        PersonaDaoJDBC personaDao = new PersonaDaoJDBC();
//        
//        //Insertando un nuevo objeto de tipo PersonaDTO
//      //  PersonaDTO personaNueva = new PersonaDTO("Carlos", "Exparza", "cesparza@mail.com", "55446677");
//      //  personaDao.insert(personaNueva);
//        
////        PersonaDTO personaActualizar = new PersonaDTO(1, "Melany", "Rodriguez", "mrodriguezmail.com", "04242504235" );
////        personaDao.update(personaActualizar);
//        
//        PersonaDTO personaDelete = new PersonaDTO(6);
//        personaDao.delete(personaDelete);
//        
//        List<Persona> personas = personaDao.select();
//        personas.forEach(persona -> {
//            System.out.println("persona = " + persona);
//        });
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al Rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(TestManejoPersonas.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

    }
}
