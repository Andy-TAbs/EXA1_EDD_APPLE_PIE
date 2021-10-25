
package exa1_6_verificar_suma;

import java.util.Scanner;

public class EXA1_6_VERIFICAR_SUMA {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        int[][] iMat = new int[4][4];
        
        System.out.println("Ingrese la matriz: ");
        for (int i = 0; i < iMat.length; i++) {
            for (int j = 0; j < iMat[i].length; j++) {
                System.out.print("Celda de Matriz [" + i +"][" +j+ "]: ");
                iMat[i][j] = input.nextInt();
            }
            
        }
        System.out.println("");
        System.out.println("La matriz es: ");
        for (int i = 0; i < iMat.length; i++) {
            for (int j = 0; j < iMat[i].length; j++) {
                System.out.print(iMat[i][j] + " ");
            }
            System.out.println("");
        }
        int sum, sum1, sum2, sum3, prom ;
        int prom1=0, prom2=0, prom3=0;
        for (int i = 0; i < 1; i++) {
            sum = 0;
            sum1 = 0;
            sum2 = 0;
            sum3 = 0;
              prom =0;
            for (int j = 0; j < 1; j++) {
                sum = iMat[0][0]+iMat[0][1]+iMat[0][2]+iMat[0][3];
                sum1 = iMat[1][0]+iMat[1][1]+iMat[1][2]+iMat[1][3];
                sum2 = iMat[2][0]+iMat[2][1]+iMat[2][2]+iMat[2][3];
                sum3 = iMat[3][0]+iMat[3][1]+iMat[3][2]+iMat[3][3];
                System.out.println("La suma es: " + sum);
                System.out.println("La suma es: " + sum1);
                System.out.println("La suma es: " + sum2);
                System.out.println("La suma es: " + sum3);
                prom = sum/4;
                prom1 = sum/4;
                prom2 = sum/4;
                prom3 = sum/4;
                if (prom == prom1){
                    System.out.println("Los promedios 1: " + prom + " y 2: " + prom1+ " son similares");
                }else if (prom == prom2){
                    System.out.println("Los promedios 1: " + prom + " y 3: " + prom2+ " son similares");
                }else if (prom == prom3){
                    System.out.println("Los promedios 1: " + prom + " y 4: " + prom3+ " son similares");
                }else if (prom1 == prom2){
                    System.out.println("Los promedios 2: " + prom1 + " y 3: " + prom2+ " son similares");
                }else if (prom1 == prom3){
                    System.out.println("Los promedios 2: " + prom1 + " y 4: " + prom3+ " son similares");
                }else if (prom2 == prom3){
                    System.out.println("Los promedios 3: " + prom1 + " y 4: " + prom3+ " son similares");
                }else if (prom == prom1 && prom1 == prom2 && prom2 == prom3){
                    System.out.println("Todos los promedios son similares");
                }else if (prom == prom1 && prom == prom2){
                    System.out.println("Los promedios 1: " + prom + ",  2: " + prom1+ " y 3:" +prom2+  " son similares");
                }else if (prom == prom1 && prom == prom3){
                    System.out.println("Los promedios 1: " + prom + ",  2: " + prom1+ " y 4:" +prom3+  " son similares");
                }else if (prom1 == prom2 && prom1 == prom3){
                    System.out.println("Los promedios 2: " + prom1 + ",  3: " + prom2+ " y 4:" +prom3+  " son similares");
                }else if (prom == prom2 && prom == prom3){
                    System.out.println("Los promedios 1: " + prom + ",  3: " + prom2+ " y 4:" +prom3+  " son similares");
                }else{
                    System.out.println("Ningun promedio es similar");
                }
                
                
            }
        }
    }
    
}
