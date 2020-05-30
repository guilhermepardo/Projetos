package br.com.bandtec.jpa5.controladores;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProvinhaController {

    @PostMapping("/media-minima/{media}/frequencia-minima/{frequencia}")
    public ResponseEntity boletimEscolar(@PathVariable Double media, @PathVariable Double frequencia) {
        if (media < 5.0 || media > 10.0 ) {
            return ResponseEntity.badRequest().body("A média deve ser entre 5.0 e 10.0. Você tentou com "+media);
        }
        if (frequencia < 60.0 || frequencia > 100.0) {
            return ResponseEntity.badRequest().body("A frequência deve ser entre 60.0 e 100.0. Você tentou com "+frequencia+"");
        }
        if (media < 5.0 || media > 10.0 && frequencia < 60.0 || frequencia > 100.0) {
            return ResponseEntity.badRequest().body("Mano, sério?! Tudo errado!");
        }
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }



}
