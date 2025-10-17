package com.github.davi.AchadosPlus.service;

import org.springframework.stereotype.Service;
import java.util.List;
import com.github.davi.AchadosPlus.Model.Entity.Bloco;
import com.github.davi.AchadosPlus.repository.BlocoRepository;

@Service
public class BlocoService {

    private final BlocoRepository blocoRepository;

    public BlocoService(BlocoRepository blocoRepository) {
        this.blocoRepository = blocoRepository;
    }

    // Retorna todos os blocos pra list no front
    public List<Bloco> getAll() {
        return blocoRepository.findAll();
    }
}
