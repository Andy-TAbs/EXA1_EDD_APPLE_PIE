/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exa_2_comparar_arreglos;

import java.util.Scanner;

/**
 *
 * @author mague
 */
public class EXA_2_COMPARAR_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner input = new Scanner(System.in);
        int[] aiArray1 = new int[10];
        String asArray1 = "";
        String asArray2 = "";
        System.out.println("Introduzca 10 números (Ej: Numero1 + enter, Numero2 + enter, etc.)");
        for (int i = 0; i < aiArray1.length; i++) {
            aiArray1[i] = input.nextInt();
        }
        System.out.println("Introduzca 10 números de nuevo (Ej: Numero1 + enter, Numero2 + enter, etc.)");
        int[] aiArray2 = new int[10];
        for (int i = 0; i < aiArray2.length; i++) {
            aiArray2[i] = input.nextInt();

        }
        for (int i = 0; i < aiArray1.length; i++) {
            asArray1 += aiArray1[i] + ",";
            asArray2 += aiArray2[i] + ",";

        }
        if (mComparador(aiArray1, aiArray2)) {
            System.out.print("Los arreglos " + "[" + asArray1 + "]" + " y " + "[" + asArray2 + "]" + " son iguales.");

        } else {
            System.out.println("Los arreglos " + "[" + asArray1 + "]" + " y " + "[" + asArray2 + "]" + " no son iguales.");
        }

    }

    public static boolean mComparador(int[] aiArray1, int[] aiArray2) {
        int iCounter = 0;
        for (int i = 0; i < aiArray1.length; i++) {
            if (aiArray1[i] == aiArray2[i]) {
                iCounter++;
            }

        }
        return iCounter == aiArray1.length;
    }

}
    
    

