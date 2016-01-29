/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor
 */
public class CorreccionPruebas {

    String modulo, turno, convocatoria;
    double teorica, practica, notaFinal;

    public CorreccionPruebas() {
    }

    public CorreccionPruebas(String modulo, String turno, String convocatoria, double teorica, double practica, double notaFinal) {
        this.modulo = modulo;
        this.turno = turno;
        this.convocatoria = convocatoria;
        this.teorica = teorica;
        this.practica = practica;
        this.notaFinal = notaFinal;
    }

    void moduloAlumno(String newModulo) {

        switch (newModulo) {
            case "1":
                modulo = "Programación";
                break;
            case "2":
                modulo = "Base de datos";
                break;
            case "3":
                modulo = "Fol";

            default:
                System.out.println("El módulo debe ser: Programación, Base de datos o Fol.");

        }

    }

    void turnoAlumno(String newTurno) {

        switch (newTurno) {
            case "1":
                modulo = "Diurno";
                break;
            case "2":
                modulo = "Vespertino";
                break;

            default:
                System.out.println("El turno debe ser: Diurno o Vespertino.");

        }

    }

    void convocaAlumno(String newConvocatoria) {

        switch (newConvocatoria) {
            case "1":
                modulo = "Ordinaria";
                break;
            case "2":
                modulo = "Extraordinaria";
                break;

            default:
                System.out.println("La convocatoria debe ser: Ordinaria o Extraordinaria.");

        }

    }

    double pruebaPractica(int newPractica) {

        if (newPractica >= 0 && newPractica <= 10) {
            practica = newPractica;
        }

        return (practica * 6) / 10;
    }

    double pruebaTeorica(int newTeorica) {

        if (newTeorica >= 0 && newTeorica <= 10) {
            teorica = newTeorica;
        }

        return (teorica * 4) / 10;
    }

    double notaGeneral(double newNotaGeneral) {

        newNotaGeneral = teorica + practica;

        return newNotaGeneral;

    }

    String notaOyente() {

        return "CV";
    }

    public int MoisesResuelvePorMi() {

        return 10;

    }

}
