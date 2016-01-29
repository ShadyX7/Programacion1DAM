/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testejemplos;

/**
 *
 * @author Victor
 */
class TestEjemplos {
  public static void main (String[] args) {
    claseTestNew a1 = new claseTestNew();
    claseTestNew a2 = new claseTestNew();
    claseTestNew a3 = new claseTestNew();
    a1.valor=150;
    a2.valor=150;
    a3 = a1;
    if (a1 == a2) { System.out.println(" UNO"); }
    if (a1 == a3) { System.out.println(" DOS"); }
     
  }
}
