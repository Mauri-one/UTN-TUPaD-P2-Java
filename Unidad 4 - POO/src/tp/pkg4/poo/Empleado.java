/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp.pkg4.poo;

/**
 *
 * @author rinal
 */
public class Empleado {
    
    
    // Atributos privados (encapsulamiento)
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    //️ Atributo estático contador de empleados
    private static int totalEmpleados = 0;

    // Generador automático de ID
    private static int generadorId = 1;

    // Constructor completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    // Constructor parcial con ID automático y salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = generadorId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000.0; // Salario por defecto
        totalEmpleados++;
    }

    //Método sobrecargado: aumento por porcentaje
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    // Método sobrecargado: aumento por monto fijo
    public void actualizarSalario(int montoFijo) {
        this.salario += montoFijo;
    }

    // Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    //Método toString para mostrar datos legibles
    @Override
    public String toString() {
        return "Empleado [ID=" + id + ", Nombre=" + nombre + ", Puesto=" + puesto + ", Salario=" + salario + "]";
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

