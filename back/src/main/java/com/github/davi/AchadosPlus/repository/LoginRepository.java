package com.github.davi.AchadosPlus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.github.davi.AchadosPlus.Model.Entity.Usuario;

@Repository
public interface LoginRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByEmailAndSenha(String email, String senha);
}
