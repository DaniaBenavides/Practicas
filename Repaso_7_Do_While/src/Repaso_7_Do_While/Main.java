/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso_7_Do_While;

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

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número (mayor a 10 para detener):");
        int iCont = input.nextInt();

        do {
            System.out.println("Introduce un número (mayor a 10 para detener):");
            iCont = input.nextInt();
        } while (iCont <= 10);

    }

}
