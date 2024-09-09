/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double far , cent, kel;
     Scanner capturar = new Scanner(System.in);
     System.out.println("Ingresa los grados farenheith :" );
     far = capturar.nextDouble();
     cent = (far - 32)/1.8;
     System.out.println("Los grados centigrados son;" + cent);
     
     System.out.println("Ingresa los grados Celsius: ");
     cent = capturar.nextDouble();
     far = cent * 1.8 + 32;
     System.out.println("Los grados centigrados son;" + far);
     
     
    }
    
}
