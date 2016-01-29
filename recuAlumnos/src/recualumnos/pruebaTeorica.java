/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recualumnos;

/**
 *
 * @author Victor
 */
public class pruebaTeorica extends correccionPruebas {
    
    private int numPreguntas;
    private String tiempoPermitido;

    public pruebaTeorica() {
    }

    public pruebaTeorica(int numPreguntas, String tiempoPermitido, String modulo, String turno, int convocatoria, double nota) {
        super(modulo, turno, convocatoria, nota);
        this.numPreguntas = numPreguntas;
        this.tiempoPermitido = tiempoPermitido;
    }

    public int getNumPreguntas() {
        return numPreguntas;
    }

    public void setNumPreguntas(int numPreguntas) {
        this.numPreguntas = numPreguntas;
    }

    public String getTiempoPermitido() {
        return tiempoPermitido;
    }

    public void setTiempoPermitido(String tiempoPermitido) {
        this.tiempoPermitido = tiempoPermitido;
    }

    @Override
    public double corregirPrueba() {
        return (nota*4)/10;
    }
    
    
}

    
    
    
    
    
    
    
    
    
   

