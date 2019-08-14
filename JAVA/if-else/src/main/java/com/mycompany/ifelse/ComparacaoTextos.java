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
public class ComparacaoTextos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Você é a favor do fim do FGTS?"
                + "S (sim), N (não) ou NDA (não sabe responder)");
        String resposta = leitor.next();
        if (resposta.equals("S")) {
            System.out.println("Você é a favor");
        }
        else if (resposta.equals("N")) {
            System.out.println("Você é contra");
        }
        else {
            System.out.println("Você não tem opinião formada");
        }
    }
}
