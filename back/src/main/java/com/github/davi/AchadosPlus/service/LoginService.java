package com.github.davi.AchadosPlus.service;

import org.springframework.stereotype.Service;
import com.github.davi.AchadosPlus.Model.Entity.Usuario;
import com.github.davi.AchadosPlus.repository.LoginRepository;

@Service
public class LoginService {

    private final LoginRepository loginRepository;

    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public Usuario autenticar(String email, String senha) {
        return loginRepository.findByEmailAndSenha(email, senha);
    }
}
