/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Mela
 */
public class Usuario {
    private int idusuario;
    private String usuarioname;
    private String password;

    public Usuario() {
    }

    public Usuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public Usuario(int idusuario, String usuarioname, String password) {
        this.idusuario = idusuario;
        this.usuarioname = usuarioname;
        this.password = password;
    }

    public Usuario(String usuarioname, String password) {
        this.usuarioname = usuarioname;
        this.password = password;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuarioname() {
        return usuarioname;
    }

    public void setUsuarioname(String usuarioname) {
        this.usuarioname = usuarioname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idusuario=" + idusuario + ", usuarioname=" + usuarioname + ", password=" + password + '}';
    }
    
    
    
}
