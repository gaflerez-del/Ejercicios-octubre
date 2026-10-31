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

        System.out.print("Valor de la hora: ");
        double valorHora = entrada.nextDouble();

        System.out.print("Horas trabajadas: ");
        double horas = entrada.nextDouble();

        double salarioTotal = valorHora * horas;
        double retencion = salarioTotal * 0.05;
        double salarioNeto = salarioTotal - retencion;

        System.out.println("Salario total: $" + salarioTotal);
        System.out.println("Retencion 5%: $" + retencion);
        System.out.println("Salario neto: $" + salarioNeto);
    }
}

        
