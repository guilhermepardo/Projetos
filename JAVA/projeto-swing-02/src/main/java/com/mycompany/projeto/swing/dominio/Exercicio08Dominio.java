/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.swing.dominio;

/**
 *
 * @author macos
 */
public class Exercicio08Dominio {

    public Integer passageiro = 0;
    public Double pesoTotal = 0.00;

    public void getTotalPessoas() {
        passageiro++;
    }

    public void sobeHomem() {
        pesoTotal += 90;
        getTotalPessoas();
    }

    public void sobeMulher() {
        pesoTotal += 65;
        getTotalPessoas();
    }

    public void sobeCrianca() {
        pesoTotal += 40;
        getTotalPessoas();
    }

}
