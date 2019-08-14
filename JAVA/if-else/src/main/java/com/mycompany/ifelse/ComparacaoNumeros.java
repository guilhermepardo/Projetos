/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ifelse;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ComparacaoNumeros {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o vamlor da sua idade: ");
        Integer idadeMinha = leitor.nextInt();
        System.out.println("Digite a idade de seu irmão: ");
        Integer idadeIrmao = leitor.nextInt();
        
        if (idadeMinha > idadeIrmao) {
            System.out.println("Você é o mais velho!");
        }
        
        if (idadeIrmao > idadeMinha) {
            System.out.println("Você é o mais novo!");
        }
        
        if (idadeIrmao == idadeMinha) {
            System.out.println("Vocês são gêmeos!");
        }
    }
}
