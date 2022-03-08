/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import datos.Conexion;
import datos.PersonaDAO;
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
          
            PersonaDAO personaDao = new PersonaDAO(conexion);
            
            Persona cambioPersona = new Persona();
            cambioPersona.setIdPersona(2);
           cambioPersona.setNombre("Melany");
           cambioPersona.setApellido("Rodriguez");
           cambioPersona.setEmail("rmelany@mail.com");
           cambioPersona.setTelefono("11222334455");
           personaDao.update(cambioPersona);
           
           Persona nuevaPersona = new Persona();
           nuevaPersona.setNombre("Carlos");
           nuevaPersona.setApellido("Ramirez");
           personaDao.insert(nuevaPersona);
           
           conexion.commit();
            
            
            
            

            // Ejemplo 1
//        PersonaDAO personaDao = new PersonaDAO();
//        
//        //Insertando un nuevo objeto de tipo Persona
//      //  Persona personaNueva = new Persona("Carlos", "Exparza", "cesparza@mail.com", "55446677");
//      //  personaDao.insert(personaNueva);
//        
////        Persona personaActualizar = new Persona(1, "Melany", "Rodriguez", "mrodriguezmail.com", "04242504235" );
////        personaDao.update(personaActualizar);
//        
//        Persona personaDelete = new Persona(6);
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
