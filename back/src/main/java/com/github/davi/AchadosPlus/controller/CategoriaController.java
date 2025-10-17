package com.github.davi.AchadosPlus.controller;

import com.github.davi.AchadosPlus.Model.Entity.Categoria;
import com.github.davi.AchadosPlus.service.CategoriaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin(origins = "*") // Permite requisições do front
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping("/categorias")
    public List<Categoria> listarCategorias() {
        return categoriaService.listarTodas();
    }
}
