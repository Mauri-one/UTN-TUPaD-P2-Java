/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.pkg2.programacion.estrucutrada;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author rinal
 */
public class TP2ProgramacionEstructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ TP2 ---");
            System.out.println("1.  Determinar el mayor de tres números");
            System.out.println("2.  DeterminarElMayorDeTresNúmeros");
            System.out.println("3.  ClasificacionEdad");
            System.out.println("4.  CalculadoraDescuento");
            System.out.println("5.  SumaNumerosPares");
            System.out.println("6.  ContadorDePositivosNegativosCerosFor");
            System.out.println("7.  ValidacionDeNotaEntre0y10");
            System.out.println("8.  CálculoDelPrecioFinalConImpuestoYDescuento");
            System.out.println("9.  ComposiciónDeFuncionesParaCalcularCostoDeEnvíoYTotalDeCompra");
            System.out.println("10. ActualizacionDeStock");
            System.out.println("11. CálculoDeDescuentoEspecialUsandoVariableGlobal");
            System.out.println("12. Array");
            System.out.println("13. ImpresiónRecursivaDeArraysAntesYDespuésDeModificarUnElemento");
            
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1  -> VerificacionDeAñoBisiesto.ejecutar();
                case 2  -> DeterminarElMayorDeTresNúmeros.ejecutar();
                case 3  -> ClasificacionEdad.ejecutar();
                case 4  -> CalculadoraDescuento.ejecutar();
                case 5  -> SumaNumerosPares.ejecutar();
                case 6  -> ContadorDePositivosNegativosCerosFor.ejecutar();
                case 7  -> ValidacionDeNotaEntre0y10.ejecutar();
                case 8  -> CálculoDelPrecioFinalConImpuestoYDescuento.ejecutar();
                case 9  -> ComposiciónDeFuncionesParaCalcularCostoDeEnvíoYTotalDeCompra.ejecutar();
                case 10 -> ActualizacionDeStock.ejecutar();
                case 11 -> CálculoDeDescuentoEspecialUsandoVariableGlobal.ejecutar();
                case 12 -> Array.ejecutar();
                case 13 -> ImpresiónRecursivaDeArraysAntesYDespuésDeModificarUnElemento.ejecutar();                                            
                case 0 -> System.out.println("Programa finalizado.");
                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 0);

        scanner.close();
}
 
        
    




class VerificacionDeAñoBisiesto{
    public static void ejecutar(){
    Scanner scanner = new Scanner(System.in);
       
        System.out.println("Ingrese el año: ");
        int año= scanner.nextInt();
        
        if ((año % 4==0 && año % 100 != 0) || ( año % 400==0)){
        
        System.out.println( año  + "es bisiesto");
        
        } else {
        System.out.println(año +" no es bisiesto ");
        }
    }      
}       
        
class DeterminarElMayorDeTresNúmeros {
    public static void ejecutar() {
       Scanner scanner = new Scanner(System.in);
        
       System.out.println("Ingrese el primer numero: ");
       int num1 = scanner.nextInt();
       
       System.out.println("Ingrese el segundo numero: ");
       int num2 = scanner.nextInt();
       
       System.out.println("Ingrese el tercer numero: ");
       int num3 = scanner.nextInt();
       
       if ( num1 > num2 && num1 < num3 ){
           System.out.println( "El mayor es el numero " + num1 );
       } else if ( num2 < num3){
           System.out.println("El mayor es el numero " + num2 );
       } else {
           System.out.println(" El mayor es el numero" + num3);
       
       }
           
    }
}



class ClasificacionEdad {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }

        scanner.close();
    }
}



class CalculadoraDescuento {
    public static void ejecutar () {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = scanner.nextDouble();

        // Solicitar la categoría del producto
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scanner.next().toUpperCase().charAt(0);

        double descuento = 0;

        // Determinar el porcentaje de descuento según la categoría
        switch (categoria) {
            case 'A':
                descuento = 0.10;
                break;
            case 'B':
                descuento = 0.15;
                break;
            case 'C':
                descuento = 0.20;
                break;
            default:
                System.out.println("Categoría inválida. No se aplicará descuento.");
                break;
        }

        // Calcular el precio final
        double montoDescuento = precioOriginal * descuento;
        double precioFinal = precioOriginal - montoDescuento;

        // Mostrar resultados
        if (descuento > 0) {
            System.out.println("Descuento aplicado: " + (int)(descuento * 100) + "%");
            System.out.println("Precio final: " + precioFinal);
        } else {
            System.out.println("Precio final: " + precioOriginal);
        }

        scanner.close();
    }
}


class SumaNumerosPares {
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int sumaPares = 0;

        // Solicitar números hasta que el usuario ingrese 0
        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break;
            }

            if (numero % 2 == 0) {
                sumaPares += numero;
            }
        }

        System.out.println("La suma de los números pares es: " + sumaPares);

        scanner.close();
    }
}



