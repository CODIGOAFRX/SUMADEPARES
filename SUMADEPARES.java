/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumadepares;

import java.util.Scanner;

/**
 *
 * @author AlumnoT
 */
public class SUMADEPARES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenidx a tu sumador de numeros pares");

        int numero1;
        int numero2;
        int resultado = 0;
     
        Scanner leer = new Scanner(System.in);
        //LLamamos a la extensión que nos permita leer el dato introducido

        System.out.println("introduce el primer valor");// aquí leería lo que escriba el usuario
        numero1 = leer.nextInt(); //establece el nº1

        System.out.println("introduce el segundo valor");// aquí leería lo que escriba el usuario
        Scanner leer2 = new Scanner(System.in);
        numero2 = leer2.nextInt(); // establece el nº2
        // continuamos estableciendo las operaciones que va a realizar la calculadora

        for (int i = numero1; i <= numero2; i++) {
            
            
            if (i%2==0) {
                    resultado = resultado + i;         // i representa lo que hemos determinado en el for, en este caso el primero i es el numero1 y va paso por paso aumentando en 1 ya que i++ es lo 
                                                                     // que simboliza, una suma de 1 por cada paso del bucle for. Por tanto "resultado" en este caso es nuestro método para poder ir guardando en memoria
                                                                     // la operacion de i mas el la operacion que nos dio anteriormente. Por esto mismo es tan importante definir con anterioiridad resultado e igualarlo a 0 
            }
           
        }  
        //SUPER IMPORTANTE PONERLO FUERA DEL BUCLE FOR PARA QUE NO SE REPITA LA LINEA TANTAS VECES.
        System.out.println("El resultado de sumar los numero pares desde " + numero1 + " hasta " + numero2 + " es " + resultado);
         
    }
}
