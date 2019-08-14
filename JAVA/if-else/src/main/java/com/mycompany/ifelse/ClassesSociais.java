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
public class ClassesSociais {
    public static void main(String[] args) {
        Scanner leitor =  new Scanner(System.in);
        System.out.println("Qual seu salário bruto?");
        Double bruto = leitor.nextDouble();
        Double salarios = bruto / 900.0;
        System.out.println(String.format("Você ganha %.lf salarios",salarios));
        
        if (salarios < 2) {
            System.out.println("Classe D");
        }
        else if (salarios > 8) {
            System.out.println("Classe A");
        }
        else if (salarios > 4) {
            System.out.println("Classe B"); 
        }
        else {
            System.out.println("Classe C");
        }
    }
}
