/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galaxia;

/**
 *
 * @author dam2
 */
public abstract class Jedi {
    protected String nombre;
    protected String planeta;
    protected String especie;
    protected String rango;
    protected int edad;
    
    public Jedi(){}

    public Jedi(String nombre, String planeta, String especie, String rango, int edad) {
        this.nombre = nombre;
        this.planeta = planeta;
        this.especie = especie;
        this.rango = rango;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
