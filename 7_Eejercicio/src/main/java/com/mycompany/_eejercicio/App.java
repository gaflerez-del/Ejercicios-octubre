/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._eejercicio;
import java.util.Scanner;

/**
 *
 * @author FLEREZ
 */
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Temperatura en grados Fahrenheit: ");
        double fahrenheit = entrada.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Temperatura en Celsius: " + celsius);
    }
}
        
