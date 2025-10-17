package com.github.davi.AchadosPlus.service;

import com.github.davi.AchadosPlus.Model.Entity.Categoria;
import com.github.davi.AchadosPlus.repository.CategoriaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<Categoria> listarTodas() {
        return categoriaRepository.findAll();
    }
}
