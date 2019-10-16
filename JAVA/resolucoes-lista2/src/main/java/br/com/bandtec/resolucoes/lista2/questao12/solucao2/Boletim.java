package br.com.bandtec.resolucoes.lista2.questao12.solucao2;

public class Boletim {
    
    protected Double nota;
    protected Double frequencia;
    
    protected Double notaMinima;
    protected Double frequenciaMinima;
    
    protected String resultado;

    public Double getNota() {
        return nota;
    }

    public Double getFrequencia() {
        return frequencia;
    }

    public String getResultado() {
        resultado = 
          nota >= notaMinima && frequencia >= frequenciaMinima
          ? "Aprovado"
          : "Reprovado";
        
        return resultado;
    }
    
    
    
}
