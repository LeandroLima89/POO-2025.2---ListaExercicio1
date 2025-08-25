
package com.mycompany.listaprimeiraunidade;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        
        float[] valor = new float[5];
        int i, contNegativo=0, contPositivo=0, contZero=0;
        
        
        Scanner input = new Scanner(System.in);
        
        for (i=0; i<5; i++){
            System.out.println("Digite o " + (i+1) + "o numero: ");
            valor[i] = input.nextInt();
            
            if (valor[i] < 0) {
                contNegativo = contNegativo + 1;
            }
            else if (valor[i] > 0) {
                contPositivo = contPositivo + 1;
            }
            else {
                contZero = contZero + 1;
            }
        }
        
        System.out.println("Quantidade de numeros negativos: " + contNegativo);
        System.out.println("Quantidade de numeros positivos: " + contPositivo);
        System.out.println("Quantidade de zeros: " + contZero);
        
        
    }
}
