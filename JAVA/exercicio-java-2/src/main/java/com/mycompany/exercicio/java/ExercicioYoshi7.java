/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.java;

import java.util.Scanner;

/**
 *
 * @author Guilherme
 */
public class ExercicioYoshi7 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos minutos de aquecimento? ");
        Integer aquecimento = leitor.nextInt();
        System.out.println("Quantos minutos de exercicios aeróbicos? ");
        Integer aerobico = leitor.nextInt();
        System.out.println("Quantos minutos de musculação? ");
        Integer musculacao = leitor.nextInt();
        Integer perdaCalAquecimento = aquecimento * 12;
        Integer perdaCalAerobico = aerobico * 20;
        Integer perdaCalMusculacao = musculacao * 25;
        Integer perdaTotalCalorias = perdaCalAquecimento + perdaCalAerobico 
                + perdaCalMusculacao;
        Integer totalMinutos = aquecimento + aerobico + musculacao;
        String frase = String.format("Olá, você fez %d minutos de exercicío "
                + "e perdeu cerca de %d calorias!", totalMinutos, 
                perdaTotalCalorias);
        System.out.println(frase);
    }
    
}
