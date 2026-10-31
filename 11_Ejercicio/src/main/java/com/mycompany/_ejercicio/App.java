/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercicio;
import java.util.Scanner;

/**
 *
 * @author FLEREZ
 */
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int numero1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int numero2 = entrada.nextInt();

        System.out.println("Suma: " + (numero1 + numero2));
        System.out.println("Resta: " + (numero1 - numero2));
        System.out.println("Multiplicacion: " + (numero1 * numero2));

        if (numero2 != 0) {
            System.out.println("Division entera: " + (numero1 / numero2));
            System.out.println("Modulo: " + (numero1 % numero2));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }
    }
}