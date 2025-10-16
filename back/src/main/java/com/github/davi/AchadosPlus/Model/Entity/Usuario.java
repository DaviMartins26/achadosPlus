package com.github.davi.AchadosPlus.Model.Entity;

import com.github.davi.AchadosPlus.Model.Enums.TipoUsuario;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;
    private String nome;
    private String email;
    private String senha;
    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;

    public String getNome() {
        return nome;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public String getEmail() {
        return email;
    }
}
