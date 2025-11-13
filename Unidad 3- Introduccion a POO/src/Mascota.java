/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rinal
 */
public class Mascota {
    
    
    
    private String nombre;
    private String especie;
    private int edad;
    
    
    // Constructor de la clase
    public Mascota (String nombre,String especie,int edad){
        
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        
    }
    
    
    
    
    void mostrarInfo(){
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
       
    }
    
    
    
    void cumplirAnios(){
        
        edad++;
        System.out.println(nombre + " ha cumplido años! Ahora tiene " + edad + " años.");
    }

    public void setNombre(String nombre) {
        if (nombre != null){
        this.nombre = nombre;
        }
    }

    public void setEspecie(String especie) {
        if (especie != null){
        this.especie = especie;
    }
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
 
 
    
    
    
}


