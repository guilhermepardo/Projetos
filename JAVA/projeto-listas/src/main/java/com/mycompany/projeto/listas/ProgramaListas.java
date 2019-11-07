/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.listas;

import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.ls.LSInput;

/**
 *
 * @author Aluno
 */
public class ProgramaListas {
    
    public static void main(String[] args) {
        // uma lista (List) no Java é como um vetor
        // porém, é dinâmico (cresce e diminui)
        
        List listaLoka = new ArrayList();
        
        listaLoka.add("olá");
        listaLoka.add(99);
        listaLoka.add(15.73);
        listaLoka.add(false);
        
        System.out.println("listaLoka: "+listaLoka);
        
        //quantos elementos existem na lista?
        
        System.out.println("Quanatos na listaLoka?"+listaLoka.size());
        
        // a lista ta vazia?
        
        System.out.println("Lista vazia?"+listaLoka.isEmpty());
        
        //obtendo um determinado elemento da lista
        System.out.println("2gundo elemento da lista: "+listaLoka.get(1));
        
        System.out.println("4º elemento da listaLoka: "+listaLoka.get(3));
        
        System.out.println("1º elemento da listaLoka: "+listaLoka.get(0));
        
        //removendo um elemento da lista
        listaLoka.remove(1);
        System.out.println("Após remover o 1: "+listaLoka);
        
        listaLoka.remove("paixão");
        System.out.println("removeu 'paixão'?"+listaLoka); 
    //se o elemento  não existir nada acontece
               
         listaLoka.remove("olá");
        System.out.println("removeu 'olá'?"+listaLoka);
    
        listaLoka.add("abc");
        listaLoka.add("abc");
        System.out.println(listaLoka);
        
        listaLoka.remove("abc");
        System.out.println("Removeu 'abc?"+listaLoka);
         
        //encontrando um elemento na lista
        System.out.println("Onde está a pêra"+listaLoka.indexOf("pêra"));
        //o indexOf retorna -1 caso o  valor não exista na lista
        
        System.out.println("Onde está o abc? "+listaLoka.indexOf("abc"));
        // o indexOf retorna o 1º indice (ou posição) onde encontrou o valor

        //Inserindo uma lista na outra 
        List lista2 = new ArrayList();
        lista2.add("feijão");
        lista2.add(888);
        lista2.add(77.22);
        
        listaLoka.addAll(lista2);
        System.out.println("listaLoka + lista2 ->"+listaLoka);
        
        //apagando a lista (remover todos)
        listaLoka.clear();
        
                
                
        
    }
    
}
