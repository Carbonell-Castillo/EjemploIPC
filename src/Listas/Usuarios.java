package Listas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Clases.Usuario;
import java.util.ArrayList;

/**
 *
 * @author devcast
 */
public class Usuarios {
    ArrayList<Usuario> usuarios;
    
    public Usuarios(){
        this.usuarios = new ArrayList<>();
    }
    
    public void AgregarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }
    
    public void imprimirUsuarios(){
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println("Codigo: "+usuarios.get(i).getCodigo()+" Contraseña: "+usuarios.get(i).getContraseña());
        }
    }
    
    public boolean ValidarUsuario(String codigo, String contraseña){
        boolean validacion=false;
        
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCodigo().equals(codigo) && usuarios.get(i).getContraseña().equals(contraseña)) {
                validacion=true;
            }
        }
        
        return validacion;
    }
    
    public int getCantidad(){
        return usuarios.size();
    }
    
    public Usuario getUsuarioIndice(int i){
        return usuarios.get(i);
    }
    
    
    
}
