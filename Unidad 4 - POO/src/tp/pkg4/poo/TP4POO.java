/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg4.poo;

/**
 *
 * @author rinal
 */
public class TP4POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // Instancias con constructor parcial
        Empleado e1 = new Empleado("Mauricio López", "Analista");
        Empleado e2 = new Empleado("Carla Méndez", "Desarrolladora");

        // Instancia con constructor completo
        Empleado e3 = new Empleado(100, "Luis Torres", "Gerente", 120000);

        // Aplicar aumentos
        e1.actualizarSalario(10);      // Aumento del 10%
        e2.actualizarSalario(5000);    // Aumento de $5000
        e3.actualizarSalario(7.5);     // Aumento del 7.5%

        // Mostrar información
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Mostrar total de empleados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
        
    }
    
}
