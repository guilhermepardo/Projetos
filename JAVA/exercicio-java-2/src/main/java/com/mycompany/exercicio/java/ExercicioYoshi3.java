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
public class ExercicioYoshi3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        Double precoProduto = leitor.nextDouble();
        System.out.println("Digite a quantidade: ");
        Integer qtdProduto = leitor.nextInt();
        System.out.println("Digite quantos reais o cliente deu para a compra: ");
        Double qtdDinheiro = leitor.nextDouble();
        Double precoQtd = precoProduto * qtdProduto ;
        Double troco = qtdDinheiro - precoQtd ;
        String frase = String.format("O troco vai ser %.2f R$", troco);
        System.out.println(frase);
    }
}
