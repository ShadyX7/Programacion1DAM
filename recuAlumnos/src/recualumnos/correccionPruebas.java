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
public abstract class correccionPruebas   {
    
    private String modulo;
    private String turno;
    private int convocatoria;
    public double nota;

    public correccionPruebas() {
    }

    public correccionPruebas(String modulo, String turno, int convocatoria, double nota) {
        this.modulo = modulo;
        this.turno = turno;
        this.convocatoria = convocatoria;
        this.nota = nota;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getConvocatoria() {
        return convocatoria;
    }

    public void setConvocatoria(int convocatoria) {
        this.convocatoria = convocatoria;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
   public abstract double corregirPrueba();
    



    @Override
    public String toString() {
        return "Prueba{" + "modulo=" + modulo + ", turno=" + turno + ", convocatoria=" + convocatoria + ", nota=" + nota + '}';
    }
    
    
}
