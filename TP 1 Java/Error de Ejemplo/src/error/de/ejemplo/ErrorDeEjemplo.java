/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package error.de.ejemplo;

import java.util.Scanner;

/**
 *
 * @author Rapida y Mortal
 */
public class ErrorDeEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Ingresa tu nombre: ");
    String nombre = scanner.nextLine(); // ERROR
    
    System.out.println("Hola, " + nombre);
    }
    
}
