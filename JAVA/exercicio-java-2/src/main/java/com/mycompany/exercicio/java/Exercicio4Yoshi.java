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
public class Exercicio4Yoshi {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos filhos de 0 a 3 anos você tem? ");
        Integer bebes = leitor.nextInt();
        System.out.println("Quantos filhos de 4 a 16 anos você tem? ");
        Integer crianca = leitor.nextInt();
        System.out.println("Quantos filhos de 17 a 18 anos você tem? ");
        Integer adulto = leitor.nextInt();
        Double bolsaBebe = bebes * 25.12;
        Double bolsaCrianca = crianca * 15.88;
        Double bolsaAdulto = adulto * 12.44;
        Double valorTotalDinheiro = bolsaBebe + bolsaCrianca + bolsaAdulto;
        Integer qtdFilhos = bebes + crianca + adulto;
        
        String frase = String.format("Você tem %d filhos e receberá %.2f de "
                + "bolsa.", qtdFilhos, valorTotalDinheiro);
        
        System.out.println(frase);
        
    }
}
