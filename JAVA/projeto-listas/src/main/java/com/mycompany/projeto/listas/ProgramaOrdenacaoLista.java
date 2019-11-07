/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.listas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/**
 *
 * @author Aluno
 */
public class ProgramaOrdenacaoLista {
    public static void main(String[] args) {
        
    
    Bairro b1 = new Bairro("Saúde", 22_000);
    Bairro b2 = new Bairro("Pinheiros", 15_000);
    Bairro b3 = new Bairro("Bela Vista", 9_000);
    Bairro b4 = new Bairro("Artur Alvim", 100_000);
    
    List<Bairro> bairros =  Arrays.asList(b1,b2,b3,b4);

   //Ordenação usando Java 8+
  bairros.sort(Comparator.comparing(bairro -> {
      return bairro.getPopulacao();
  }));
   
        System.out.println("bairros após 1º ordenação: "+bairros);
  
        bairros.sort(Comparator.comparing(Bairro :: getNome));
        System.out.println("bairros após 2ª ordenação: "+bairros);
        
        bairros.sort(Comparator.comparing(Bairro :: getNome).reversed());
        System.out.println("bairros após 3ª ordenação: "+bairros);
          }       
}
