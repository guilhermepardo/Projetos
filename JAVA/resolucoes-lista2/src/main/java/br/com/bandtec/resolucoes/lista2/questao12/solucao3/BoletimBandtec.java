package br.com.bandtec.resolucoes.lista2.questao12.solucao3;

public class BoletimBandtec extends Boletim {

    public BoletimBandtec(Double nota, Double frequencia) {
        this.nota = nota;
        this.frequencia = frequencia;
        
        this.notaMinima = 5.0;
        this.frequenciaMinima = 75.0;
    }
    
}
