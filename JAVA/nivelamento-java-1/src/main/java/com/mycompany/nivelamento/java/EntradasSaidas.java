/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.nivelamento.java;

import java.util.Scanner;



/**
 *
 * @author Aluno
 */
public class EntradasSaidas {
  
    public static void main(String[] args) {
        
        String cidade = "São Paulo";
        
        //É posssivel colocar under lines nos números no Java
        
        Integer populacao = 15_000_000;
        Double temperaturaMedia = 23.7235678123;
        
        //Unindo va concatenação
        
        String frase1 = " Voce mora em " +cidade
                        +" onde moram "+populacao+" pessoas ";
                        
        System.out.println(frase1);
                    
        String frase2 = String.format(
        "Você mora em %s onde moram %d pessoas",cidade, populacao);
        
        System.out.println(frase2);
        
        //%.2f deixa 2 casas após a virgula
        
        String frase3 = String.format("Em %s faz %.2f celsius em média",cidade,
                temperaturaMedia);
        
        System.out.println(frase3);
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Informe sua fruta favorita:");
        
        String fruta = leitor.next();
        System.out.println("Sua fruta favorita é:"+fruta);
        
        System.out.println("Informe seu semestre:");
        Integer semestre = leitor.nextInt();
        
        System.out.println("Informe sua altura:");
        Double altura = leitor.nextDouble();
        
        System.out.println("");
                
    }
    
}
