package com.example;

import java.time.DayOfWeek;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
      /* Sentencia break con etiqueta
      * Ejemplo: apartir de un array bidimensional, es decir una matriz
      * buscar la ocurrencia de un valor concreto y mostrar la fila y la columna
      * donde ha sido hallado
      */

      int [][] arrayOfInts = {
        //fila 1
            {1, 2, 3, 4},
        //fila 2
            {5, 6, 7, 8,9},
        //fila 3
            {10, 11, 12, 13,14}
        };

       //valor a buscar
       int searchFor = 12;

       //variable que indica si ha sido encontrado
         boolean foundIt = false;
         int i = 0;   
         int j = 0;
         
        int totalFilas = arrayOfInts.length; //numero elementos total



         for (i = 0; i < totalFilas; i++) {
            for (j = 0; j < arrayOfInts[i].length; j++) { //cuantos elementos hay en esa fila 
                if (arrayOfInts[i][j] == searchFor) {
                    foundIt = true;
                    break;
                }
            }
            if (foundIt) {
                break;
            }
         }

         if (foundIt) {
            System.out.println("El valor : " + searchFor + " fue encontrado en la fila " + i + " y columna " + j);
         } else {
            System.out.println("El valor : " + searchFor + " no fue encontrado");
         }

      //Ejercicio repetir lo anterior
      //hacer esto con una sentencia for mejorada

    int fila = 0;
    
     //Primera vuelta → filaArray = {1, 2, 3, 4}
     //Segunda vuelta → filaArray = {5, 6, 7, 8, 9}
    //Tercera vuelta → filaArray = {10, 11, 12, 13, 14}
    //FILA COMPLETA
    for (int[] filaArray : arrayOfInts) {
        int columna = 0;
        //VALOR DE CADA UNA DE ESAS FILAS COMPLETAS: 1,2 ...        
        for (int valorArray : filaArray) {
            if (valorArray == searchFor) {
                foundIt = true;
                i = fila;
                j = columna;
                break;
            }
            columna++;
        }
        
        if (foundIt) {
            break;
        }
        fila++;
    }

    if (foundIt) {
       System.out.println("El valor : " + searchFor + " fue encontrado en la fila " + i + " y columna " + j);
    } else {
        System.out.println("No encontrado");
    }



    }//fin del main
}
