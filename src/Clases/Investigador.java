package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author devcast
 */
public class Investigador {
    private String nombre, genero;
    private int NExperimentos;

    public Investigador() {
        nombre ="";
        genero ="";
        NExperimentos=0;
    }

    public Investigador(String nombre, String genero, int NExperimentos) {
        this.nombre = nombre;
        this.genero = genero;
        this.NExperimentos = NExperimentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNExperimentos() {
        return NExperimentos;
    }

    public void setNExperimentos(int NExperimentos) {
        this.NExperimentos = NExperimentos;
    }
    
    
    
    
    
}
