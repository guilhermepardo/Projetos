package br.com.bandtec.resolucoes.lista2;

import java.util.Random;


public class DadinhoQuestao7 {
    
    Integer numero;
    
    void sortear() {
        Random sorteador = new Random();
        numero = sorteador.nextInt(6)+1;
    }
}
