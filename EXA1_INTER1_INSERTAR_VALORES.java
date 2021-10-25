/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exa1_inter1_insertar_valores;

import java.util.Scanner;

/**
 *
 * @author mague
 */
public class EXA1_INTER1_INSERTAR_VALORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[] aiArray = new int[15];
        String asArray = "";
        System.out.println("Introduzca 15 números (Ej: Numero1 + enter, Numero2 + enter, etc.)");
        for (int i = 14; i >= 0; i--) {
            aiArray[i] = input.nextInt();
            asArray = "[" + aiArray[i] + "]" + asArray;
            System.out.println(asArray);
        }

    }

}
    
    

