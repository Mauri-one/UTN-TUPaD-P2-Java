/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rinal
 */
public class NaveEspacial {
    
    
     // Atributos privados
    private String nombre;
    private int combustible;
    private final int LIMITE_COMBUSTIBLE = 100;
    
    
    
    
    
    // Constructor de la clase
    
    // Constructor
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = Math.min(combustibleInicial, LIMITE_COMBUSTIBLE);
    }    
        
        
    // Metodo para Despegar

    public void despegar(){
       System.out.println("La nave " + nombre + " ha despegado."); 
        
    }
       
    
    
    //Metodo para Avanzar 
    public void avanzar(int distancia) {
    if (distancia <= 0) {
        System.out.println("⚠️ La distancia debe ser mayor que cero.");
        return;
    }

    if (distancia <= combustible) {
        combustible -= distancia;
        System.out.println("La nave avanzó " + distancia + " km.");
    } else {
        System.out.println("Combustible insuficiente para avanzar " + distancia + " km.");
    }
    
    }

 // Método para recargar combustible
    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser positiva.");
            return;
        }

        if (combustible + cantidad > LIMITE_COMBUSTIBLE) {
            combustible = LIMITE_COMBUSTIBLE;
            System.out.println("Combustible recargado al máximo (" + LIMITE_COMBUSTIBLE + " unidades).");
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        }
    }

    // Método para mostrar el estado actual
    public void mostrarEstado() {
        System.out.println("Estado de la nave:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible restante: " + combustible + " unidades");
      
    }
    
    
    
    
}