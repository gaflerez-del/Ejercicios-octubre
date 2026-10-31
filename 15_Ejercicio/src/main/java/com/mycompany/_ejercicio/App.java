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

        System.out.print("Valor por unidad: ");
        double valorUnidad = entrada.nextDouble();

        System.out.print("Cantidad de articulos: ");
        int cantidad = entrada.nextInt();

        double total = valorUnidad * cantidad;

        System.out.println("Valor total a pagar: $" + total);
    }
}

