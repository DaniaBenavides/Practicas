/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repaso_2_Estructuras_Condicionales;

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
        /*JUBILACIÓN:
        MUJERES:60
        HOMBRES:65
        */
        //PREGUNTAR:
        Scanner input= new Scanner(System.in);
        System.out.println("Introduce tu género (Hombre --> 1, Mujer --> M):");
        String sGen= input.nextLine();
        System.out.println("Introduce tu edad:");
        int iEdad= input.nextInt();
        
        
        if (sGen.equals("M")) {
            if(iEdad>=60){
                System.out.println("Te puedes jubilar");
            }else{
                System.out.println("NO te puedes jubilar");
            }
        } else if(sGen.equals("H")) {
            if(iEdad>=65){
                System.out.println("Te puedes jubilar");
            }else{
                System.out.println("NO te puedes jubilar");
            }
        } else{
            System.out.println("Debes introducir una M (mujer) o una H (hombre)");
        }
        
    }
    
}
