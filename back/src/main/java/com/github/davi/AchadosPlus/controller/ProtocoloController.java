package com.github.davi.AchadosPlus.controller;

import com.github.davi.AchadosPlus.Model.Entity.Protocolo;
import com.github.davi.AchadosPlus.service.ProtocoloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/protocolos")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class ProtocoloController {

    @Autowired
    private final ProtocoloService protocoloService;

    public ProtocoloController(ProtocoloService protocoloService) {
        this.protocoloService = protocoloService;
    }

    @GetMapping
    public List<Protocolo> listarTodos() {
        return protocoloService.listarTodos();
    }

    @GetMapping("/busca/{id}")
    public Protocolo buscarPorId(@PathVariable Integer id) {
        return protocoloService.buscarPorId(id);
    }

    @PostMapping("/criar")
    public Protocolo criarProtocolo(@RequestBody Protocolo protocolo) {
        return protocoloService.salvar(protocolo);
    }

    @PutMapping("/set/{id}")
    public Protocolo atualizarProtocolo(@PathVariable Integer id, @RequestBody Protocolo protocolo) {
        protocolo.setIdProtocolo(id);
        return protocoloService.salvar(protocolo);
    }
}
