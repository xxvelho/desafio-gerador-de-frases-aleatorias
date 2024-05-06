package br.com.alura.javaweb.desafio.dto;

public record FraseDTO(
        Long id,
        String titulo,
        String frase,
        String personagem,
        String poster
) {
}
