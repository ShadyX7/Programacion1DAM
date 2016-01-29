/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cantantes;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Cantantes {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String nombre, sexo, mejorCancion, nacionalidad, colorOjos, colorPelo, instrumento, comida, nomMejorMezcla, mejorColabo, estiloMusica;
        int edad, numAlbums, numCoches, gananciasConcierto, opcion, pesoDj;
        double altura;
        boolean salir = false;

        DatosCantantes baseDatos = new DatosCantantes();

        while (salir == false) {

            System.out.println("Elija una opción: ");
            System.out.println("");
            System.out.println("1. Insertar Artista del Rap.");
            System.out.println("2. Insertar Artista del Pop. ");
            System.out.println("3. Insertar Artista del Rock.");
            System.out.println("4. Insertar Dj.");
            System.out.println("5. Borrar Artista.");
            System.out.println("6. Ver datos.");
            System.out.println("7. Salir.");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Inserta el nombre del artista: ");
                    nombre = entrada.nextLine();

                    System.out.println("Inserta la edad del artista: ");
                    edad = entrada.nextInt();

                    System.out.println("Inserta la altura del artista (cm): ");
                    altura = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println("Inserta el sexo del artista: ");
                    sexo = entrada.nextLine();

                    System.out.println("Inserta la mejor cancion del artista: ");
                    mejorCancion = entrada.nextLine();

                    System.out.println("Inserta la nacionalidad del artista: ");
                    nacionalidad = entrada.nextLine();

                    System.out.println("Inserta el número de albums que tiene el artista: ");
                    numAlbums = entrada.nextInt();

                    ArtistaRap rap1 = new ArtistaRap(mejorCancion, nacionalidad, numAlbums, nombre, sexo, edad, altura);
                    baseDatos.addCantante(rap1);

                    break;

                case 2:
                    System.out.println("Inserta el nombre del artista: ");
                    nombre = entrada.nextLine();

                    System.out.println("Inserta la edad del artista: ");
                    edad = entrada.nextInt();

                    System.out.println("Inserta la altura del artista (cm): ");
                    altura = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println("Inserta el sexo del artista: ");
                    sexo = entrada.nextLine();

                    System.out.println("Inserta el color de ojos del artista: ");
                    colorOjos = entrada.nextLine();
                    
                    
                    System.out.println("Inserta el color de pelo del artista: ");
                    colorPelo = entrada.nextLine();
                    

                    System.out.println("Inserta el número de coches que tiene el artista: ");
                    numCoches = entrada.nextInt();
                   
                    
                    ArtistaPop pop1 = new ArtistaPop(colorOjos, colorPelo, numCoches, nombre, sexo, edad, altura);
                    baseDatos.addCantante(pop1);

                    break;

                case 3:
                    System.out.println("Inserta el nombre del artista: ");
                    nombre = entrada.nextLine();

                    System.out.println("Inserta la edad del artista: ");
                    edad = entrada.nextInt();

                    System.out.println("Inserta la altura del artista (cm): ");
                    altura = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println("Inserta el sexo del artista: ");
                    sexo = entrada.nextLine();

                    System.out.println("Inserta el instrumento que toca el artista: ");
                    instrumento = entrada.nextLine();

                    System.out.println("Inserta la comida favorita del artista: ");
                    comida = entrada.nextLine();
                    

                    System.out.println("Inserta las ganancias del artista por concierto: ");
                    gananciasConcierto = entrada.nextInt();

                    ArtistaRock rock1 = new ArtistaRock(instrumento, comida, gananciasConcierto, nombre, sexo, edad, altura);
                    baseDatos.addCantante(rock1);

                    break;

                case 4:
                    System.out.println("Inserta el nombre del artista: ");
                    nombre = entrada.nextLine();

                    System.out.println("Inserta la edad del artista: ");
                    edad = entrada.nextInt();

                    System.out.println("Inserta la altura del artista (cm): ");
                    altura = entrada.nextInt();
                    entrada.nextLine();

                    System.out.println("Inserta el sexo del artista: ");
                    sexo = entrada.nextLine();

                    System.out.println("Inserta el nombre de la mejor mezcla: ");
                    nomMejorMezcla = entrada.nextLine();

                    System.out.println("Inserta el nombre de la mejor colaboración: ");
                    mejorColabo = entrada.nextLine();

                    System.out.println("Inserta el estilo de música que hace el Dj: ");
                    estiloMusica = entrada.nextLine();
                    

                    System.out.println("Inserta el peso del Dj: ");
                    pesoDj = entrada.nextInt();

                    ArtistaDj dj1 = new ArtistaDj(nomMejorMezcla, mejorColabo, estiloMusica, pesoDj, nombre, sexo, edad, altura);
                    baseDatos.addCantante(dj1);

                    break;

                case 5:

                    System.out.println("Inserte el nombre del artista que desea eliminar: ");
                    nombre = entrada.nextLine();
                    baseDatos.borrarCantante(nombre);

                    break;

                case 6:

                    baseDatos.mostrarDatos();
                    entrada.nextLine();

                    break;
                case 7:

                    System.out.println("Nos vemos!");
                    salir = true;
                    break;

                default:
                    throw new AssertionError();
            }
        }
    }

}
