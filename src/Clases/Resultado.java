package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author devcast
 */
public class Resultado {
    private int no;
    private int noMuestra;
    private String codigoPatron, fecha, hora, resultado; 

    public Resultado() {
        no=0;
        noMuestra=0;
        codigoPatron="";
        fecha="";
        hora="";
        resultado="";
    }

    public Resultado(int no, int noMuestra, String codigoPatron, String fecha, String hora, String resultado) {
        this.no = no;
        this.noMuestra = noMuestra;
        this.codigoPatron = codigoPatron;
        this.fecha = fecha;
        this.hora = hora;
        this.resultado = resultado;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getNoMuestra() {
        return noMuestra;
    }

    public void setNoMuestra(int noMuestra) {
        this.noMuestra = noMuestra;
    }

    public String getCodigoPatron() {
        return codigoPatron;
    }

    public void setCodigoPatron(String codigoPatron) {
        this.codigoPatron = codigoPatron;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    
    
    
    
}
