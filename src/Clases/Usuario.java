package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author devcast
 */
public class Usuario extends Investigador{
    
    private String codigo, contraseña;

    public Usuario() {
        super();
    }
    
    //este es unicamente para crear el administrador
    public Usuario(String codigo, String contraseña) {
        this.codigo = codigo;
        this.contraseña = contraseña;
    }

    //Este se utiliza para crear un usuario con nombre y genero
    public Usuario(String codigo, String contraseña, String nombre, String genero, int NExperimentos) {
        super(nombre, genero, NExperimentos);
        this.codigo = codigo;
        this.contraseña = contraseña;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
    
       
}
