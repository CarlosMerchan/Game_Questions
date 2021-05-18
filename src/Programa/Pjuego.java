/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import java.util.Random;

/**
 *
 * @author john_
 */
public class Pjuego {
    
    /** creamos un arreglo 
     * el arreglo es llenado 
     * aleatoriamente par 6
     * pares de cartas 
     * 
     * @return 
     */
     public int[] getCardNumbers() {   
         int[] car = new int[12];
        int count = 0;
        while(count < 12) {
            Random r = new Random();
            int na = r.nextInt(6) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 12; i++) {
                if(car[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                car[count] = na;
                count++;
            }//fin
            
        }
         return car;
         
 }
}
