/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import domain.PersonaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import personas.jdbc.Conexion;
import static personas.jdbc.Conexion.close;
import static personas.jdbc.Conexion.getConnection;

/**
 *
 * @author Mela
 */
public interface IPersonaDAO {

    public List<PersonaDTO> select() throws SQLException;

    public int insert(PersonaDTO persona) throws SQLException;
    
    public int update(PersonaDTO persona)throws SQLException;
    
    public int delete(PersonaDTO persona) throws SQLException;
}
