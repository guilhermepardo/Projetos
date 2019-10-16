package br.com.bandtec.resolucoes.lista2;

public class UrnaEletronicaAvancada {

    private Integer votosZe = 0;
    private Integer votosMaria = 0;

    public Integer getTotalVotos() {
        return votosMaria + votosZe;
    }
    
    public void votarZe() {
        if (getTotalVotos()<10) {
            votosZe++;
        }
    }
    
    public void votarMaria() {
        if (getTotalVotos()<10) {
            votosMaria++;
        }
    }

    public Integer getVotosZe() {
        return votosZe;
    }

    public Integer getVotosMaria() {
        return votosMaria;
    }

    public String getResultado() {
        String resultado = "";
        
        if (getTotalVotos() == 10) {
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
