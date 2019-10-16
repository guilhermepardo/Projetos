package br.com.bandtec.resolucoes.lista2.questao12.solucao3;

public class Boletim {
    
    protected Double nota;
    protected Double frequencia;
    
    protected Double notaMinima;
    protected Double frequenciaMinima;
    
    public Double getNota() {
        return nota;
    }

    public Double getFrequencia() {
        return frequencia;
    }

    public String getResultado() {
        return 
          nota >= notaMinima && frequencia >= frequenciaMinima
          ? "Aprovado"
          : "Reprovado";
    }
    
    
    
}
