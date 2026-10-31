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

        System.out.print("Medida en centimetros: ");
        double centimetros = entrada.nextDouble();

        double pulgadas = centimetros / 2.54;

        System.out.println("Medida en pulgadas: " + pulgadas);
    }
}
