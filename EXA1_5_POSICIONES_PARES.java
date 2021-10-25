/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exa1_5_posiciones_pares;

/**
 *
 * @author mague
 */
public class EXA1_5_POSICIONES_PARES {

   
    public static void main(String[] args) {
        // TODO code application logic here
         int[] iArreglo = new int[20]; 
        System.out.println("Direccion del arreglo = " + iArreglo);
        
        for (int i = 0; i < iArreglo.length; i++) {
            iArreglo[i] = (int) (Math.random() * 20);
            System.out.println("Datos introducidos al azar: " + iArreglo[i]);
        }
        //COPIA DE LOS DATOS DEL ARREGLO
       // int[] iCopia = iArreglo; //No Funciona
       int[] iCopia = new int[20];
        System.out.println("Direccion de iCopia = " + iCopia);
        for (int i = 0; i < iArreglo.length; i++) {
            iCopia[i] = iArreglo[i];
        }
        for (int i = 0; i < iArreglo.length; i++) {
            System.out.println("La pocision " + i + " es un numero par o impar: " +iCopia[i]);
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            if (iArreglo[i] % 2 == 0){
                System.out.println("La pocicion "+i+" es el numero par: [" + iArreglo[i] + "]");
            }
        }
       
    }
    
}
