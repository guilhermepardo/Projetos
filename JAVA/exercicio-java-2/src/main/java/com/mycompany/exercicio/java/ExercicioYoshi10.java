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
public class ExercicioYoshi10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a sua média: ");
        Double media = leitor.nextDouble();
        System.out.println("Digite a sua frequÊncia: ");
        Integer frequencia = leitor.nextInt();
        String situacao  = media>7 && frequencia > 75? "Aprovado" : "Reprovado";
        System.out.println(situacao);
    }
}
