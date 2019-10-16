package br.com.bandtec.resolucoes.lista2;

public class UrnaEletronica {

    private Integer votosZe = 0;
    private Integer votosMaria = 0;
    private Integer totalVotos = 0;
    private String resultado = "";
    
    
    public void votarZe() {
        if (totalVotos<10) {
            votosZe++;
            totalVotos++;
        }
    }
    
    public void votarMaria() {
        if (totalVotos<10) {
            votosMaria++;
            totalVotos++;
        }
    }

    public Integer getVotosZe() {
        return votosZe;
    }

    public Integer getVotosMaria() {
        return votosMaria;
    }

    public String getResultado() {
        if (totalVotos == 10) {
            if (votosMaria == votosZe) {
                resultado = "Empate. Necessária nova votação";
            } else if (votosMaria > votosZe) {
                resultado = "Maria Bigodenha venceu";
            } else {
                resultado = "Zé Ruela venceu";
            }
        }
        return resultado;
    }
    
    
    
    
    
    
}
