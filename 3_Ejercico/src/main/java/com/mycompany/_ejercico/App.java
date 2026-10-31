/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._ejercico;
import java.util.Scanner;

/**
 *
 * @author FLEREZ
 */
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nota del primer corte (0.0 a 5.0): ");
        double nota1 = entrada.nextDouble();

        System.out.print("Nota del segundo corte (0.0 a 5.0): ");
        double nota2 = entrada.nextDouble();

        double notaNecesaria =
            (3.0 - (nota1 * 0.20) - (nota2 * 0.20)) / 0.60;

        if (notaNecesaria <= 0) {
            System.out.println("Ya alcanza la nota minima; necesita 0.0.");
        } else if (notaNecesaria > 5.0) {
            System.out.println("No es posible alcanzar 3.0; necesita mas de 5.0.");
        } else {
            System.out.println("Nota minima necesaria en el tercer corte: "
                               + notaNecesaria);
        }
    }
}

        
