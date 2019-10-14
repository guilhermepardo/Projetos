package br.com.bandtec.projeto.swing.construtores;

public class PessoaTransgenica {
    private String cor;
    private String densidadeOssea;
    private Double pesoMedio;

    // uma vez que criamos um construtor não vazio 
    // (ou seja, com argumentos)
    // o Java NÃO CRIA MAIS o construtor padrão pra nós
    public PessoaTransgenica(
            String cor, String densidadeOssea, Double pesoMedio) {    
        this.cor = cor;
        this.densidadeOssea = densidadeOssea;
        this.pesoMedio = pesoMedio;
    }

    public PessoaTransgenica() {
        
    }

    // podemos criar construtores que não tenham
    // todos os atributos
    public PessoaTransgenica(String cor, String densidadeOssea) {
        this.cor = cor;
        this.densidadeOssea = densidadeOssea;
    }
    
    
    public String getCor() {
        return this.cor;
    }

    public String getDensidadeOssea() {
        return this.densidadeOssea;
    }

    public Double getPesoMedio() {
        return pesoMedio;
    }
    
    
}
