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
public class pruebaPractica extends correccionPruebas{
    
    private int numProblemas;
    private String IDE;

    public pruebaPractica() {
    }

    public pruebaPractica(int numProblemas, String IDE, String modulo, String turno, int convocatoria, double nota) {
        super(modulo, turno, convocatoria, nota);
        this.numProblemas = numProblemas;
        this.IDE = IDE;
    }

    public int getNumProblemas() {
        return numProblemas;
    }

    public void setNumProblemas(int numProblemas) {
        this.numProblemas = numProblemas;
    }

    public String getIDE() {
        return IDE;
    }

    public void setIDE(String IDE) {
        this.IDE = IDE;
    }

    @Override
    public double corregirPrueba() {
        return (nota*6)/10;
        
        
    }
    
    
}

