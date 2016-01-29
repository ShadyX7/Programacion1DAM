/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastillasmayte;

import static pastillasmayte.PastillasMayte.Posicion;

/**
 *
 * @author Victor
 */
public class PastillasMayte {

    /**
     * @param args the command line arguments
     */
    public static String Posicion(String PastillasEstorban[]) {

        char dias[] = {'L', 'M', 'X', 'J', 'V', 'S', 'D'}; //Dias de la semana

        int pastillasNoUtiliza[] = new int[7]; //Llenar pastillas que no utiliza Mayte en otra bote de pastillas

        for (int i = 0; i < PastillasEstorban.length; i++) {
            for (int j = 0; j < 7; j++) {

                char pastillaca = PastillasEstorban[i].charAt(j);// Por cada pastilla (char), observa si el dia es : '*'

                if (pastillaca == '*') {
                    pastillasNoUtiliza[j] = pastillasNoUtiliza[j] + 1; //si es '*' se suma una pastilla que no se tomo

                }
            }
        }

        int DiaFinal = 0; //Buscar el primer dia dentro del array en el cual Mayte tiene que comprar mas pastillas 
        int pastillacaMenor = PastillasEstorban.length;

        for (int i = 0; i < pastillasNoUtiliza.length; i++) { //Recoje las pastillas  que no utiliza Mayte y se las suma al dia que debere tomar una pastilla en el dia correspondiente

            if (pastillasNoUtiliza[i] < pastillacaMenor) {
                DiaFinal = i;
                pastillacaMenor = pastillasNoUtiliza[i];

            }
        }

        return "Mayte debera empezar un nuevo bote de pastillas, el dia: " + dias[DiaFinal] + " de la semana: " + (pastillacaMenor + 1);
    }

    public static void main(String[] args) {
        //No se implementa el Scanner porque ya hemos implementado la clase "Posicion"
        //Scanner entrada = new Scanner(System.in);
        //System.out.print(" De cuantas semanas dispone Mayte? "); Se declara el numero de semanas que Mayte va guardando sus pastillas.
        int NumPosiciones;
        int NumSemanas;

        // A través de dos arrays Unidimensionales se irán recorriendo los 7 dias de cada semana.
        //  NumSemanas = entrada.nextInt();
        String BotePastillas[] = new String[4];

        BotePastillas[0] = "*******";
        BotePastillas[1] = "*--*--*";
        BotePastillas[2] = "*-*-*-*";
        BotePastillas[3] = "--*---*";

        System.out.println(Posicion(BotePastillas));//llama al metodo "Posicion".

        String NuevoBotePastillas[] = new String[3];

        NuevoBotePastillas[0] = "-------";
        NuevoBotePastillas[1] = "*****-*";
        NuevoBotePastillas[2] = "*******";

        System.out.println(Posicion(NuevoBotePastillas));//llama al metodo "Posicion".

    }

}
