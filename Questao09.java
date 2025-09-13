/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1;

import java.util.Scanner;

/**
 *
 * @author leo
 */
public class Questao09 {
    public static void main(String[] args) {
        
        int numero;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe um numero entre 0 e 20: ");
        numero = input.nextInt();
        
        if(numero >= 0 && numero < 5){
            System.out.println("Intervalo: 0|---5");
            System.out.println("Fi = 23");
        }else if(numero >= 5 && numero < 10){
            System.out.println("Intervalo: 5|---10");
            System.out.println("Fi = 50");
        }else if(numero >=10 && numero < 15){
            System.out.println("Intervalo: 10|---15");
            System.out.println("Fi = 14");
        }else if(numero >=15 && numero < 20){
            System.out.println("Intervalo: 15|---20");
            System.out.println("Fi = 13");
        }
    }
}
