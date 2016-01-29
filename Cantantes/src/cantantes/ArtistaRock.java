/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantantes;

/**
 *
 * @author Victor
 */
public class ArtistaRock extends Artistas{
    
    private String instrumento,comida;
    private int gananciasConcierto;
    
    public ArtistaRock(){
        
        
    }

    public ArtistaRock(String instrumento, String comida, int gananciasConcierto, String nombre, String sexo, int edad, double altura) {
        super(nombre, sexo, edad, altura);
        this.instrumento = instrumento;
        this.comida = comida;
        this.gananciasConcierto = gananciasConcierto;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getGananciasConcierto() {
        return gananciasConcierto;
    }

    public void setGananciasConcierto(int gananciasConcierto) {
        this.gananciasConcierto = gananciasConcierto;
    }
    
    
    @Override
    
      void mostrarDatos(){  
        
    System.out.println("____________________________________________________");
    System.out.println("");
    System.out.println("El nombre del artista es: " + getNombre());
    System.out.println("La edad del artista es: " + getEdad());
    System.out.println("La altura del artista es: " + getAltura() + " m");
    System.out.println("El sexo del artista es: " + getSexo());
    System.out.println("El artista de Rock toca el/la: " + getInstrumento());
    System.out.println("La comida favorita del artista es: " + getComida());
    System.out.println("El artista gana: " + getGananciasConcierto() + "$ por concierto.");
    System.out.println("");
    
}  
    
}
