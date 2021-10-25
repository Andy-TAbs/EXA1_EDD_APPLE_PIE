/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exa1_1_filtrar_valores;

/**
 *
 * @author mague
 */
public class EXA1_1_FILTRAR_VALORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] aiArray = new int[15];
        int iNum_Crudo;
        for (int i = 0; i < aiArray.length; i++) {
            do {
                iNum_Crudo = (int) (Math.random() * 100 + 1);
            } while ((iNum_Crudo % 2) != 0 || mComparador(iNum_Crudo, aiArray, i));
            aiArray[i] = iNum_Crudo;
            System.out.println("[" + aiArray[i] + "]");
        }

    }

    public static boolean mComparador(int iNum, int[] aiArray, int Vuelta) {
        for (int i = 0; i < Vuelta; i++) {
            if (iNum == aiArray[i]) {
                return true;
            }
        }
        return false;
    }
}
    
    

