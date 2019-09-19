package com.mycompany.projeto.swing.dominio;

public class Cofrinho {
    
    // atributos (caracteristicas)
    public Double valorDepositado = 0.0;
    public String corFrase;
    public String frase;

    //metodos (habilidades
    //método para depositar 0,50
    public void depositar050() {
        valorDepositado += 0.50;
        atualizar();
    }

    //método para depositar 1,00
    public void depositar100() {
        valorDepositado += 1.0;
        atualizar();
    }

    //método que atualiza a frase e a cor
    public void atualizar() {
        if (valorDepositado <= 3.5) {
            frase = "Pobre";
            corFrase = "#AA0000"; // vermelho
        } else if (valorDepositado > 3.5 && valorDepositado <= 7) {
            frase = "Nem tão Pobre";
            corFrase = "#FFBB00"; // laranja
        } else {
            frase = "Rico";
            corFrase = "#00AA00"; // verde escuro
        }
    }
}
