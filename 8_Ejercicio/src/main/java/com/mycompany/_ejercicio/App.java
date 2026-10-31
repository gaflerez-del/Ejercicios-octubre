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

        System.out.print("Distancia en millas marinas: ");
        double millas = entrada.nextDouble();

        double metros = millas * 1852;

        System.out.println("Distancia en metros: " + metros);
    }
}


