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
public class ArtistaDj extends Artistas {
    
    private String nomMejorMezcla, mejorColabo,estiloMusica;
    private int pesoDj;
    
    
    ArtistaDj(){
        
    }

    public ArtistaDj(String nomMejorMezcla, String mejorColabo, String estiloMusica, int pesoDj, String nombre, String sexo, int edad, double altura) {
        super(nombre, sexo, edad, altura);
        this.nomMejorMezcla = nomMejorMezcla;
        this.mejorColabo = mejorColabo;
        this.estiloMusica = estiloMusica;
        this.pesoDj = pesoDj;
    }

    public String getNomMejorMezcla() {
        return nomMejorMezcla;
    }

    public void setNomMejorMezcla(String nomMejorMezcla) {
        this.nomMejorMezcla = nomMejorMezcla;
    }

    public String getMejorColabo() {
        return mejorColabo;
    }

    public void setMejorColabo(String mejorColabo) {
        this.mejorColabo = mejorColabo;
    }

    public String getEstiloMusica() {
        return estiloMusica;
    }

    public void setEstiloMusica(String estiloMusica) {
        this.estiloMusica = estiloMusica;
    }

    public int getPesoDj() {
        return pesoDj;
    }

    public void setPesoDj(int pesoDj) {
        this.pesoDj = pesoDj;
    }
    
    
    @Override
    
    void mostrarDatos(){  
        
    System.out.println("____________________________________________________");
    System.out.println("");
    System.out.println("El nombre del artista es: " + getNombre());
    System.out.println("La edad del artista es: " + getEdad());
    System.out.println("La altura del artista es: " + getAltura() + " m");
    System.out.println("El sexo del artista es: " + getSexo());
    System.out.println("Nombre de la mejor mezcla: " + getNomMejorMezcla());
    System.out.println("Mejor colaboración con: " + getMejorColabo());
    System.out.println("El Dj utiliza el/la: " + getEstiloMusica() + " como estilo de música.");
    System.out.println("Peso del Dj: " + getPesoDj() + " Kg");
    System.out.println("");
        
}  
    
}
