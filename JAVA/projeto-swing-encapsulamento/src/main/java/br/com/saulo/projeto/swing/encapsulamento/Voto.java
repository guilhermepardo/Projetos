/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saulo.projeto.swing.encapsulamento;

/**
 *
 * @author Aluno
 */
public class Voto {
    private Integer votosZe = 0;
    private Integer votosMaria = 0;
    private Integer totalVotos = 0;
    private String resultado;
    
    public void votarZe() {
        if (totalVotos<10) {
        votosZe++;
        totalVotos++;
    }
    }
    
    public void votarMaria() {
        if (totalVotos<10) {
        votosMaria++;
        totalVotos++;
    }
}

    public Integer getVotosZe() {
        return votosZe;
    }

    public Integer getVotosMaria() {
        return votosMaria;
    }
    
    public String getResultado() {
        
    }
    
}    
