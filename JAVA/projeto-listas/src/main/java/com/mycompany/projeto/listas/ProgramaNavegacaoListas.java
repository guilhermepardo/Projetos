/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.listas;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ProgramaNavegacaoListas {
 
        public static void main(String[] args) {
        //criando uma lista com elementos 
            List<String> textos = Arrays.asList("Chile", "Argentina", "Brasil");
    
       // métodos de ITERAÇÃO numa lista
       
       // método 1: 'for clássico'
       for(Integer i=0; i<textos.size(); i++) {
           System.out.println(i+" - "+textos.get(i));
       }   
       
            System.out.println("");
            
            //método 2: 'enhanced for'
            for (String texto : textos) {
                System.out.println(texto);
            }
            
            // método 3: 'foreach' (Java 8+)
            // também podemos dizer que aqui 
            //usamos uma expressão LAMBDA (Lambda expression)
            textos.forEach(texto -> {
                System.out.println(texto);
            });
            
            //ordenação simples (ou padrão)
            Collections.sort(textos);
            
            System.out.println("lista após sort(): "+textos);
            
            List<Double> numeros =
                    Arrays.asList(12.9, 50.0, 20.7, 9.0);
            Collections.sort(numeros);
            
            System.out.println("números após sort():" +numeros);
            
            List listas = Arrays.asList(numeros, textos);
            Collections.sort(listas);
            // O Collections.sort() é bem limitado
            //listas de tipos complexos ele não suporta
            
            //assim o código abaixo nem compila
            //Collections.sort(listas);

            System.out.println("listas após sort(): "+listas);
            
        }
    
}
