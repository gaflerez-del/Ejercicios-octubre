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

        System.out.print("Ingrese el primer lado: ");
        double lado1 = entrada.nextDouble();

        System.out.print("Ingrese el segundo lado: ");
        double lado2 = entrada.nextDouble();

        System.out.print("Ingrese el tercer lado: ");
        double lado3 = entrada.nextDouble();

        double perimetro = lado1 + lado2 + lado3;

        System.out.println("Perimetro del triangulo: " + perimetro);
    }
}
 
