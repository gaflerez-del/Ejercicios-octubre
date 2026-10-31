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

        System.out.print("Ingrese un numero entero: ");
        int numero = entrada.nextInt();

        int ultimaCifra = Math.abs(numero % 10);

        System.out.println("La ultima cifra es: " + ultimaCifra);
    }
}

