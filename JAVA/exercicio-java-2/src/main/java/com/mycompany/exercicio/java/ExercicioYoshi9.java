/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.java;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ExercicioYoshi9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos filhos de 0 a 3 anos você possui? ");
        Integer filhos0a3 = leitor.nextInt();
        System.out.println("Quantos filhos de 4 a 16 anos você possui? ");
        Integer filhos4a16 = leitor.nextInt();
        System.out.println("Qunatos filhos de 17 a 18 anos você possui? ");
        Integer filhos17a18 = leitor.nextInt();
        Integer qtdFilhos = filhos0a3 + filhos4a16 + filhos17a18;
        Double bolsaBebe = filhos0a3 * 25.12;
        Double bolsaCrianca = filhos4a16 * 15.88;
        Double bolsaAdolescente = filhos17a18 * 12.44;
        Double totalBolsa = bolsaBebe + bolsaCrianca + bolsaAdolescente;
        Double adicionalBolsa = 0.20 * totalBolsa;
        Double aumentoBolsa = totalBolsa + adicionalBolsa;
        
        String frase1 = String.format("Você tem %d filhos e receberá uma bolsa "
                + "de R$ %.2f", qtdFilhos, totalBolsa );
        
        String frase2 = String.format("Você tem %d filhos e receberá uma bolsa "
                + "de R$ %.2f, com um auxílio de mais 20%,"
                + " totalizando R$ %.2f", qtdFilhos, totalBolsa, aumentoBolsa);
        
        if (qtdFilhos <= 5) {
            System.out.println(frase1);
        }
    }
}
