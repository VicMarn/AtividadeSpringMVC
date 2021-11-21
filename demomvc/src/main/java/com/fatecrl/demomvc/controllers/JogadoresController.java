package com.fatecrl.demomvc.controllers;
import java.util.List;
import com.fatecrl.demomvc.models.Jogador;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JogadoresController {

    private List<Jogador> jogadores = List.of(
            new Jogador("João Paulo","Goleiro","Goleiro excelente"),
            new Jogador("Marinho","Atacante","Já foi bom, hoje tá bem ruim"),
            new Jogador("Pará","Lateral","Ruim demais, pelo amor de Deus"),
            new Jogador("Pirani","Meia-atacante","Jovem ainda, mas tem muito potencial")
    );

    @GetMapping("/Jogadores")
    private List<Jogador> getJogadores(){
        return jogadores;
    }
}
