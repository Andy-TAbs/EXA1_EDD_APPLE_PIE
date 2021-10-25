
package exa1_7_copia_parcial;

import java.util.Arrays;
import java.util.Scanner;


public class EXA1_7_COPIA_PARCIAL {

   
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner (System.in);
         int iPos1, iPos2;
    
         int[] iMatr = new int[15];
        
        
        for (int i=0; i< iMatr.length; i++) {
            iMatr[i] = (int) (Math.random() *100);
            System.out.println("Datos del arreglo: " +iMatr[i]);
        }
        
        System.out.println("introduzca las pocisiones del arreglo que desea copiar");
        iPos1 = input.nextInt();
        iPos2 = input.nextInt();
        
        
        int[] subArreglo = Arrays.copyOfRange(iMatr, iPos1, iPos2);
       
        for (int i=0; i< subArreglo.length; i++) {
            System.out.print(iMatr[i] + " ");
        }
    }
    
}
