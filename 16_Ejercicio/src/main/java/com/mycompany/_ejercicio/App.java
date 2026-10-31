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

        System.out.print("Ingrese el radio del circulo: ");
        double radio = entrada.nextDouble();

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("Area del circulo: " + area);
    }
}