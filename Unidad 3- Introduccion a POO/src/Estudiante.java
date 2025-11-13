/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rinal
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private int calificacion;
 
    
    
   // Constructor de la Clase
    public Estudiante (String nombre, String apellido, String curso, int calificacion) {
    
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
        
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    public void subirCalificacion(int puntos){
        if (puntos >=0) {
        calificacion += puntos;        
        }
    }

    public void bajarCalificacion(int puntos) {
        
        calificacion -= puntos;  
         if (calificacion < 0){
         calificacion = 0;
        }    
                 
    }

    public void setNombre(String nombre) {
        if (nombre!= null){
        this.nombre = nombre;
        }
    }

    public void setApellido(String apellido) {
        if (apellido != null){
        this.apellido = apellido;
        }
    }

    public void setCurso(String curso) {
        if (curso!= null){
        this.curso = curso;
        }
    }

    
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
        
    }
 
    
    
    
    
    
}

    
   
    
    

