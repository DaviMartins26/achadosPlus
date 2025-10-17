package com.github.davi.AchadosPlus.service;

import com.github.davi.AchadosPlus.Model.Entity.Sala;
import com.github.davi.AchadosPlus.repository.SalaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SalaService {

    private final SalaRepository salaRepository;

    public SalaService(SalaRepository salaRepository) {
        this.salaRepository = salaRepository;
    }

    public List<Sala> listarTodas() {
        return salaRepository.findAll();
    }

    public List<Sala> listarPorBloco(Integer idBloco) {
        return salaRepository.findByBlocoIdBloco(idBloco);
    }

    public Sala salvar(Sala sala) {
        return salaRepository.save(sala);
    }
}
