package com.github.davi.AchadosPlus.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.davi.AchadosPlus.Model.Entity.Usuario;
import com.github.davi.AchadosPlus.repository.CadastroRepository;

@Service
public class CadastroService {

    private final CadastroRepository cadastroRepository;

    public CadastroService(CadastroRepository cadastroRepository){
        this.cadastroRepository = cadastroRepository;
    }


    //Listar TODOS os Usuarios // talvez de problema com o tipo de usuario.
    public List<Usuario> getAll(){
        return cadastroRepository.findAll();
    }

    //Criar usuario normal 
    public Usuario save(Usuario user){
        return cadastroRepository.save(user);
    }

    //Deletar
    public void delete(Integer id){
        cadastroRepository.deleteById(id);
    }
    
}
