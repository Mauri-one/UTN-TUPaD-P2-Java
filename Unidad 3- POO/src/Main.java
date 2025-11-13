/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author rinal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
    // Instanciar la Clase Estudiante 
    
        Estudiante estudiante_1 = new Estudiante("Mauricio", "Lopez", "Programacion 2", 9);
        
        estudiante_1.mostrarInfo();
                    
        estudiante_1.subirCalificacion(8);
        
        estudiante_1.mostrarInfo();
        
        estudiante_1.bajarCalificacion(2);
        
        estudiante_1.mostrarInfo();
        
        
    
        
        
        
        
   
    // Instanciar la Clase Mascota  

     Mascota mascota_1 = new Mascota("San"," Perro", 1);

     mascota_1.mostrarInfo();

     mascota_1.cumplirAnios();


     mascota_1.cumplirAnios();

     mascota_1.mostrarInfo();
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     // instanciar la clase Libro
     
     Libro libro_1 = new Libro ("El Nuevo Testamento", "Reyna Valera", 1960 );
    
     
     // Modificar el año de publicacion con un valor valido
     
     libro_1.setAñoPublicacion(1960);
      
      
     System.out.println("Título: " + libro_1.getTitulo());
     System.out.println("Autor: " + libro_1.getAutor());
     System.out.println("Año de publicación: " + libro_1.getAñoPublicacion());
    
     
     
     









     
     // instanciar la clase Gallina
     
    Gallina gallina1 = new Gallina(101, 2);
    Gallina gallina2 = new Gallina(102, 1);

        // Simular acciones
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();

        gallina2.envejecer();
        gallina2.envejecer();
        gallina2.ponerHuevo();

        // Mostrar estado final
        System.out.println("Estado final de las gallinas:");
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();
    

    
    // Instanciar la clase NaveEspacial

    NaveEspacial nave_1  = new NaveEspacial("Interestelar", 50);
    
    // Intentar avanzar 60 km sin recargar
        nave_1.despegar();
        nave_1.avanzar(60); // Falla por falta de combustible

        // Recargar 40 unidades
        nave_1.recargarCombustible(40); // Total debería ser 90

        // Avanzar 60 km correctamente
        nave_1.avanzar(60); // Éxito

        // Mostrar estado final
        nave_1.mostrarEstado();
    
    
    }   
  
     
}





        







