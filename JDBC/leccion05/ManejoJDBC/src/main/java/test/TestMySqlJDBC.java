/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mela
 */
public class TestMySqlJDBC {

    public static void main(String[] args) {
        //CAdena de conexion a la base de datos
        //PAso 1..Buscar cadena de conexion de la version y la base de datos que se desa usar.
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

        //linea no requerida pero en las aplicaciones web puede que sea requerida
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            //Paso 2..Declarar un tipo = Connection.
            Connection conexion = DriverManager.getConnection(url, "root", "admin");

            //Paso 3...Crear un objeto statement: permite ejecutar sentencias sobre la tabla de base de datos.
            Statement instruccion = conexion.createStatement();

            //Paso 4...Crear la instruccion a ejecutar
            var sql = "SELECT idpersona , nombre, apellido, email, telefono FROM persona";
            
            //Paso 5...Setear en la interfaz ResultSet la instruccion.
            ResultSet resultado = instruccion.executeQuery(sql);

            //metodo next indica si tenemos un elemento a iterar.
            //Paso 6...Procesar el resultado
            while (resultado.next()) {
                System.out.print(" Id Persona:" + resultado.getInt("idpersona"));
                System.out.print(" Nombre:" + resultado.getString("nombre"));
                System.out.print(" Apellido:" + resultado.getString("apellido"));
                System.out.print(" Email:" + resultado.getString("email"));
                System.out.print(" Telefono:" + resultado.getString("telefono"));
                System.out.println("");

            }
            //Paso 7...Cerrar los objetos que se abrieron
            resultado.close();
            instruccion.close();
            conexion.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(TestMySqlJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
