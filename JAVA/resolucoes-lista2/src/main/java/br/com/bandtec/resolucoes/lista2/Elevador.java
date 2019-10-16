package br.com.bandtec.resolucoes.lista2;

public class Elevador {
    
    Integer passageiros = 0;
    Double peso = 0.0;
    
    
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
