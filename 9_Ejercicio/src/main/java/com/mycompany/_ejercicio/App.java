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

        System.out.print("Precio de tarifa: ");
        double precioTarifa = entrada.nextDouble();

        System.out.print("Precio pagado: ");
        double precioPagado = entrada.nextDouble();

        if (precioTarifa > 0) {
            double descuento = precioTarifa - precioPagado;
            double porcentaje = (descuento / precioTarifa) * 100;
            System.out.println("Porcentaje descontado: " + porcentaje + "%");
        } else {
            System.out.println("El precio de tarifa debe ser mayor que cero.");
        }
    }
}

