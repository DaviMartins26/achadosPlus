package com.github.davi.AchadosPlus.controller;

import com.github.davi.AchadosPlus.Model.Entity.Objeto;
import com.github.davi.AchadosPlus.Model.Entity.Protocolo;
import com.github.davi.AchadosPlus.dto.ProtocoloIdDTO;
import com.github.davi.AchadosPlus.service.ObjetoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/objetos")
public class ObjetoController {

    private final ObjetoService objetoService;

    public ObjetoController(ObjetoService objetoService) {
        this.objetoService = objetoService;
    }

    // Criação do objeto
    @PostMapping("/criar")
    public ResponseEntity<Objeto> criarObjeto(@RequestBody Objeto objeto) {
        Objeto novoObjeto = objetoService.criarObjeto(objeto);
        return ResponseEntity.ok(novoObjeto);
    }


    // Atualizar status do objeto
    @PutMapping("/{id}/status")
    public ResponseEntity<String> atualizarStatus(@PathVariable Integer id, @RequestParam int status) {
        return objetoService.buscarPorId(id)
                .map(obj -> {
                    objetoService.atualizarStatus(obj, status);
                    return ResponseEntity.ok("Status atualizado com sucesso");
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // Listar todos os objetos
    @GetMapping("/list")
    public List<Objeto> listarObjetos() {
        return objetoService.buscarTodos();
    }
}
