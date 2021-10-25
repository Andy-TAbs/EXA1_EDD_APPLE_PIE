/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exa1_4_buscar_numeros_repetidos;


import java.util.Scanner;

/**
 *
 * @author mague
 */
public class EXA1_4_BUSCAR_NUMEROS_REPETIDOS {

    
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner input = new Scanner (System.in);
      
      int[] aiArreglo = new int[20];
      int[] aiContador = new int[aiArreglo.length];
        System.out.println("Direccion: " + aiArreglo);
        
        for (int i = 0; i < aiArreglo.length; i++) {
            aiArreglo[i] = (int) (Math.random() * 20);
            System.out.println("Datos introducidos al azar: " + aiArreglo[i]);
               aiContador[aiArreglo[i]] +=1;
        }
        for (int i = 0; i < aiContador.length; i++) {
            if (aiContador[i]>=3){
                  System.out.println("Repetidos " + i +":" +aiContador[i] + " veces");
                  break;
            }else{
               System.out.println("No hay numeros repetidos");
                }
          
        }
        
      
    }
    
}
