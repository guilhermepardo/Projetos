package br.com.bandtec.resolucoes.lista2.questao12.solucao1;

public class BoletimBandtec extends Boletim {

    public BoletimBandtec(Double nota, Double frequencia) {
        this.nota = nota;
        this.frequencia = frequencia;
        this.resultado = 
             nota>=5 && frequencia>=75 ? "Aprovado" : "Reprovado";
    }
    
}
