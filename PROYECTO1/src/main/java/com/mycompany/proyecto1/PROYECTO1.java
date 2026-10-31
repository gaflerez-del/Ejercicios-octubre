/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1;
import java.util.Scanner;
public class PROYECTO1 {
     public static void main(String[] args) {
         Scanner teclado =new Scanner(System.in);
         
         int valorhora,horastrabajadas,salarioneto;
         double salariototal, retefuente;
         
         System.out.println("ingresa el valor de la hora");
         valorhora =teclado.nextInt();
         
         System.out.println("ingresa la cantida de horas travajadas");
         horastrabajadas =teclado.nextInt();
         
         salarioneto=horastrabajadas*valorhora;
         System.out.println("el salario neto es:" + salarioneto);
         
         retefuente =salarioneto*0.05;
         
         
         
                 
         
         
         
        System.out.println("Hello World!");
    }
}
