/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa.pkg4;

import java.util.Scanner;

/**
 *
 * @author Rapida y Mortal
 */
public class Programa4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n1;
        int n2;
              
        
        System.out.println("Ingrese un numero: ");
        n1 = input.nextInt();
        
        System.out.println("Ingrese otro numero: ");
        n2 = input.nextInt();
        
        
        System.out.println("La suma de los numeros es: " +(n1+n2));
        
        System.out.println("La resta de los numeros es: " +(n1-n2));
        
        System.out.println("La multiplicacion de los numeros es: " + (n1*n2));
        
        System.out.println ("La division de los numeros es: " + ((double)n1/n2));
        
        
                
    }
    
}
