/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso_4_Switch;

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
        /*Pedir un número entre 1 y 7 y desplegar en 
        pantalla un día de la semana (Domingo (1), Sábado (7))*/

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número");
        int iDia = input.nextInt();

        //imprimir el día de la semana con "if"
        /*  if (iDia == 1) {
            System.out.println("Domingo");
        } else if (iDia == 2) {
            System.out.println("Lunes");
        } else if (iDia == 3) {
            System.out.println("Martes");
        } else if (iDia == 4) {
            System.out.println("Miércoles");
        } else if (iDia == 5) {
            System.out.println("Jueves");
        } else if (iDia == 6) {
            System.out.println("Viernes");
        } else if (iDia == 7) {
            System.out.println("Sábado");
        } else{
            System.out.println("Número incorrecto");
        }*/
        //imprimir el día de la semana con "switch"
        switch (iDia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miércoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número incorrecto");
                
        }

    }

}
