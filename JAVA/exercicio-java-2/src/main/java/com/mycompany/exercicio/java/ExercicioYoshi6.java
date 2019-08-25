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
public class ExercicioYoshi6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu salário bruto: ");
        Double salarioBruto = leitor.nextDouble();
        System.out.println("Quanto você gasta de condução? ");
        Double conducao = leitor.nextDouble();
        Double descontoVT = conducao * 2 * 22;
        Double IR = 0.20 * salarioBruto;
        Double INSS = 0.10 * salarioBruto;
        Double descontoTotal = descontoVT + IR + INSS;
        Double salarioLiquido = salarioBruto -  descontoTotal;
        String frase = String.format("Seu salário bruto é R$ %.2f, tem um "
                + "total de R$ %.2f de desconto, e receberá um liquido de "
                + "R$ %.2f.", salarioBruto, descontoTotal, salarioLiquido);
        System.out.println(frase);
        
        
    }
        
        
    }

