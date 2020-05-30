package br.com.bandtec.jpa5.controladores;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class ProvinhaControllerTest {

    @Test
    void TudoCerto() {
        ProvinhaController controller = new ProvinhaController();
        double media = 6.0;
        double frequencia = 70.0;
        assertEquals(ResponseEntity.status(HttpStatus.CREATED).build(),controller.boletimEscolar(media, frequencia));
    }

    @Test
    void mediaInvalida() {
        ProvinhaController controller = new ProvinhaController();
        double media = 4.0;
        double frequencia = 70.0;
        assertEquals(ResponseEntity.status(HttpStatus.CREATED).build(),controller.boletimEscolar(media, frequencia));
    }

    @Test
    void frequenciaInvalida() {
        ProvinhaController controller = new ProvinhaController();
        double media = 6.0;
        double frequencia = 50.0;
        assertEquals(ResponseEntity.status(HttpStatus.CREATED).build(),controller.boletimEscolar(media, frequencia));
    }

    @Test
    void frequenciaEMediaInvalida() {
        ProvinhaController controller = new ProvinhaController();
        double media = 4.0;
        double frequencia = 50.0;
        assertEquals(ResponseEntity.status(HttpStatus.CREATED).build(),controller.boletimEscolar(media, frequencia));
    }

}