class ContadorDePositivosNegativosCerosFor{
    public static void ejecutar(){
    
        Scanner scanner= new Scanner(System.in);

        int positivos=0;
        int negativos=0;
        int ceros=0;

        int[] numeros = new int[10];

        for (int i = 0; i <=10; i++){

            System.out.println("Ingrese un numero: ");
            numeros[i] = scanner.nextInt();

            if ( numeros[i]%2==0){
                positivos++;           
            } else if (numeros[i] <0 ){            
                negativos++;        
            } else {            
                ceros++;         
            }                
    } 

    System.out.println("La cantidad de positivos son: " + positivos);
    System.out.println("La cantidad de negativos son: " + negativos);
    System.out.println("La cantidad de ceros son:" + ceros);
}
}
    
    
class ValidacionDeNotaEntre0y10{
    public static void ejecutar(){
        
        Scanner scanner= new Scanner(System.in);
        
        int nota;

        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = scanner.nextInt();

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente: " + nota);
        scanner.close();
        
    }    
            
}       


class CálculoDelPrecioFinalConImpuestoYDescuento {
    
    // Método que calcula el precio final aplicando impuesto y descuento
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal = precioBase + (precioBase * impuesto / 100) - (precioBase * descuento / 100);
        return precioFinal;
    }

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de impuesto: ");
        double impuesto = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento: ");
        double descuento = scanner.nextDouble();

        // Calcular y mostrar el precio final
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final del producto es: $" + String.format("%.2f", precioFinal));

        scanner.close();
    }
}


class ComposiciónDeFuncionesParaCalcularCostoDeEnvíoYTotalDeCompra{
    
    
    public static double calcularCostoEnvio(double peso, String zona){
        
        double costoEnvio;
        if (zona.equalsIgnoreCase("Nacional")){
            return peso * 5;
        }else { 
            return peso *10;        
        }       
               
    }
    
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
                          
        return precioProducto + costoEnvio;
    }
    
    
    public static void ejecutar(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el peso del paquete: ");
        double peso= scanner.nextDouble();
        
        System.out.println("Ingrese la zona de envio(Nacional/Internacional: "); 
        String zona= scanner.nextLine();
        
        System.out.println("Ingrese el precio del producto: ");
        double precioProducto= scanner.nextDouble();
            
        
        double costoEnvio= calcularCostoEnvio( peso, zona);                     
        double totalCompra= calcularTotalCompra(precioProducto,costoEnvio);
        
        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total de la compra es: " + totalCompra);
         
    
    }
}



class ActualizacionDeStock {
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
                 
        return stockActual-cantidadVendida+cantidadRecibida; 
                
    }
    
    
    public static void ejecutar(){
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el stock actual: ");
        int stockActual=scanner.nextInt();
        
        System.out.println("Ingrese la cantidad vendida: ");
        int cantidadVendida= scanner.nextInt(); 
        
        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadRecibida= scanner.nextInt();
        
        
        int nuevoStock= actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
        
    }

}


class  CálculoDeDescuentoEspecialUsandoVariableGlobal{
   
    
    static double DESCUENTO = 0.10;


    public static void calcularDescuentoEspecial(double precio) {
        
        double descuentoAplicado = precio * DESCUENTO;
        double precioFinal = precio - descuentoAplicado;

     
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

   
    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        calcularDescuentoEspecial(precio);
    }
}
    
   class Array{
       
        public static void ejecutar(){
           
            double[] precios={ 199.50, 26.30, 14.25, 23.25, 14.56,};
       
            
            System.out.println("los precio originales son: ");
            for (double precio : precios) {
                System.out.println(precio);
            }
            
            precios[3]=255.70;
            
            System.out.println("Los precios actualizados son: ");
            for(double precio : precios){
                System.out.println(precio);
            
            }
    }
}        
        

class ImpresiónRecursivaDeArraysAntesYDespuésDeModificarUnElemento {
    
    public static void ejecutar(){
        
    double[] precios = {10.80, 14.25, 12.18,45.50,};
        
     
    
    
    System.out.println(" Precio: $");
    mostrarPrecioOriginal(precios);
        
    precios[3]=14.55;
    precios[1]= 89.00;
        
    System.out.println(" Precios originales$");
    mostrarPrecioOriginal(precios);    
    
    System.out.println(" Precios Modificados: $");
    mostrarPrecioModificado(precios); 
    }

    public static void  mostrarPrecioOriginal (double[] lista){
       
        if ( lista.length == 0)return;
            
            System.out.println("Precio: $" + lista[0]); 
            mostrarPrecioOriginal( Arrays.copyOfRange(lista, 1, lista.length));
                               
    }
    
    public static void  mostrarPrecioModificado (double[] lista){
       
        if ( lista.length == 0)return;
            
            System.out.println("Precio: $" + lista[0]); 
            mostrarPrecioModificado( Arrays.copyOfRange(lista, 1, lista.length));
                               
    }
    
    
}
}


    







      
        
  