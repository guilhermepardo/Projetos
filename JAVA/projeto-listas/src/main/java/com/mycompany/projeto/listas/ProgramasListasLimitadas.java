/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.listas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ProgramasListasLimitadas {

    public static void main(String[] args) {
        // listas que só aceitam um tipo
        List<String> frases = new ArrayList<>();
        
        frases.add("amor");
        frases.add("ódio");
        frases.add("paixão");
        // a lista só vai compilar com String
        
        System.out.println(frases);
        
        List<Boolean> afirmacoes = new ArrayList<>();
        afirmacoes.add(true);
        afirmacoes.add(false);
        afirmacoes.add(false);
        afirmacoes.add(true);
        // a lista só vai compilar com true or false
        
        Esporte esp = new Esporte();
        Futebol fut = new Futebol();
        Boxe box = new Boxe();
        
        // a limitação do tipo numa lista significa que ela aceitará
        // o tipo e suas subclasses
        List<Esporte> esportes = new ArrayList<>();
        esportes.add(esp);
        esportes.add(fut);
        esportes.add(box);
        
        System.out.println("Esportes: "+ esportes);
    }
    
}
