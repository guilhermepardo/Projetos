
package com.mycompany.nivelamento.java;

import java.util.Scanner;


public class ExercicioYoshi1 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        String nome = leitor.next();
        System.out.println("Digite a primeira nota:");
        Double nota1 = leitor.nextDouble();
        System.out.println("Digite a segunda nota:");
        Double nota2 = leitor.nextDouble();
        Double frase1 = (nota1 + nota2) / 2;
        String frase2 = String.format("Olá, %s, sua média %.2f"
        ,nome, frase1);
        System.out.println(frase2);
            
        
    }
    
   
          
    
}
