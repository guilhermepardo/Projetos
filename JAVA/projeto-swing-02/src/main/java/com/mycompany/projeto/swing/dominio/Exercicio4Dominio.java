/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.swing.dominio;

import java.util.Random;

/**
 *
 * @author macos
 */
public class Exercicio4Dominio {
   
    public String cor;
    public String status;
    public Integer sorteio=0;
    public Random aleatorio = new Random();

    public void random(){
        sorteio = aleatorio.nextInt(100)+1;
    }
    
    
    public void mudaStatus(){
        if(sorteio>0 && sorteio <=20){
            cor="#120a8f";
            status = "Suave";
        }
        else if(sorteio>20 && sorteio <=70) {
            cor="#c8a2c8";
            status = "Atenção";
        }
        else {
            cor="#8b0000";
            status = "Crítico";
        }
    }
}
