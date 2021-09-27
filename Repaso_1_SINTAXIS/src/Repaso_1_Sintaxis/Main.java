package Repaso_1_Sintaxis;

import java.util.Scanner; //PAQUETE

/**
 *
 * @author rocio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mostrar mensaje
        System.out.println("Hola mundo!!");
        //Solicitar datos
        //METODO 1: SCANNER
        System.out.println("Captura la edad");
        Scanner input = new Scanner(System.in);
        int iEdad = input.nextInt();
        
        //CONDICIONALES
        if (iEdad >= 18) {
            System.out.println("MAYOR DE EDAD");
        } else {
            System.out.println("MENOR DE EDAD");
        }
        //System.out.println(iEdad);
    }

}
