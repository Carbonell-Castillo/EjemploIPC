package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author devcast
 */
public class Patron {
    private String codigo, nombre;
    private int [][] patron;

    public Patron() {
        codigo="";
        nombre="";
        patron= null;
    }

    public Patron(String codigo, String nombre, int[][] patron) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.patron = patron;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[][] getPatron() {
        return patron;
    }

    public void setPatron(int[][] patron) {
        this.patron = patron;
    }
    
    
    
    
    
}
