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

        System.out.print("Ingrese la base: ");
        double base = entrada.nextDouble();

        System.out.print("Ingrese la altura: ");
        double altura = entrada.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("Area del triangulo: " + area);
    }
}

