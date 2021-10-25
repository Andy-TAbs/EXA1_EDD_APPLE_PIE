
package exa1_inter2_borrar_valores;

import java.util.Scanner;


public class EXA1_INTER2_BORRAR_VALORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int[] iArr = new int[15];
        int pos =0;
        boolean eli= false;
        
        for (int i = 0; i < iArr.length; i++) {
            System.out.print("Introduzca el elemento [" + i + "]: ");
            iArr[i] = input.nextInt();
        }
        System.out.println("");
        System.out.println("¿Que Numero desea eliminar? ");
        pos = input.nextInt();
        
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] == pos){
                iArr[i] = 0;
                eli = true;
            }
        }
        System.out.println("El arreglo final es: ");
        for (int i = 0; i < 14; i++) {
            System.out.println(iArr[i]);
        }
    }
    
}
