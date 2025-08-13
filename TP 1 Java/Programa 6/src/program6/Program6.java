/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package program6;

import java.util.Scanner;

/**
 *
 * @author Rapida y Mortal
 */
public class Program6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int n1;
            int n2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        n1 = input.nextInt();
        
        System.out.println("Ingrese otro numero: ");
        n2 = input.nextInt();
        
        System.out.println((double)n1 /n2);
    }
    
}
