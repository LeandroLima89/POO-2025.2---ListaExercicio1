
package com.mycompany.listaprimeiraunidade;

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        
        int qtdPessoas, i;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe quantas pessoas serao digitadas: ");
        qtdPessoas = input.nextInt();
        
        double[] altura = new double[qtdPessoas];
        int[] sexo = new int[qtdPessoas];
        double maiorAltura=0, menorAltura=3.00, totalAlturaM = 0, mediaAlturaM = 0, percentual;
        int contHomens=0, contMulheres=0, contMulheresAbaixo=0;
        
        for (i = 0; i < qtdPessoas; i++){
            System.out.println("Informe a altura da " +(i+1) + "o pessoa");
            altura[i] = input.nextDouble();
            System.out.println("Informe o sexo da " + (i+1) + "o pessoa (1 - Masculino 2 - Feminino): ");
            sexo[i] = input.nextInt();
            
            if (altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
            if (altura[i] < menorAltura){
                menorAltura = altura[i];
            }
            
            if (sexo[i] == 1){
                contHomens = contHomens + 1;
            }
            else{
                contMulheres = contMulheres + 1;
                totalAlturaM = altura[i] + totalAlturaM;
                mediaAlturaM = totalAlturaM / contMulheres;
            }
            
            if(altura[i] < 1.68){
                contMulheresAbaixo = contMulheresAbaixo + 1;
            }
        }
        percentual =   (contMulheresAbaixo * 100) / contMulheres;
        
        System.out.println("A maior altura do grupo eh: " + maiorAltura);
        System.out.println("A menor altura do grupo eh: " + menorAltura);
        System.out.println("O numero de homem(ns) eh: " + contHomens + " homem(ns)");
        System.out.println("A media de altura das mulheres eh: " + mediaAlturaM);
        System.out.println("O percentual de mulheres abaixo de 1.68m eh: " + percentual + "%");
    }
}
