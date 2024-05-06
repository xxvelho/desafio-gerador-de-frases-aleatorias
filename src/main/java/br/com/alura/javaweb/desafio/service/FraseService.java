package br.com.alura.javaweb.desafio.service;

import br.com.alura.javaweb.desafio.dto.FraseDTO;
import br.com.alura.javaweb.desafio.model.Frase;
import br.com.alura.javaweb.desafio.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FraseService {
    @Autowired
    private SerieRepository repository;

    public FraseDTO ObterFrase() {
        Optional<Frase> frase = repository.pegarFrase();
        if (frase.isPresent()){
            return converteDados(frase.get());
        }
        return null;
    }

    private FraseDTO converteDados(Frase serie){
        FraseDTO frase = new FraseDTO(serie.getId(), serie.getTitulo(), serie.getFrase(),
                                            serie.getPersonagem(), serie.getPoster());
        return frase;
    }
}
