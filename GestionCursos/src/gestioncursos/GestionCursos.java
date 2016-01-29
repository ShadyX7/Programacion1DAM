
package gestioncursos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

          

public class GestionCursos
{

    public GestionCursos()
    {
    }

    public static void main(String args[]) throws FileNotFoundException
    {
        Curso dam = new Curso();
        String salida = dam.setMaterias("Programacion,Entornos de Desarrollo,FOL");
        System.out.println(salida);
        dam.setNumPlazas(3);
        Alumno reciente = new Alumno(dam.getMaterias(), "Lopez", "Victor", "12345678N");
        dam.matricularAlumno(reciente);
        int notes[][] = {
            {
                6, 8, 7, 6, 8
            }, {
                5, 4, 8, 4, 7
            }, {
                5, 6, 8, 7, 5
            } 
        };
        File archivo = new File("src/gestioncursos/DatosAlumnos.txt");
        PrintWriter imprime = new PrintWriter(archivo);
        Alumno reciente2 = new Alumno(dam.getMaterias(), "Hernandez", "David", "12345678J");
        dam.matricularAlumno(reciente2);
        Alumno reciente3 = new Alumno(dam.getMaterias(), "Veredas", "Sergio", "147258369H");
        dam.matricularAlumno(reciente3);
        Alumno reciente4 = new Alumno(dam.getMaterias(), "Conde", "Diego", "125879654S");
        imprime.println(dam.matricularAlumno(reciente4) ? "Esta inscrito" : "No esta inscripto");
        imprime.println(dam.numPlazas());
        dam.ordenarAlumnos();
        dam.getAlumno(1).setValores(notes);
        dam.getAlumno(2).setValores(notes);
        dam.getAlumno(3).setValores(notes);
        imprime.println(dam.getAlumnosConMatricula());
        imprime.println(dam.CuentaPlaza());
        imprime.println(dam.getAlumno(1).getNota("Programacion"));
        imprime.close();
    } 
}


