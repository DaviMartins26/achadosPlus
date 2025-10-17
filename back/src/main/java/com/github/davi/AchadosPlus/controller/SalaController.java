package com.github.davi.AchadosPlus.controller;

import com.github.davi.AchadosPlus.Model.Entity.Sala;
import com.github.davi.AchadosPlus.service.SalaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salas")
@CrossOrigin(origins = "*")
public class SalaController {

    private final SalaService salaService;

    public SalaController(SalaService salaService) {
        this.salaService = salaService;
    }

    @GetMapping
    public List<Sala> listarTodas() {
        return salaService.listarTodas();
    }

    @GetMapping("/bloco/{idBloco}")
    public List<Sala> listarPorBloco(@PathVariable Integer idBloco) {
        return salaService.listarPorBloco(idBloco);
    }

    @PostMapping
    public Sala salvar(@RequestBody Sala sala) {
        return salaService.salvar(sala);
    }
}
