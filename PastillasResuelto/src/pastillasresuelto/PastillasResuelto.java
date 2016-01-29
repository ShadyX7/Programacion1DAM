/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pastillasresuelto;

import static pastillasresuelto.PastillasResuelto.diaNumero;

/**
 *
 * @author Victor
 */
public class PastillasResuelto {

public static String diaNumero(String pastiSobrantes[]){
 
 //Listado de los días de la semana
 char diasSemana [] = {'L','M','X','J','V','S','D'};
 
 //Llenar el pastillero con las pastillas sin usar
 int PastillasSinUsar [] = new int [7];
 
 for (int i = 0; i < pastiSobrantes.length ; i++) {
 for (int j = 0; j < 7; j++) {
 //Chequea por cada char del Strin si es un '*'
 char pasti = pastiSobrantes[i].charAt(j);
 
 if(pasti == '*'){
 // de ser un '*', suma uno a ese día de la semana
 PastillasSinUsar[j] = PastillasSinUsar[j]+1;
 }
 }//que recorre los dias de la semana 
 }
 
 
 /* //Lista de pastillas acumuladas
 for (int i = 0; i < PastillasSinUsar.length ; i++) {
 System.out.printf("%s:%d ", diasSemana[i], PastillasSinUsar[i]);
 }
 */
 
 //Extraer la información de PastillasSinUsar
 //Se busca el primer valor mínimo del array que
 //será el primer día que tiene que comprar más pastillas.
 int ultimoDia = 6; //Poniendo los valores máximos
 int minimoPasti = pastiSobrantes.length;
 for (int i = 0; i < PastillasSinUsar.length ; i++) {
 
 if(PastillasSinUsar[i] < minimoPasti){
 ultimoDia = i;
 minimoPasti = PastillasSinUsar[i];
 }//
 }
 
 return "Mayte debera empezar un nuevo bote de pastillas, el : "+ diasSemana[ultimoDia]+ " de la semana: " + (minimoPasti+1);
 }//fin de DiaNumero
 
 
 
//fin de pastillas
 public static void main(String args[]){
 /*
 //Entrada no implementada, y puesta fija para pruebas.
 Scanner entrada = new Scanner(System.in);
 int cantidadDatos;
 int cantidadSemanas;
 
 System.out.print("¿Cuantas semanas?:");
 cantidadSemanas = entrada.nextInt();
 */
 
 String Pastillero[] = new String [4];
 Pastillero[0] = "*******";
 Pastillero[1] = "*--*--*";
 Pastillero[2] = "*-*-*-*";
 Pastillero[3] = "--*---*";
 
 System.out.println(diaNumero(Pastillero));
 
 String OtroPastillero[] = new String [3];
 OtroPastillero[0] = "-------";
 OtroPastillero[1] = "*****-*";
 OtroPastillero[2] = "*******";
 
 System.out.println(diaNumero(OtroPastillero));
 
 }// fin del main
}