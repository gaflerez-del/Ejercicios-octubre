/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercico;
import java.util.Scanner;
        

/**
 *
 * @author FLEREZ
 */
public class App {

    public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);

        System.out.print("Precio del articulo: ");
        double precio = entrada.nextDouble();

        // Ejemplo: 19%. Cambie este valor si el instructor indica otra tarifa.
        double porcentajeIVA = 0.19;
        double valorIVA = precio * porcentajeIVA;

        System.out.println("Valor del IVA: $" + valorIVA);
    }
}