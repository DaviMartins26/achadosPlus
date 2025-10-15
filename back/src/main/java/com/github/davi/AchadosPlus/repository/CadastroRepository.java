package com.github.davi.AchadosPlus.repository;

import com.github.davi.AchadosPlus.Model.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

//Jpa repository tras todas as funções de CRUD
public interface CadastroRepository extends JpaRepository<Usuario,Integer>{

    
}
