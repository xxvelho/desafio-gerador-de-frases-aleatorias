package br.com.alura.javaweb.desafio.repository;

import br.com.alura.javaweb.desafio.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface SerieRepository extends JpaRepository<Frase, Long> {
    @Query("SELECT f FROM Frase f order by function('RANDOM') LIMIT 1")
    Optional<Frase> pegarFrase();
}
