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
public class ExercicioYoshi8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o valor do produto? ");
        Double valorProduto = leitor.nextDouble();
        System.out.println("Qual a quantidade comprada? ");
        Integer qtdProduto = leitor.nextInt();
        System.out.println("Qual o valor pago pelo cliente? ");
        Double valorPago = leitor.nextDouble();
        Double precoTotal = valorProduto * qtdProduto;
        Double troco = valorPago - precoTotal;
        String frase1 = String.format("Seu troco será de %.2f", troco);
        
        if (valorPago > precoTotal) {
            System.out.println(frase1);
        }
        
        else if (valorPago < precoTotal) {
            System.out.println("Precisa de mais dinheiro!");
        }
        
        else if (valorPago == precoTotal) {
            System.out.println("Sem troco!");
        }
        
        
        
    }
}
