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
public class ExercicioYoshi4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreva deu login: ");
        String loginCliente = leitor.next();
        System.out.println("Escreva sua senha");
        String senhaCliente = leitor.next();
        System.out.println("Quantas vezes você aceita errar a senha?");
        Integer qtdTentativa = leitor.nextInt();
        String frase = String.format("Seu login é %s, sua senha é %s. Você "
                + " tem %d tentativas antes de ser bloqueado.", loginCliente, 
                senhaCliente, qtdTentativa);
        System.out.println(frase);
        
        
                
    }
}
