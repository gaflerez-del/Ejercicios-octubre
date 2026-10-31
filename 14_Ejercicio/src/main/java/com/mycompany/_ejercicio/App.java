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

        System.out.print("Tiempo total en segundos: ");
        int totalSegundos = entrada.nextInt();

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.println(horas + " horas, " + minutos
                           + " minutos y " + segundos + " segundos.");
    }
}

