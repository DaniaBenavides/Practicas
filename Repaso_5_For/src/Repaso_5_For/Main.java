/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso_5_For;

import java.util.Scanner;

/**
 *
 * @author rocio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Introducir un número y mostrar los números del 0 al numero ingresado
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número:");
        int iCont = input.nextInt();

        //DESDE CERO HASTA EL VALOR DEL USUARIO
        for (int i = 0; i <= iCont; i++) {
            //Conversion de datos -->Casting
            System.out.print(i + " - "); //JAVA convierte en automático en entero en cadena
        }
        System.out.println("\n");
        //DESDE EL VALOR DEL USUARIO HASTA CERO
        for (int i = iCont; i >= 0; i--) {
            //Conversion de datos -->Casting
            System.out.print(i + " - "); //JAVA convierte en automático en entero en cadena
        }

    }

}
