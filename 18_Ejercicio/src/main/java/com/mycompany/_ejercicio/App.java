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

        System.out.print("Ingrese la medida del lado: ");
        double lado = entrada.nextDouble();

        double perimetro = 4 * lado;
        double area = lado * lado;

        System.out.println("Perimetro del cuadrado: " + perimetro);
        System.out.println("Area del cuadrado: " + area);
    }
}
