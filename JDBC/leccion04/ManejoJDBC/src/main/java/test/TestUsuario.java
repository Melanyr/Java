package test;


import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mela
 */
public class TestUsuario {
    public static void main(String[] args) {
            
    UsuarioJDBC usuarioDao = new UsuarioJDBC();

    List<Usuario> usuarios = usuarioDao.select();
        usuarios.forEach(usuario -> {
            System.out.println("usuario = " + usuarios);
        });
        
        Usuario usuario = new Usuario("carlos.Perez", "123");
        usuarioDao.insert(usuario);
            
    }

    
}
