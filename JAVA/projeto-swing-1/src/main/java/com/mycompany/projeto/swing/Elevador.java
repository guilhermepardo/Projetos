/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.swing;

/**
 *
 * @author Aluno
 */
public class Elevador {
    Integer passageiros = 0;
    Double peso = 0.0 ;
    
    void entrarHomem() {
        peso += 90;
        passageiros++;
    }
    
    void entrarMulher() {
        peso += 65;
        passageiros++;
    }
    
    void entrarCrianca() {
        peso += 40;
        passageiros++;
    }
}
