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
public class ExercicioYosh2i {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantidade de pessoas no elevador: ");
        Integer qtdElevador = leitor.nextInt();
        System.out.println("Digite o peso total: ");
        Double peso = leitor.nextDouble();
        Double pesoMedio = peso / qtdElevador;
        String frase = String.format("Entraram %d pessoas no elevador, Agora ele"
                + " tem %.2f kilos. O peso médio de cada pessoa é %.2f",
                qtdElevador, peso, pesoMedio);
        System.out.println(frase);
        
    }
}
