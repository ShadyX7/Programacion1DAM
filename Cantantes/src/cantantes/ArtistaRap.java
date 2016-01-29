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
public class ArtistaRap extends Artistas {

    private String mejorCancion, nacionalidad;
    private int numAlbums;

    public ArtistaRap() {

    }

    public ArtistaRap(String mejorCancion, String nacionalidad, int numAlbums, String nombre, String sexo, int edad, double altura) {
        super(nombre, sexo, edad, altura);
        this.mejorCancion = mejorCancion;
        this.nacionalidad = nacionalidad;
        this.numAlbums = numAlbums;
    }

    public String getMejorCancion() {
        return mejorCancion;
    }

    public void setMejorCancion(String mejorCancion) {
        this.mejorCancion = mejorCancion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getNumAlbums() {
        return numAlbums;
    }

    public void setNumAlbums(int numAlbums) {
        this.numAlbums = numAlbums;
    }

    @Override

     void mostrarDatos() {
        
        System.out.println("____________________________________________________");
        System.out.println("");
        System.out.println("El nombre del artista es: " + getNombre());
        System.out.println("La edad del artista es: " + getEdad());
        System.out.println("La altura del artista es: " + getAltura() + " m");
        System.out.println("El sexo del artista es: " + getSexo());
        System.out.println("La mejor cancion que tiene es: " + getMejorCancion());
        System.out.println("Nacionalidad del artista: " + getNacionalidad());
        System.out.println("El número de albums que tiene el artista son: " + getNumAlbums());
        System.out.println("");
         }

}
