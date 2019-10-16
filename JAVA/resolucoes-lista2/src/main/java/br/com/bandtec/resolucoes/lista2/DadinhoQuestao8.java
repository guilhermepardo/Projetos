package br.com.bandtec.resolucoes.lista2;

import java.util.Random;


public class DadinhoQuestao8 {
    
    Integer numero;
    Integer vitorias = 0;
    
    void sortear() {
        
        Random sorteador = new Random();
        numero = sorteador.nextInt(6)+1;
    }
    
    void registrarVitoria() {
        vitorias++;
    }
}
