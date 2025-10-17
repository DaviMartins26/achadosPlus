package com.github.davi.AchadosPlus.service;

import com.github.davi.AchadosPlus.Model.Entity.Protocolo;
import com.github.davi.AchadosPlus.repository.ProtocoloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProtocoloService {

    @Autowired
    private final ProtocoloRepository protocoloRepository;

    public ProtocoloService(ProtocoloRepository protocoloRepository) {
        this.protocoloRepository = protocoloRepository;
    }

    public List<Protocolo> listarTodos() {
        return protocoloRepository.findAll();
    }

    public Protocolo buscarPorId(Integer id) {
        return protocoloRepository.findById(id).orElse(null);
    }

    public Protocolo salvar(Protocolo protocolo) {
        return protocoloRepository.save(protocolo);
    }

    public void excluir(Integer id) {
        protocoloRepository.deleteById(id);
    }
}
