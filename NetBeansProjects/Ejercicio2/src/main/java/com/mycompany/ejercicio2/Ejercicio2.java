/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

/**
 *
 * @author Windows
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n; // Cantidad de veces a realizar el proceso
        System.out.println("Ingrese la cantidad de veces a realizar el proceso:");
        n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el código de la acción a realizar (1: saludar, 2: pedir nombre, 3: sumar):");
            int codigo = scanner.nextInt();
            
            switch (codigo) {
                case 1:
                    System.out.println("¡Hola!");
                    break;
                case 2:
                    System.out.println("Por favor, ingrese su nombre:");
                    String nombre = scanner.next();
                    System.out.println("Mucho gusto, " + nombre + "!");
                    break;
                case 3:
                    System.out.println("Ingrese el primer número:");
                    int num1 = scanner.nextInt();
                    System.out.println("Ingrese el segundo número:");
                    int num2 = scanner.nextInt();
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                default:
                    System.out.println("Código no válido");
            }
        }
    }
}