package com.github.davi.AchadosPlus.service;

import com.github.davi.AchadosPlus.Model.Entity.Objeto;
import com.github.davi.AchadosPlus.Model.Entity.Protocolo;
import com.github.davi.AchadosPlus.repository.ObjetoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ObjetoService {

    private final ObjetoRepository objetoRepository;

    public ObjetoService(ObjetoRepository objetoRepository) {
        this.objetoRepository = objetoRepository;
    }

    // Criação do objeto
    public Objeto criarObjeto(Objeto objeto) {
        //objeto.setStatus(1); // Perdido
        //objeto.setRelacionado(null); // Sem protocolo no momento
        return objetoRepository.save(objeto);
    }

    // Atualiza o status do objeto (chamado futuramente quando devolvido)
    @Transactional
    public void atualizarStatus(Objeto objeto, int status) {
        objeto.setStatus(status);
        objetoRepository.save(objeto);
    }

    public Optional<Objeto> buscarPorId(Integer id) {
        return objetoRepository.findById(id);
    }

    public List<Objeto> buscarTodos() {
        return objetoRepository.findAll();
    }
}
