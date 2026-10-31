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

        System.out.print("Ingrese el lado a: ");
        double a = entrada.nextDouble();

        System.out.print("Ingrese el lado b: ");
        double b = entrada.nextDouble();

        double perimetro = 2 * a + 2 * b;
        double area = a * b;

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
    }
}

