package br.com.bandtec.projeto.swing.construtores;

public class PessoaAfrodescendente {
    private String cor;
    private String densidadeOssea;
    private Double pesoMedio;

    // método CONSTRUTOR
    // é invocado quando é criado
    // um objeto desta classe
    // como não possui argumento, é um "construtor PADRÃO"
    public PessoaAfrodescendente() {
        cor = "negra";
        densidadeOssea = "alta";
        pesoMedio = 3.8;
    }

    
    
    public String getCor() {
        return cor;
    }

    public String getDensidadeOssea() {
        return densidadeOssea;
    }

    public Double getPesoMedio() {
        return pesoMedio;
    }
    
    
}
