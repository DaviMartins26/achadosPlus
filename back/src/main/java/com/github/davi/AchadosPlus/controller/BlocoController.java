package com.github.davi.AchadosPlus.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.github.davi.AchadosPlus.Model.Entity.Bloco;
import com.github.davi.AchadosPlus.service.BlocoService;

@RestController
@RequestMapping("/blocos")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class BlocoController {

    private final BlocoService blocoService;

    public BlocoController(BlocoService blocoService) {
        this.blocoService = blocoService;
    }

    // Retorna todos os blocos
    @GetMapping
    public List<Bloco> getAllBlocos() {
        return blocoService.getAll();
    }
}
