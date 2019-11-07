/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.listas;

/**
 *
 * @author Aluno
 */
public class Bairro {
    
    private String nome;
    private Integer populacao;
    
    public Bairro(String nome, Integer populacao) {
        this.nome = nome;
        this.populacao = populacao;
    }
  
    public String getNome() {
        return nome;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    @Override
    public String toString() {
        return "Bairro{" + "nome=" + nome + ", populacao=" + populacao + '}';
    }
    
    
}
