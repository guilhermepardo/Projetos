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
public class ComparacaoaNome {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a capital do Brasil");
        String capital = leitor.next();
        if (!capital.equals("brasilia") && !capital.equals("Brasília")) {
            System.out.println("ERRRRRRRRRRRRRRRRROUUUUUUUU");
        }
        else {
            System.out.println("Isso mesmo!!!");
        }
        System.out.println("Digite a primeira letra da sua zona");
        
        String zona = leitor.next();
        if (zona.equalsIgnoreCase("N")) {
            System.out.println("Zona Norte");
        }
        else if  (zona.equalsIgnoreCase("S")) {
               System.out.println("Zona Sul");
        }
        else if (zona.equalsIgnoreCase("O")) {
            System.out.println("Zona Oeste");
        }
        else {
            System.out.println("Zona Leste");
        }
        
    }
    
    
}
