package br.com.bandtec.jpa5.controladores;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

// testes automatizados de código em Java possuem como biblioteca padrão o JUnit
class CalculadoraControllerTest {

    @Test
    @DisplayName("A soma deve somar corretamente 2 números reais")
    void somar() {
        CalculadoraController controller = new CalculadoraController();

        // cenário 1
        double n1 = 10;
        double n2 = 20;
        double esperado = 30;
        ResponseEntity resposta = controller.somar(n1, n2);

        assertEquals(30.0, resposta.getBody(), "Soma entre " + n1 + " e " + n2 + " deve dar " + esperado);

        // cenário 2
        n1 = 35;
        n2 = 65;
        esperado = 100;
        resposta = controller.somar(n1, n2);
        assertEquals(100.0, resposta.getBody(), "Soma entre " + n1 + " e " + n2 + " deve dar " + esperado);
    }

    @Test
    void dividir() {
        CalculadoraController controller = new CalculadoraController();

        // cenário 1
        double n1 = 40;
        double n2 = 2;
        double esperado = 20;
        ResponseEntity resposta = controller.dividir(n1, n2);
        assertEquals(200, resposta.getStatusCodeValue(), "Divisão possível retorna status 200");
        assertEquals(esperado, resposta.getBody(), "Divisão entre " + n1 + " e " + n2 + " deve dar " + esperado);

        // cenário 2
        n1 = 15;
        n2 = 0;
        resposta = controller.dividir(n1, n2);
        assertEquals(400,resposta.getStatusCodeValue(), "Divisão por 0 retorna status 400");
        assertEquals("Não posso dividir por 0!", resposta.getBody());
    }

}