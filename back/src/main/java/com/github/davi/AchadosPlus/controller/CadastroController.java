package com.github.davi.AchadosPlus.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import com.github.davi.AchadosPlus.Model.Entity.Usuario;
import com.github.davi.AchadosPlus.service.CadastroService;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "*") // Permite que o HTML local acesse o backend
public class CadastroController {
    
    //infecao de dependencia
    //@Autowired ou construtor
    private final CadastroService cadastroService;

    // construtor pra referenciar, pode ser usado @Autowired em cima
    public CadastroController(CadastroService cadastroService){
        this.cadastroService = cadastroService;
    }


    //Listar
    @GetMapping
    public List<Usuario> getAll() {
        return cadastroService.getAll();
    }

    //Criar
    @PostMapping
    public Usuario create(@RequestBody Usuario user){
        return cadastroService.save(user);
    }

    
}
