/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classes;

import java.util.Scanner;

/**
 *
 * @author ALUNO TI
 */
public class Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int velocidade;
        float distancia, tempo, consumo;
        
        System.out.println("Informe o tempo gasto na viagem: ");
        tempo = sc.nextFloat();
        System.out.println("Informe a velocidade media na viagem: ");
        velocidade = sc.nextInt();
        
        distancia = velocidade * tempo;
        consumo = distancia / 12;
        
        System.out.println("Velocidade media = " + velocidade);
        System.out.println("Tempo gasto na viagem = " + tempo);
        System.out.println("Distancia percorrida = " + distancia);
        System.out.println("Quantidade de litros utilizado = " + consumo);
        
    }
}
