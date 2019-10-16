package br.com.bandtec.resolucoes.lista2.questao12.solucao1;

public class BoletimUniesquina extends Boletim {

    public BoletimUniesquina(Double nota, Double frequencia) {
        this.nota = nota;
        this.frequencia = frequencia;
        this.resultado = 
             nota>=4 && frequencia>=30 ? "Aprovado" : "Reprovado";
    }
    
}
