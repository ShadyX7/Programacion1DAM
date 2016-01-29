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
public class ArtistaPop extends Artistas{
    
    private String colorOjos,colorPelo;
    private int numCoches;
    
    public ArtistaPop(){
        
    }

    public ArtistaPop(String colorOjos, String colorPelo, int numCoches, String nombre, String sexo, int edad, double altura) {
        super(nombre, sexo, edad, altura);
        this.colorOjos = colorOjos;
        this.colorPelo = colorPelo;
        this.numCoches = numCoches;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public int getNumCoches() {
        return numCoches;
    }

    public void setNumCoches(int numCoches) {
        this.numCoches = numCoches;
    }
    
    
    @Override
    
     void mostrarDatos(){  
        
    System.out.println("____________________________________________________");
    System.out.println("");  
    System.out.println("El nombre del artista es: " + getNombre());
    System.out.println("La edad del artista es: " + getEdad());
    System.out.println("La altura del artista es: " + getAltura() + " m");
    System.out.println("El sexo del artista es: " + getSexo());
    System.out.println("El color de los ojos es: " + getColorOjos());
    System.out.println("El color del pelo es: " + getColorPelo());
    System.out.println("El artista tiene: " + getNumCoches() + " coches.");
    System.out.println("");
    }  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
